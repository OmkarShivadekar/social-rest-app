package com.rest.example.versioning;

/**
 * @author Omkar Shivadekar
 * Date : 20-Jul-2018
 * Time : 8:26:27 PM
 */
public class PersonV2 {

	private Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public PersonV2(Name name) {
		this.name = name;
	}

	public PersonV2() {
	}
	
	
}
