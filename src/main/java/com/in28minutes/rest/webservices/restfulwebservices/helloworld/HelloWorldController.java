package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class HelloWorldController {
	
	//GET
	//URI - /hello-world
	//method - "Hello World"

	@GetMapping(path="/hello-world")
//	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	//hello-world-bean
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
//		throw new RuntimeException("Some error has happened.");
		return new HelloWorldBean("Hello World - Changed");
	}
	
	//hello-world-bean
	@GetMapping(path="/hello-world-bean/path-var/{name}")
	public HelloWorldBean helloWorldBeanPathVar(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
