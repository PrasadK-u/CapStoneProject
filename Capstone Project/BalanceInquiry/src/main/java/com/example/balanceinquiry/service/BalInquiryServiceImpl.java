package com.example.balanceinquiry.service;

import com.example.balanceinquiry.entity.BalInquiry;
import com.example.balanceinquiry.repository.BalInquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BalInquiryServiceImpl implements BalInquiryService{


    @Autowired
    private BalInquiryRepository balInquiryRepository;


    @Override
    public BalInquiry getAccountById(Long accountId) {
        return balInquiryRepository.findById(accountId).orElseThrow(() -> new RuntimeException("Account id not Found"));
    }

    @Override
    public BalInquiry getAccountByNumber(String accountNumber) {
        return balInquiryRepository.findByAccountNumber(accountNumber).orElseThrow(() -> new RuntimeException("Account number not Found" ));
    }

    @Override
    public BigDecimal getCurrentBalance(Long accountId) {
        BalInquiry inquiry = balInquiryRepository.findById(accountId).orElseThrow(()->new RuntimeException("Account not Found"));
        return inquiry.getCurrentBalance();
    }

    @Override
    public BalInquiry getAccountByCustomerId(Long customerId) {
        return balInquiryRepository.findByCustomerId(customerId);
    }

    @Override
    public void deleteCustomerId(Long customerId) {
            balInquiryRepository.deleteByCustomerId(customerId);
    }
}
