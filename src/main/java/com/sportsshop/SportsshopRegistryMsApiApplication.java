package com.sportsshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SportsshopRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsshopRegistryMsApiApplication.class, args);
		System.out.println("microservice are working");
	}

}
