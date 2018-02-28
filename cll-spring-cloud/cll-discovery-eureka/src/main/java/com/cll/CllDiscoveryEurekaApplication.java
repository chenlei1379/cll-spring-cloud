package com.cll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CllDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CllDiscoveryEurekaApplication.class, args);
	}
}
