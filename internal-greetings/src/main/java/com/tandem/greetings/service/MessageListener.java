package com.tandem.greetings.service;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import com.tandem.greetings.domain.HelloMessage;

@Service
public class MessageListener {

	private static final Logger LOGGER = Logger.getLogger(MessageListener.class);

	@StreamListener(Destination.CHANNEL_NAME)
	public void process(HelloMessage msg) {
		LOGGER.info(msg.getGreetings());
	}
}
