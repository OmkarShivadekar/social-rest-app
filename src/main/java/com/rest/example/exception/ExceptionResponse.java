package com.rest.example.exception;

import java.util.Date;

/**
 * @author Omkar Shivadekar
 * Date : 06-Jul-2018
 * Time : 5:13:59 PM
 */
public class ExceptionResponse {

	private Date timestamp;
	
	private String message;
	
	private String details;

	public ExceptionResponse(Date timestamp, String message, String details) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
	
}
