package com.rest.example.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Omkar Shivadekar
 * Date : 20-Jul-2018
 * Time : 8:30:04 PM
 */
@RestController
public class VersionController {

	
	
	//URI Versioning (used by Twitter)
	@GetMapping("v1/person")
	public PersonV1 getNameV1()
	{
		return new PersonV1("Omkar Shivadekar");
	}
	
	@GetMapping("v2/person")
	public PersonV2 getNameV2()
	{
		return new PersonV2(new Name("Omkar", "Shivadekar"));
	}
	
	//request Parameter Versioning (used by Amazon)
	@GetMapping(value="/person/param",params="version=1")
	public PersonV1 paramV1()
	{
		return new PersonV1("Omkar Shivadekar");
	}
	
	@GetMapping(value="/person/param",params="version=2")
	public PersonV2 paramV2()
	{
		return new PersonV2(new Name("Omkar", "Shivadekar"));
	}
	
	//header / custom Versioning (used by Microsoft)
	@GetMapping(value="/person/header",headers="X-API-VERSION=1")
	public PersonV1 headerV1()
	{
		return new PersonV1("Omkar Shivadekar");
	}
	
	@GetMapping(value="/person/header",headers="X-API-VERSION=2")
	public PersonV2 headerV2()
	{
		return new PersonV2(new Name("Omkar", "Shivadekar"));
	}
	
	//accept-header / MIME type / Media type / content negotiation Versioning (used by Githib)
	@GetMapping(value="/person/produces",produces="application/vnd.company.app-v1+json")
	public PersonV1 produceV1()
	{
		return new PersonV1("Omkar Shivadekar");
	}
	
	@GetMapping(value="/person/produces",produces="application/vnd.company.app-v2+json")
	public PersonV2 produceV2()
	{
		return new PersonV2(new Name("Omkar", "Shivadekar"));
	}
	
	
	
	
}
