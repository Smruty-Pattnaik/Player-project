package com.RegistrationForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RegistrationFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationFormApplication.class, args);
	}

}
