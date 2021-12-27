package com.springboot.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWarDemoApplication {
	
	
	@GetMapping("/greeting")
	public String greeting() {
		return "Spring Boot WAR Demo"; 
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWarDemoApplication.class, args);
	}

}
