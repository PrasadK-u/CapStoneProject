package com.example.balanceinquiry.repository;

import com.example.balanceinquiry.entity.BalInquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BalInquiryRepository extends JpaRepository<BalInquiry, Long> {


     Optional<BalInquiry> findByAccountNumber(String accountNumber);
     BalInquiry findByCustomerId(Long customerId);


     void deleteByCustomerId(Long customerId);
}
