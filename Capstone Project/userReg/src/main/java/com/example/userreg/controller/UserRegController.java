package com.example.userreg.controller;

import com.example.userreg.entity.UserRegister;
import com.example.userreg.services.UserRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Regstration")
public class UserRegController {

    @Autowired
    private UserRegService userRegService;

    @GetMapping("/")
    public List<UserRegister> findAll() {
        return userRegService.findAll();
    }

    @GetMapping("/Register/{id}")
    public UserRegister findById(@PathVariable int id) {
        return userRegService.findById(id);
    }
}
