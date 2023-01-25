package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import lombok.extern.slf4j.Slf4j;
import com.example.srcondcourse.webappdemo.services.*;

@Slf4j
@Controller
public class LoginController {
    
    private AuthenticationService authService;
    
    public LoginController(AuthenticationService authService) {
        this.authService = authService;
    }
    
    // localhost:8080/login
    @GetMapping("login")
    public String loadLoginPage() {
        
        log.debug("inside login controller");
        return "login.html";
    }
    
    @PostMapping("login")
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        
        if(authService.authenticate(name, password)) {
            model.put("name", name);
            //username : myUsernameX
            //password: dummyx
            return "welcome.html";
        }
        
        return "login.html";
    }
    
}
