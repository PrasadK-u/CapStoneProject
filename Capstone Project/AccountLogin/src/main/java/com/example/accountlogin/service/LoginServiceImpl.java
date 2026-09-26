package com.example.accountlogin.service;

import com.example.accountlogin.entity.Login;
import com.example.accountlogin.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginRepository loginRepository;



    @Override
    public Login updateLogin(int id, String email, String password) {

        Login login = loginRepository.findById(id).orElse(null);

        if (login != null) {

            login.setEmail(email);
            login.setPassword(password);

            return loginRepository.save(login);
        }

        return null;
    }

    @Override
    public Login login(String email, String password) {
        return loginRepository.findByEmailAndPassword(email,password).orElse(null);
    }

    @Override
    public List<Login> findAll() {
        return loginRepository.findAll();
    }


}
