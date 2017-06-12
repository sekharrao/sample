package com.tandem.greetings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternalGreetingsController {

	@RequestMapping("/internal-greetings")
	public String greet(){
		return "Hello Management";
	}
}
