package com.bank.transactionhistoryrev.repository;

import com.bank.transactionhistoryrev.domain.TransactionType;
import com.bank.transactionhistoryrev.entity.TransactionHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionHistoryRevRepository extends JpaRepository<TransactionHistoryEntity,String> {


     // 1. Retrieve all transactions for a customer.
     //Latest transaction will be returned first.

    List<TransactionHistoryEntity> findByCustomerIdOrderByTransactionDateDesc(
            Long customerId
    );


     //2. Retrieve transactions for a customer
    //within a date range and for a specific transaction type.

    List<TransactionHistoryEntity>
    findByCustomerIdAndTransactionDateBetweenAndTransactionTypeOrderByTransactionDateDesc(
            Long customerId,
            LocalDateTime fromDate,
            LocalDateTime toDate,
            TransactionType transactionType
    );

     //3. Retrieve a specific transaction belonging to a customer.

    Optional<TransactionHistoryEntity> findByCustomerIdAndTransactionId(
            Long customerId,
            String transactionId
    );
}
