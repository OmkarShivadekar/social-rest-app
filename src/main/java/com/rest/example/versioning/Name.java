package com.rest.example.versioning;

/**
 * @author Omkar Shivadekar
 * Date : 20-Jul-2018
 * Time : 8:27:20 PM
 */
public class Name {
	
	private String firstName;
	
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Name() {
	}
	
	

}
