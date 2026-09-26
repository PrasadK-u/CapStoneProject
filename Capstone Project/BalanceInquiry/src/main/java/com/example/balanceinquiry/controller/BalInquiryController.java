package com.example.balanceinquiry.controller;


import com.example.balanceinquiry.entity.BalInquiry;
import com.example.balanceinquiry.service.BalInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/balance")
public class BalInquiryController {

    @Autowired private BalInquiryService balInquiryService;
    // Get account by ID
    @GetMapping("/account/{accountId}")
    public BalInquiry getAccountById( @PathVariable Long accountId) {
        return balInquiryService.getAccountById(accountId);
    }
    // Get account by account number
    @GetMapping("/account-number/{accountNumber}")
    public BalInquiry getAccountByNumber( @PathVariable String accountNumber) {
        return balInquiryService.getAccountByNumber(accountNumber);
    }
    // Get current balance
    @GetMapping("/account/{accountId}/current-balance")
    public BigDecimal getCurrentBalance( @PathVariable Long accountId) {
        return balInquiryService.getCurrentBalance(accountId);
    }
    // Get account by customer ID
    @GetMapping("/customer/{customerId}")
    public BalInquiry getAccountByCustomerId( @PathVariable Long customerId) {
        BalInquiry balance =balInquiryService.getAccountByCustomerId(customerId);
        return balance;
    }
    // Delete all accounts for customer
    @DeleteMapping("/customer/{customerId}")
    public String deleteCustomerId( @PathVariable Long customerId) {
        balInquiryService.deleteCustomerId(customerId);
        return "Customer accounts deleted successfully";
    }
}