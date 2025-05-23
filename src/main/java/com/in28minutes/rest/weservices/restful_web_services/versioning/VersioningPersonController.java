package com.in28minutes.rest.weservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson()
	{
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson()
	{
		return new PersonV2(new Name("Bob","Charlie"));
	}
	
	@GetMapping(path="/person", params="version=1") //localhost:8080/person?version=1
	public PersonV1 getFirstVersionOfPersonReqParam()
	{
		return new PersonV1("Bob Charlie");
	}
	

	@GetMapping(path="/person", params="version=2") //localhost:8080/person?version=2
	public PersonV2 getSecondVersionOfPersonReqParam()
	{
		return new PersonV2(new Name("Bob","Charlie"));
	}
	
	@GetMapping(path="/person/header", headers="X-API-VERSION=1") 
	public PersonV1 getFirstVersionOfPersonReqHeader()
	{
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path="/person/header", headers="X-API-VERSION=2")
	public PersonV2 getSecondVersionOfPersonReqHeader()
	{
		return new PersonV2(new Name("Bob","Charlie"));
	}
	
	
	@GetMapping(path="/person/accept", produces="application/vnd.company.app-v1+json") 
	public PersonV1 getFirstVersionOfPersonAcceptHeader()
	{
		return new PersonV1("Bob Charlie");
	}
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public PersonV2 getSecondVersionOfPersonAcceptHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
