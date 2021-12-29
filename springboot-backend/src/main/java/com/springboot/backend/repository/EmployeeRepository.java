package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.model.Employee;



//WE do not use the @Repository annotation here since there is no need 
//as JPARepository already includes the @Repository annotation. 

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
