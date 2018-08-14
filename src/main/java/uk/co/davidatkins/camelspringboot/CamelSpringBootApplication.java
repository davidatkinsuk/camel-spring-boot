package uk.co.davidatkins.camelspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelSpringBootApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CamelSpringBootApplication.class, args);

		System.in.read();

	}
}
