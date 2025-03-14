package com.login.demo.controller;

import com.login.demo.service.AuthService;
import com.login.demo.dto.LoginRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginRequestDto loginRequestDto) {
        // Use the phone number and password from the request to validate login
        return authService.validateLogin(loginRequestDto.getPhoneNumber(), loginRequestDto.getPassword());
    }
}
