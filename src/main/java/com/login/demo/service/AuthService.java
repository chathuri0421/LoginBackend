package com.login.demo.service;

import com.login.demo.model.User;
import com.login.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public boolean validateLogin(String phoneNumber, String password) {
        User user = userRepository.findByPhoneNumber(phoneNumber);
        if (user != null && user.getPassword().equals(password)) {
            return true;  // Login successful
        }
        return false;  // Invalid credentials
    }
}
