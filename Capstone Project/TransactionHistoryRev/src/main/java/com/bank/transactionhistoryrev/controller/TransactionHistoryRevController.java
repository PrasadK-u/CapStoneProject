package com.bank.transactionhistoryrev.controller;


import com.bank.transactionhistoryrev.domain.TransactionType;
import com.bank.transactionhistoryrev.entity.TransactionHistoryEntity;
import com.bank.transactionhistoryrev.repository.TransactionHistoryRevRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/transactionreview")
public class TransactionHistoryRevController {


    private final TransactionHistoryRevRepository transactionHistoryRevRepository;

    public TransactionHistoryRevController(TransactionHistoryRevRepository transactionHistoryRevRepository) {
        this.transactionHistoryRevRepository = transactionHistoryRevRepository;
    }
    // 1. Get complete transaction history
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<TransactionHistoryEntity>> getTransactionHistory(
            @PathVariable Long customerId) {

        List<TransactionHistoryEntity> transactions =
                transactionHistoryRevRepository
                        .findByCustomerIdOrderByTransactionDateDesc(
                                customerId
                        );

        return ResponseEntity.ok(transactions);
    }

    // 2. Filter transactions by date range and transaction type
    @GetMapping("/customer/{customerId}/filter")
    public ResponseEntity<List<TransactionHistoryEntity>> filterTransactions(
            @PathVariable Long customerId,

            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
            LocalDateTime fromDate,

            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
            LocalDateTime toDate,

            @RequestParam
            TransactionType transactionType) {

        List<TransactionHistoryEntity> transactions =
                transactionHistoryRevRepository
                        .findByCustomerIdAndTransactionDateBetweenAndTransactionTypeOrderByTransactionDateDesc(
                                customerId,
                                fromDate,
                                toDate,git
                                transactionType
                        );

        return ResponseEntity.ok(transactions);
    }

    // 3. Get details of a specific transaction
    @GetMapping("/customer/{customerId}/{transactionId}")
    public ResponseEntity<TransactionHistoryEntity> getTransactionDetails(
            @PathVariable Long customerId,
            @PathVariable String transactionId) {

        return transactionHistoryRevRepository
                .findByCustomerIdAndTransactionId(
                        customerId,
                        transactionId
                )
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }



}

