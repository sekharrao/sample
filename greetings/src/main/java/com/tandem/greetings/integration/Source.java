package com.tandem.greetings.integration;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Source {
	
	String CHANNEL_NAME = "greetingChannel";

    @Output
    MessageChannel greetingChannel();

}
