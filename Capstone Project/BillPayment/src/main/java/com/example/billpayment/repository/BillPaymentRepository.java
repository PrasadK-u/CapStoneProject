package com.example.billpayment.repository;


import com.example.billpayment.entity.BillPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillPaymentRepository extends JpaRepository<BillPaymentEntity,Long> {


    public BillPaymentEntity findByReferenceNumber(String referenceNumber);
}
