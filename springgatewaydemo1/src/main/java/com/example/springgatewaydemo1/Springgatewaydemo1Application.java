package com.example.springgatewaydemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Springgatewaydemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springgatewaydemo1Application.class, args);
	}

}
