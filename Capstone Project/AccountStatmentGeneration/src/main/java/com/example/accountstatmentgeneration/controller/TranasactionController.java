package com.example.accountstatmentgeneration.controller;

import com.example.accountstatmentgeneration.entity.TransactionEntity;
import com.example.accountstatmentgeneration.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TranasactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    // Get transactions for an account within a date range
    @GetMapping("/account/{accountId}/{startDate}/{endDate}")
    public ResponseEntity<List<TransactionEntity>> getTransactions(
            @PathVariable String accountId,
            @PathVariable LocalDate startDate,
            @PathVariable  LocalDate endDate) {

        List<TransactionEntity> transactions =
                transactionRepository.findByAccountId(
                        accountId,
                        startDate,
                        endDate
                );

        return ResponseEntity.ok(transactions);
    }
}
