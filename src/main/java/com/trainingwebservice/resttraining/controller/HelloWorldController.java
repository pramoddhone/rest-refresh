package com.trainingwebservice.resttraining.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorldWithRequest() {
		return "Hello World";
	}

}
