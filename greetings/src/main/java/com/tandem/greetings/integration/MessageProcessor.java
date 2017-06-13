package com.tandem.greetings.integration;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

import com.tandem.greetings.domain.HelloMessage;

@EnableBinding(Processor.class)
public class MessageProcessor {
	
	private HelloMessage response;
	
	@StreamListener(Processor.INPUT)
	public void receiveMessage(HelloMessage resp){
		setResponse(resp);
	}
	
	public HelloMessage getResponse(){
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(HelloMessage response) {
		this.response = response;
	}
	
}
