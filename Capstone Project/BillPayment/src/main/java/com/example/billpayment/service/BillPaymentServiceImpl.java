package com.example.billpayment.service;


import com.example.billpayment.entity.BillPaymentEntity;
import com.example.billpayment.repository.BillPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillPaymentServiceImpl implements BillPaymentService{

    @Autowired
    private BillPaymentRepository billPaymentRepository;

    @Override
    public BillPaymentEntity makePayment(BillPaymentEntity billPaymentEntity) {
        return billPaymentRepository.save(billPaymentEntity);
    }
    @Override
    public boolean validatePayment(BillPaymentEntity billPaymentEntity) {
        return billPaymentEntity != null
                && billPaymentEntity.getCustomerAccountNumber() != null
                && billPaymentEntity.getBillerName() != null
                && billPaymentEntity.getReferenceNumber() != null;
    }

    @Override
    public BillPaymentEntity getPaymentByReference(String referenceNumber) {
        return billPaymentRepository.findByReferenceNumber(referenceNumber);
    }
}
