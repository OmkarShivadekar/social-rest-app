package com.rest.example.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rest.example.user.UserNotFoundException;

/**
 * @author Omkar Shivadekar
 * Date : 06-Jul-2018
 * Time : 5:19:30 PM
 */
@ControllerAdvice
@RestController
public class CustomizedresponseEntityExceptionHandler extends 
ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest req)
	{
		ExceptionResponse exResponse = new ExceptionResponse
				(new Date(), ex.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(exResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest req)
	{
		ExceptionResponse exResponse = new ExceptionResponse
				(new Date(), ex.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<>(exResponse,HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ExceptionResponse exResponse = new ExceptionResponse
				(new Date(), "Validation Failed", ex.getBindingResult().toString());
		

		return new ResponseEntity<>(exResponse,HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
