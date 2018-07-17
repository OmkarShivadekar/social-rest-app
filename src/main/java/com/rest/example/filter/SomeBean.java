package com.rest.example.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Omkar Shivadekar
 * Date : 17-Jul-2018
 * Time : 2:37:43 PM
 */
@JsonIgnoreProperties(value= {"value1"}) //2nd way
public class SomeBean {

	private String value1;
	private String value2;
	@JsonIgnore //1st way useful
	private String value3;

	
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public String getValue3() {
		return value3;
	}
	public void setValue3(String value3) {
		this.value3 = value3;
	}
	public SomeBean(String value1, String value2, String value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	
	public SomeBean() {
	}
}
