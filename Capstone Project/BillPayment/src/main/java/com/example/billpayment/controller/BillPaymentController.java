package com.example.billpayment.controller;


import com.example.billpayment.entity.BillPaymentEntity;
import com.example.billpayment.service.BillPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class BillPaymentController {

    @Autowired
    private BillPaymentService billPaymentService;

    @PostMapping("/")
    public BillPaymentEntity makePayment(@RequestBody BillPaymentEntity billPaymentEntity) {
        if (!billPaymentService.validatePayment(billPaymentEntity)) {
            throw new IllegalArgumentException("Invalid payment details");
        } return billPaymentService.makePayment(billPaymentEntity);
    }
    @GetMapping("/{referenceNumber}")
    public BillPaymentEntity getPaymentByReference( @PathVariable String referenceNumber) {
        return billPaymentService.getPaymentByReference(referenceNumber);
    }
}

