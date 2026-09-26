package com.example.fundtransfer.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="fund_transfer")
public class FundTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sender_accnum")
    private String senderAccountNumber;
    @Column(name = "receiver_accnum")
    private String receiverAccountNumber;
    private BigDecimal amount;
    @Column(name = "transaction_reference")
    private String transactionReference;
    private String status;


    public FundTransfer(){

    }

    public FundTransfer(Long id, String senderAccountNumber, String receiverAccountNumber, BigDecimal amount, String transactionReference, String status) {
        this.id = id;
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.amount = amount;
        this.transactionReference = transactionReference;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(String senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(String receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FundTransfer{" +
                "id=" + id +
                ", senderAccountNumber='" + senderAccountNumber + '\'' +
                ", receiverAccountNumber='" + receiverAccountNumber + '\'' +
                ", amount=" + amount +
                ", transactionReference='" + transactionReference + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
