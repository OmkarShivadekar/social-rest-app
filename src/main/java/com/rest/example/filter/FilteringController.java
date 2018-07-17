package com.rest.example.filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Omkar Shivadekar
 * Date : 17-Jul-2018
 * Time : 2:07:16 PM
 */

@RestController
public class FilteringController {

	@GetMapping("/filter")
	public SomeBean retriveSomeBean()
	{
		return new SomeBean("value1","value2","value3");
	}
	
	@GetMapping("/filter-list")
	public List<SomeBean> retriveListOfSomeBean()
	{
		return Arrays.asList(new SomeBean("value1","value2","value3"),
				new SomeBean("value11","value22","value33"));
	}
}


