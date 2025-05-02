package com.niladri.accounts.microservices_account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@OpenAPIDefinition(info = @Info(title = "Accounts microservice REST API Documentation", description = " Accounts microservice REST API Documentation", version = "v1", contact = @Contact(name = "Niladri Sen", email = "senniladri62@gmail.com"), license = @License(name = "Apache 2.0", url = "https://www.niladrisen.com")), externalDocs = @ExternalDocumentation(description = "Accounts microservice REST API Documentation"))
public class MicroservicesAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesAccountApplication.class, args);
	}

}
