package com.techleasds.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinSleuthTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinSleuthTwoApplication.class, args);
	}

}
