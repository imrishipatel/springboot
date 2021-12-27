package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
//	http://localhost:8080/student
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Rishi", "Patel");
		
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>(); 
		
		students.add(new Student("Rishi", "Patel")); 
		students.add(new Student("James", "Cordon")); 
		students.add(new Student("Daman", "Patel")); 
		students.add(new Student("Nandish", "Patel")); 
		students.add(new Student("Vasu", "Patel")); 
		
		return students; 
		
	}
	
	
//	http://localhost:8080/student/rishi/patel
	
	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName); 
	}
	
	
	
//	build a rest API to handle query parameters 
	
//	http://localhost:8080/student?firstName=Rishi&lastName=Patel
	
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName, @RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName); 
	}
	

}
