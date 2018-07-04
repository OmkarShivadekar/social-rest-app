package com.rest.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Omkar Shivadekar
 * Date : 04-Jul-2018
 * Time : 3:11:31 PM
 */

@RestController
public class HelloWorldController {

	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
