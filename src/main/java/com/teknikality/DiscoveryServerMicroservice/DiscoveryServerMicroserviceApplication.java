package com.teknikality.DiscoveryServerMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerMicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(DiscoveryServerMicroserviceApplication.class, args);
	}

}
