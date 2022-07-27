package com.microservice.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringBoot2MicrservicesService02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2MicrservicesService02Application.class, args);
		System.out.println("Server started -02");
	}

}
