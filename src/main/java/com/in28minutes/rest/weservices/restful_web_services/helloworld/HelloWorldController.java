package com.in28minutes.rest.weservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// EXPOSE REST aPI
@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;
	// /hello-world
	// "Hello World"
	
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
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
	//path variable
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean("Hello World " + name);
	}
	
	//		1:good.morning.message
			//2:
//			- Example: `en` - English (Good Morning)
//			- Example: `nl` - Dutch (Goedemorgen)
//			- Example: `fr` - French (Bonjour)
//			- Example: `de` - Deutsch (Guten Morgen)

	
	@GetMapping("/hello-world-internationalized")
	public String helloWorldInternationalized()
	{
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null,"Default Message", locale);
		
	}
}
