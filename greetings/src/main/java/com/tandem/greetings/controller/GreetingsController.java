package com.tandem.greetings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tandem.greetings.domain.HelloMessage;
import com.tandem.greetings.integration.MessageProcessor;

@RestController
public class GreetingsController {

	@Autowired
	MessageProcessor processor;

	private MessageChannel output;

	@Autowired
	public GreetingsController(MessageChannel output) {
		this.output = output;
	}

	@RequestMapping("/greetings")
	public String sayHello() {
		return "Hello World";
	}

	@RequestMapping("/helloInternal")
	public String callInteralService() {
		return new RestTemplate().getForObject("http://localhost:8080/internal-greetings", String.class);
	}

	@RequestMapping("/sendMessage")
	public HelloMessage sendMessage() throws InterruptedException {
		HelloMessage greetingMsg = new HelloMessage("Hello from pub/sub channel.");

		output.send(MessageBuilder.withPayload(greetingMsg).build());

		//TODO : need to revisit.
		// Wait for response in milliseconds.
		Thread.sleep(500);

		return processor.getResponse();
	}

}
