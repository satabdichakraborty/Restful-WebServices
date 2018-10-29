package com.sample.rest.webservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldContoller {
	
	//GET
	//URI    - /hello-world
	//Method - "Hello World"
	
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld(){
		return "Hello World";
	}

	//hello-world-bean
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean(){
		return new HelloWorldBean("Hello World from Bean!!");
	}
	
	//hello-world-bean
		@GetMapping(path="/hello-world-bean/path-variable/{name}")
		public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
			return new HelloWorldBean("Hello World from Bean with "+name);
		}
}
