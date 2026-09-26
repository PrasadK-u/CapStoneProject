package com.example.fundtransfer.repository;

import com.example.fundtransfer.entity.FundTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FundTransferRepository extends JpaRepository<FundTransfer,Long> {


    public FundTransfer findByTransactionReference(String transactionReference);
}
