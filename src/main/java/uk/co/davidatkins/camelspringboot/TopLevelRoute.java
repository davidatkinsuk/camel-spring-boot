package uk.co.davidatkins.camelspringboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TopLevelRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("timer:hello?period={{timer.period}}")
                .routeId("topLevel")
                .routeGroup("testRoutes")
                .setBody(constant("hello there"))
                .to("direct:logging");
    }

}