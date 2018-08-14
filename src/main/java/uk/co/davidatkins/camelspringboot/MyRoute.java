package uk.co.davidatkins.camelspringboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("timer:hello?period={{timer.period}}")
                .routeId("hello")
                .routeGroup("testRoutes")
                .log("Hi");
    }

}