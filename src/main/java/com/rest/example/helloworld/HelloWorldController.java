package com.rest.example.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Omkar Shivadekar
 * Date : 04-Jul-2018
 * Time : 3:11:31 PM
 */

@RestController
public class HelloWorldController {

	
	@Autowired
	private MessageSource messageSource; 
	
	//URI - /hello-world
	
	@GetMapping("/hello-world")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}

	@GetMapping("/hello-world/var/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World "+name));
	}
	
	
	@GetMapping("/hello-world-in18n")
	public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required=false) Locale locale)
	{
		
		return messageSource.getMessage("good.morning.message",null,locale);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
