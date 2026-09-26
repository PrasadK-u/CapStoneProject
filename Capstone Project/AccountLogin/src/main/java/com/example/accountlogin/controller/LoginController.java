package com.example.accountlogin.controller;

import com.example.accountlogin.entity.Login;
import com.example.accountlogin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("/check")
    public Login login(@RequestBody Login request) {

        return loginService.login(
                request.getEmail(),
                request.getPassword()
        );
    }

    @GetMapping("/")
    public List<Login> findAll(){
        return loginService.findAll();
    }

    @PutMapping("/update/{id}")
    public Login update(
            @PathVariable int id,
            @RequestBody Login request) {

        return loginService.updateLogin(
                id,
                request.getEmail(),
                request.getPassword()
        );
    }
}
