package com.rest.example.versioning;

/**
 * @author Omkar Shivadekar
 * Date : 20-Jul-2018
 * Time : 8:25:23 PM
 */
public class PersonV1 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonV1(String name) {
		this.name = name;
	}

	public PersonV1() {
	}
	
	
}
