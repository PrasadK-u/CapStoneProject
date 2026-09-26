package com.example.accountstatmentgeneration.repository;

import com.example.accountstatmentgeneration.entity.AccountStmGenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AccountStmGenRepository extends JpaRepository<AccountStmGenEntity,String> {

    /*public AccountStmGenEntity save(String statementId);

    Optional<AccountStmGenEntity> findById(String statementId);*/

    public List<AccountStmGenEntity> findByCustomerId(String customerId);
}