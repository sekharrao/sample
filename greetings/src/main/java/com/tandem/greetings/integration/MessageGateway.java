package com.tandem.greetings.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.tandem.greetings.domain.HelloMessage;

@MessagingGateway
public interface MessageGateway {
	@Gateway(requestChannel = Source.CHANNEL_NAME)
	void generate(HelloMessage msg);
}
