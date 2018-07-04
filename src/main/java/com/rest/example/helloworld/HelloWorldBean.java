package com.rest.example.helloworld;

/**
 * @author Omkar Shivadekar
 * Date : 04-Jul-2018
 * Time : 3:18:54 PM
 */

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}
	
	
}
