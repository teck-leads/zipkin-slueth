package com.techleasds.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipkinSleuthOne {
	@Value("${server.port}")
	private int port;

	private Logger logger=LoggerFactory.getLogger(ZipkinSleuthOne.class);
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/zipkin-one")
	public String zipkinSleuthOne() {
		logger.info("Inside zipkinSleuthOne() method "+logger.getName());
		logger.info("Before calling ZipkinSleuthTwo");
		String forObject = restTemplate.getForObject("http://localhost:8084/zipkin-two", String.class);
		logger.info("Exited from ZipkinSleuthTwo");
		logger.info("existing from  zipkinSleuthOne() method "+logger.getName());
		return "From zipkinSleuthOne {from ZipkinSleuthTwo}: "+forObject+" {zipkinSleuthOne port} "+port;
	}
	
	
	
	
	 
}
