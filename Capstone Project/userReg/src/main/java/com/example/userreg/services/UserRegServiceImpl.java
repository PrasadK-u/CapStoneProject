package com.example.userreg.services;

import com.example.userreg.entity.UserRegister;
import com.example.userreg.repository.UserRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserRegServiceImpl implements UserRegService{

    @Autowired
    private UserRegRepository userRegRepository;

    @Override
    public UserRegister saveRegistration(UserRegister userRegistration) {
        return userRegRepository.save(userRegistration);
    }

    @Override
    public UserRegister updateRegistration(UserRegister userRegistration) {
        return userRegRepository.save(userRegistration);
    }

    @Override
    public void deleteRegistration(UserRegister userRegistration) {
            userRegRepository.delete(userRegistration);
    }

    @Override
    public UserRegister findByName(String name) {
        return userRegRepository.findByName(name);
    }

    @Override
    public List<UserRegister> findAll() {
        return userRegRepository.findAll();
    }

    @Override
    public UserRegister findById(int id) {
        return userRegRepository.findById(id).orElse(null);
    }
}
