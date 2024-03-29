package com.demo.propel.prodsupport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.propel.prodsupport.model.LoanApplication;
import com.demo.propel.prodsupport.service.LoanApplicationService;

@RestController
@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping("/api/v1")
public class LoanAppController {
	
	@Autowired
	private LoanApplicationService loanApplicationService;

	public LoanAppController(LoanApplicationService loanApplicationService) {
		super();
		this.loanApplicationService = loanApplicationService;
	} 
	
	
	@GetMapping("{applicationId}")
	public ResponseEntity<LoanApplication> getLoanApplicationById(@PathVariable("applicationId") long loanApplicationId){
		return new ResponseEntity<LoanApplication>(loanApplicationService.getLoanApplicationById(loanApplicationId), HttpStatus.OK);
	}
}
