package com.demo.propel.prodsupport.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.demo.propel.prodsupport.exception.ResourceNotFoundException;
import com.demo.propel.prodsupport.model.LoanApplication;
import com.demo.propel.prodsupport.repository.LoanApplicationRepository;
import com.demo.propel.prodsupport.service.LoanApplicationService;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {
	
	@Autowired
	private LoanApplicationRepository loanApplicationRepository;

	@Override
	public LoanApplication getLoanApplicationById(long applicationId) {
		
		Optional<LoanApplication> loanApplication = loanApplicationRepository.findById(applicationId);
		
		
//		if(loanApplication.isPresent()) {
//			return loanApplication.get(); 
//		}
//		else {
//			throw new ResourceNotFoundException("not found"); 
//		}
		
		return loanApplication.get(); 
		
	}

}
