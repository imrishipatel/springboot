package com.springboot.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

//this annotation tells that employee class is an entity 
@Entity

@Table(name="employees")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@Column(name = "first_name", nullable = false)
	private String firstName; 
	
	@Column(name = "last_name")
	private String lastName; 	
	
	@Column(name = "email")
	private String email;
	
}
