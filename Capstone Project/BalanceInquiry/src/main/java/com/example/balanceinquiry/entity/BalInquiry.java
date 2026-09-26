package com.example.balanceinquiry.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="balinquiry")
public class BalInquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="account_number")
    private String accountNumber;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "current_balance")
    private BigDecimal currentBalance;
    private String currency;
    private String status;

    public BalInquiry() {

    }

    public BalInquiry(Long id, String accountNumber, Long customerId, String accountType, BigDecimal currentBalance, String currency, String status) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
        this.currency = currency;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BalInquiry{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", customerId=" + customerId +
                ", accountType='" + accountType + '\'' +
                ", currentBalance=" + currentBalance +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}


