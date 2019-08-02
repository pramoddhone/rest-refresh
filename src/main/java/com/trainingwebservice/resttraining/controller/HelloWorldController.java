package com.trainingwebservice.resttraining.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trainingwebservice.resttraining.pojo.HelloBean;

@RestController
public class HelloWorldController {
	/**
	 * using GetMapping
	 * @return
	 */
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	/**
	 * using RequestMapping
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorldWithRequest() {
		return "Hello";
	}
	
	/**
	 * using GetMapping and with POJO
	 * @return
	 */
	@GetMapping(path = "/hello-bean")
	public HelloBean helloWorldBean() {
		return new HelloBean("Pramod", "Welcome to REST API");
	}

}
