package com.tandem.greetings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tandem.greetings.domain.HelloMessage;
import com.tandem.greetings.integration.MessageGateway;

@RestController
public class GreetingsController {
	
	@Autowired
	MessageGateway gateway;
	
	@RequestMapping("/greetings")
	public String sayHello(){
		return "Hello World";
	}
	
	@RequestMapping("/helloInternal")
	public String callInteralService(){
		return new RestTemplate().getForObject("http://localhost:8080/internal-greetings", String.class);
	}
	
	@RequestMapping("/sendMessage")
	public HelloMessage sendMessage(){
		HelloMessage greetingMsg = new HelloMessage("Hello from pub/sub channel.");
		gateway.generate(greetingMsg);
		return greetingMsg;
	}

}

