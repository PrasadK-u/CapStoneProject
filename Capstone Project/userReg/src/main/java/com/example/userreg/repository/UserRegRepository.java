package com.example.userreg.repository;

import com.example.userreg.entity.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRegRepository extends JpaRepository<UserRegister, Integer>{

    public UserRegister findByName(String name);

    List<UserRegister> name(String name);

}

