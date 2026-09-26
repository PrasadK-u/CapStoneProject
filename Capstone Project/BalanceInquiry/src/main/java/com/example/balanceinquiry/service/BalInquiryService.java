package com.example.balanceinquiry.service;

import com.example.balanceinquiry.entity.BalInquiry;

import java.math.BigDecimal;
import java.util.List;

public interface BalInquiryService {


    public BalInquiry getAccountById(Long accountId);
    public BalInquiry getAccountByNumber(String accountNumber);
    public BigDecimal getCurrentBalance(Long accountId);
    public BalInquiry getAccountByCustomerId(Long customerId);
    public void deleteCustomerId(Long customerId);
}
