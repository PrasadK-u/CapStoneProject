package com.example.accountstatmentgeneration.controller;

import com.example.accountstatmentgeneration.entity.AccountStmGenEntity;
import com.example.accountstatmentgeneration.repository.AccountStmGenRepository;
import com.example.accountstatmentgeneration.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statement")
public class AccountStaGenController {

    @Autowired
    private AccountStmGenRepository accountStmGenRepository;

    @PostMapping("/")
    public ResponseEntity<AccountStmGenEntity> saveStatement(
            @RequestBody AccountStmGenEntity statement) {

        AccountStmGenEntity savedStatement =
                accountStmGenRepository.save(statement);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedStatement);
    }

    // Get statement by statement ID
    @GetMapping("/{statementId}")
    public ResponseEntity<AccountStmGenEntity> getStatementById(
            @PathVariable String statementId) {

        return accountStmGenRepository.findById(statementId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get all statements for a customer
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<AccountStmGenEntity>> getStatementsByCustomer(
            @PathVariable String customerId) {

        List<AccountStmGenEntity> statements =
                accountStmGenRepository.findByCustomerId(customerId);

        return ResponseEntity.ok(statements);
    }



}
