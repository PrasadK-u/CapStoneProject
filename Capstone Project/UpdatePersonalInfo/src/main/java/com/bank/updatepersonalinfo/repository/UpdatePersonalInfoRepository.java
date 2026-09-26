package com.bank.updatepersonalinfo.repository;

import com.bank.updatepersonalinfo.entity.UpdatePersonalInfoEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UpdatePersonalInfoRepository extends JpaRepository<UpdatePersonalInfoEntity,Long> {


   Optional <UpdatePersonalInfoEntity> findByCustomerId(String customerId);

   public UpdatePersonalInfoEntity findByEmail(String email);

   public  UpdatePersonalInfoEntity findByName(String name);


    UpdatePersonalInfoEntity Id(Long id);
}
