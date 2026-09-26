package com.example.billpayment.service;

import com.example.billpayment.entity.BillPaymentEntity;

public interface BillPaymentService {


    public BillPaymentEntity makePayment(BillPaymentEntity billPaymentEntity);
    public boolean validatePayment(BillPaymentEntity billPaymentEntity);
    public BillPaymentEntity getPaymentByReference(String referenceNumber);


}
