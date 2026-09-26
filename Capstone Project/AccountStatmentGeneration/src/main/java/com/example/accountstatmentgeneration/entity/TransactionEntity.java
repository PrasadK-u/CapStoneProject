package com.example.accountstatmentgeneration.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "tabletran")
public class TransactionEntity {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;
    @Column(name = "account_Id")
    private String accountId;
    @Column(name = "transaction_date")
    private Date transactionDate;
    private double amount;
    @Column(name = "transaction_type")
    private String transactionType;
    private double balance;
}
