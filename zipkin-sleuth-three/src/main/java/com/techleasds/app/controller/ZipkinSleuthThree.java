package com.techleasds.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinSleuthThree {
	@Value("${server.port}")
	private int port;

	private Logger logger = LoggerFactory.getLogger(ZipkinSleuthThree.class);

	@GetMapping(value = "/zipkin-three")
	public String zipkinSleuthThree() {
		logger.info("Inside zipkinSleuthThree() method " + logger.getName());

		logger.info("existing from  zipkinSleuthTwo() method " + logger.getName());
		return "From zipkinSleuthThree()  {zipkinSleuthThree} Port "+port;
	}

}
