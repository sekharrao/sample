package com.tandem.greetings.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloMessage {
	
	private String greetings;
	
	@JsonCreator
	public HelloMessage(@JsonProperty("greetings") String greetings){
		this.greetings = greetings;
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

}
