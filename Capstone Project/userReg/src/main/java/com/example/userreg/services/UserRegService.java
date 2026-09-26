package com.example.userreg.services;

import com.example.userreg.entity.UserRegister;

import java.util.List;

public interface UserRegService {

    public UserRegister saveRegistration(UserRegister userRegistration);
    public UserRegister updateRegistration(UserRegister userRegistration);
    public void deleteRegistration(UserRegister userRegistration);
    public UserRegister findByName(String name);
    public List<UserRegister> findAll();
    public UserRegister findById(int id);
}
