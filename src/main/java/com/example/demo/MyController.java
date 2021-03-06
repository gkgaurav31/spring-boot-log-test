package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	Logger logger = LoggerFactory.getLogger(MyController.class);

	@GetMapping("/")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/log")
	public String log() {
		
		System.out.println("This is SOP test message");
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");

		return "Howdy! Check out the Logs to see the output...";
	}


}
