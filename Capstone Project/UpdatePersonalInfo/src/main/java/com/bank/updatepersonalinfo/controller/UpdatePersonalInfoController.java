package com.bank.updatepersonalinfo.controller;


import com.bank.updatepersonalinfo.entity.UpdatePersonalInfoEntity;
import com.bank.updatepersonalinfo.repository.UpdatePersonalInfoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/updatepersonalinfo")
public class UpdatePersonalInfoController {


    private final UpdatePersonalInfoRepository updatePersonalInfoRepository;

    public UpdatePersonalInfoController(UpdatePersonalInfoRepository updatePersonalInfoRepository) {
        this.updatePersonalInfoRepository = updatePersonalInfoRepository;
    }

    @GetMapping("/{customerId}")
    public Optional<UpdatePersonalInfoEntity> CustomerId(@PathVariable String customerId){

        return updatePersonalInfoRepository.findByCustomerId(customerId);
    }

    @GetMapping("/email/{email}")
    public UpdatePersonalInfoEntity findByEmail(@PathVariable String email){
        return updatePersonalInfoRepository.findByEmail(email);
    }

    @GetMapping("/name/{name}")
    public UpdatePersonalInfoEntity findByName(@PathVariable String name){
        return updatePersonalInfoRepository.findByName(name);
    }

    @PutMapping("/update/{customerId}")
    public ResponseEntity<UpdatePersonalInfoEntity> updateCustomer(
            @PathVariable String customerId,
            @RequestBody UpdatePersonalInfoEntity customerUpdate) {

        UpdatePersonalInfoEntity existingCustomer =
                updatePersonalInfoRepository.findByCustomerId(customerId)
                        .orElseThrow(() -> new RuntimeException("Customer not found"));

        existingCustomer.setName(customerUpdate.getName());
        existingCustomer.setEmail(customerUpdate.getEmail());
        existingCustomer.setAddress(customerUpdate.getAddress());

        UpdatePersonalInfoEntity updatedCustomer =
                updatePersonalInfoRepository.save(existingCustomer);

        return ResponseEntity.ok(updatedCustomer);
    }
}
