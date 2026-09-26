package com.example.billpayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bill_payment")
public class BillPaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "customer_accnum")
    private String customerAccountNumber;
    @Column(name = "biller_name")
    private String billerName;
    @Column(name ="reference_num")
    private String referenceNumber;
    private String status;

    public BillPaymentEntity(){

    }

    public BillPaymentEntity(Long id, String customerAccountNumber, String billerName, String referenceNumber, String status) {
        this.id = id;
        this.customerAccountNumber = customerAccountNumber;
        this.billerName = billerName;
        this.referenceNumber = referenceNumber;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber(String customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BillPaymentEntity{" +
                "id=" + id +
                ", customerAccountNumber='" + customerAccountNumber + '\'' +
                ", billerName='" + billerName + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
