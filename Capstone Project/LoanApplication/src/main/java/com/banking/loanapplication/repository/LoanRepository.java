package com.banking.loanapplication.repository;

import com.banking.loanapplication.entity.LoanAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoanRepository extends JpaRepository<LoanAppEntity,Long> {

    // 1. Find an application using its reference number
    Optional<LoanAppEntity> findByReferenceNumber(String referenceNumber);

    // 2. Find all applications submitted by a customer
    List<LoanAppEntity> findByCustomerId(Long customerId);

    // 3. Check whether a customer already has an application
    boolean existsByCustomerIdAndStatus(Long customerId, String status);
}
