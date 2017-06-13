package com.tandem.greetings.service;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

import com.tandem.greetings.domain.HelloMessage;

@EnableBinding(Processor.class)
public class MessageProcessor {

	private static final Logger LOGGER = Logger.getLogger(MessageProcessor.class);

	@StreamListener(Processor.INPUT) @SendTo(Processor.OUTPUT)
	public HelloMessage process(HelloMessage msg) {
		LOGGER.info(msg.getGreetings());
		msg.setGreetings("Hi, from internal service.");
		return msg;
	}
}
