package uk.co.davidatkins.camelspringboot;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class LoggingRoute extends RouteBuilder {

    public static final String DIRECT_IN = "direct:logging";

    @Override
    public void configure() {
        from(DIRECT_IN)
                .routeId("loggingRoute")
                .routeGroup("testRoutes")
                .setBody(simple("The timer name is '${headers." + Exchange.TIMER_NAME + "}'"))
                .to("stream:out");
    }

}