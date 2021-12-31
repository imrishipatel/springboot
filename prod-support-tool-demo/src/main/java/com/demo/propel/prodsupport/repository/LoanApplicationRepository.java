package com.demo.propel.prodsupport.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.propel.prodsupport.model.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

}
