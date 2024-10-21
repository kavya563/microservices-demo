package com.example.springgatewaydemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Springgatewaydemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springgatewaydemo2Application.class, args);
	}

}
