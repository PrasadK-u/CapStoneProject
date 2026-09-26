package com.example.fundtransfer.service;

import com.example.fundtransfer.entity.FundTransfer;
import com.example.fundtransfer.repository.FundTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundTransferServiceImpl implements FundTransferService {

    @Autowired
    private FundTransferRepository fundTransferRepository;

    @Override
    public FundTransfer getTransferById(Long id) {

        return fundTransferRepository.findById(id).orElse(null);
    }

    @Override
    public FundTransfer getTransferByReference(String transactionReference) {
        return fundTransferRepository.findByTransactionReference(transactionReference);
    }
}
