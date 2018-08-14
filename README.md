# camel-spring-boot

This is a customised version of the camel spring boot example - https://github.com/apache/camel/tree/master/examples/camel-example-spring-boot

I'm currently starting the application directly in Intellij (by running CamelSpringBootApplication)

Because actuator dependencies have been added in the POM, you can get general stats by visiting

     http://localhost:8080/actuator/health

You can get camel specific stats by visiting

     http://localhost:8080/actuator/camelroutes
