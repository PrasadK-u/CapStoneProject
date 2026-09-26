package com.banking.loanapplication.controller;

import com.banking.loanapplication.LoanApplication;
import com.banking.loanapplication.entity.LoanAppEntity;
import com.banking.loanapplication.repository.LoanRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/loanapp")
public class LoanAppController {


    private final LoanRepository loanRepository;

    public LoanAppController(LoanRepository loanRepository) {

        this.loanRepository = loanRepository;
    }


    // 1. Find an application using its reference number
    @GetMapping("/reference/{referenceNumber}")
    public Optional<LoanAppEntity> findByReferenceNumber(
            @PathVariable String referenceNumber) {

        return loanRepository.findByReferenceNumber(referenceNumber);
    }

    // 2. Find all applications submitted by a customer
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<LoanAppEntity>> findByCustomerId(
            @PathVariable Long customerId) {

        List<LoanAppEntity> applications =
                loanRepository.findByCustomerId(customerId);

        return ResponseEntity.ok(applications);
    }

    // 3. Check whether a customer already has an application with a status
    @GetMapping("/customer/{customerId}/exists/{status}")
    public ResponseEntity<Boolean> existsByCustomerIdAndStatus(
            @PathVariable Long customerId,
            @PathVariable String status) {

        boolean exists =
                loanRepository
                        .existsByCustomerIdAndStatus(customerId, status);

        return ResponseEntity.ok(exists);
    }


}
