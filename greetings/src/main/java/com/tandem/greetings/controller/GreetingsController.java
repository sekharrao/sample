package com.tandem.greetings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingsController {
	
	@RequestMapping("/greetings")
	public String sayHello(){
		return "Hello World";
	}
	
	@RequestMapping("/helloInternal")
	public String callInteralService(){
		return new RestTemplate().getForObject("http://localhost:8080/internal-greetings", String.class);
	}

}

