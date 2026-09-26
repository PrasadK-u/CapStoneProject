package com.example.fundtransfer.service;

import com.example.fundtransfer.entity.FundTransfer;


public interface FundTransferService {



    public FundTransfer getTransferById(Long id);
    public FundTransfer getTransferByReference(String transactionReference);

}
