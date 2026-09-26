package com.example.accountstatmentgeneration.repository;

import com.example.accountstatmentgeneration.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity,String> {

    public List<TransactionEntity> findByAccountId(
            String accountId,
            LocalDate startDate,
            LocalDate endDate
    );

    /*Optional<TransactionEntity> findById(String transactionId);

    public List<TransactionEntity> findByAccountId(String accountId); */


}
