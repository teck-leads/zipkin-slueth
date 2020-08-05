package com.techleasds.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipkinSleuthTwo {

	private Logger logger=LoggerFactory.getLogger(ZipkinSleuthTwo.class);
	@Autowired
	private RestTemplate restTemplate;
	@Value("${server.port}")
	private int port;
	
	@GetMapping(value = "/zipkin-two")
	public String zipkinSleuthTwo() {
		logger.info("Inside zipkinSleuthTwo() method "+logger.getName());
		logger.info("Before calling App Three");
		String forObject = restTemplate.getForObject("http://localhost:8085/zipkin-three", String.class);
		logger.info("Exited from App Three");
		logger.info("existing from  zipkinSleuthTwo() method "+logger.getName());
		return "From zipkinSleuthTwo() {from AppThree} "+forObject+" zipkinSleuthTwo "+port;
	}
	
	
	
	
	 
}
