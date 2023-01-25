package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {
    
    // localhost:8080/login?name=
    @RequestMapping("login")
    public String loadLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        log.debug("request param is: " + name);
        
        return "login.html";
    }
}