package com.springboot.first.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//This controller can handle REST API request 
//THis is done by using the @RestController annotation
//@RestController annotation can handle HTTP GET, POST, DELETE methods


@RestController
public class HelloWorldController {
	
	
	//This Rest API will handle HTTP GET METHOD 
	
	//http://localhost:8080/hello-world
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello!"; 
	}
	
	
	
	
	

}
