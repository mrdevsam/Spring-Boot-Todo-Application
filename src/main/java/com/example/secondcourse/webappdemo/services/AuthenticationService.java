package com.example.secondcourse.webappdemo.services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    
    public boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("myUsernameX");
        boolean isValidPass = password.equalsIgnoreCase("dummyx");
        
        return isValidUserName && isValidPass;
    }
}