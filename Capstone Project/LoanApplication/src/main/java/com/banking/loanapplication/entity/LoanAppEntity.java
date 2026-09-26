package com.banking.loanapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoanAppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerId;
    private BigDecimal amount;
    private String purpose;
    private String status;
    @Column(name = "reference_number")
    private String referenceNumber;



}
