package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {
    
    // localhost:8080/login
    @RequestMapping("login")
    public String loadLoginPage() {
        
        log.debug("inside login controller");
        return "login.html";
    }
}
