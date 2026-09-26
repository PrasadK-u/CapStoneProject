package com.example.accountlogin.service;

import com.example.accountlogin.entity.Login;

import java.util.List;

public interface LoginService {

    public Login login(String email,String password);
    public List<Login> findAll();
    public Login updateLogin(int id, String email, String password);


}
