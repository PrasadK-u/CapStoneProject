package com.example.accountlogin.repository;

import com.example.accountlogin.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, Integer> {

   public Optional<Login> findByEmailAndPassword(String email, String Password);


}
