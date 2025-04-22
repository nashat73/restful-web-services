package com.in28minutes.rest.weservices.restful_web_services.helloworld;

public class HelloWorldBean {

	private Object message;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
