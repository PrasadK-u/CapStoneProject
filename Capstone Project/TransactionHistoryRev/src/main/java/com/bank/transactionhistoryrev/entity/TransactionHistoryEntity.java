package com.bank.transactionhistoryrev.entity;

import com.bank.transactionhistoryrev.domain.TransactionStatus;
import com.bank.transactionhistoryrev.domain.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionHistoryEntity {

    @Id
    private String transactionId;
    @Column(name = "customer_id")
    private Long customerId;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    @Column(name = "Trasaction_type")
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;
    private String description;
    @Column(name = "reference_number")
    private String referenceNumber;



}
