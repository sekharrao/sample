package com.tandem.greetings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	
	@RequestMapping("/greetings")
	public String sayHello(){
		return "Hello World";
	}

}

