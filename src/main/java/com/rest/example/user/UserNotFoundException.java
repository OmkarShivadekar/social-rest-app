package com.rest.example.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Omkar Shivadekar
 * Date : 06-Jul-2018
 * Time : 5:03:55 PM
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String arg0) {
		super(arg0);
	}

	
	
}
