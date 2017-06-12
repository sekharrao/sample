package com.tandem.greetings.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface Destination {
	String CHANNEL_NAME = "greetingChannel";
	
	@Input
	SubscribableChannel greetingChannel();
}
