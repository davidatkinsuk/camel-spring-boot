package uk.co.davidatkins.camelspringboot;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class LoggingRouteTest extends CamelTestSupport {

    @EndpointInject(uri = "mock:log:foo")
    private MockEndpoint mock;

    @Override
    protected RoutesBuilder createRouteBuilder() {
        return new LoggingRoute();
    }

    @Override
    public String isMockEndpoints() {
        return "stream:out";
    }

    @Test
    public void invokeRoute() throws Exception {

        MockEndpoint mockEndpoint = getMockEndpoint("mock:stream:out");
        mockEndpoint.expectedBodiesReceived("The timer name is 'myTimer'");

        template().sendBodyAndHeader(LoggingRoute.DIRECT_IN,"Hello", Exchange.TIMER_NAME,"myTimer");

        mockEndpoint.assertIsSatisfied();

    }

}
