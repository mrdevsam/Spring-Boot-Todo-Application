package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import lombok.extern.slf4j.Slf4j;
import com.example.secondcourse.webappdemo.services.*;

@Slf4j
@Controller
public class WelcomeController {
    
    // localhost:8080/login
    @GetMapping("/")
    public String loadWelcomePage() {
        
        log.debug("inside welcome controller");
        return "index.html";
        
    }
    
}
