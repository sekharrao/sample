package com.tandem.greetings.domain;

public class HelloMessage {
	
	private String greetings;
	
	public HelloMessage(String greetings){
		this.greetings = greetings;
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

}
