package com.sample.rest.webservice.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean() {

	}

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("HelloWorldBean : " + message);
	}

}
