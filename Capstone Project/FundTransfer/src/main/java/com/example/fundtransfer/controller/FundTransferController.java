package com.example.fundtransfer.controller;

import com.example.fundtransfer.entity.FundTransfer;
import com.example.fundtransfer.service.FundTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fund-transfer")
public class FundTransferController {


        @Autowired
        private final FundTransferService fundTransferService;

        public FundTransferController(FundTransferService fundTransferService) {
            this.fundTransferService = fundTransferService;
        }

        @GetMapping("/{id}")
        public FundTransfer getTransferById(@PathVariable Long id) {

            FundTransfer transferId = fundTransferService.getTransferById(id);
            return transferId;
        }

        @GetMapping("/reference/{transactionReference}")
        public FundTransfer getTransferByReference(@PathVariable String transactionReference) {

            FundTransfer transfer =
                    fundTransferService.getTransferByReference(transactionReference);

            return transfer;
        }
    }


