package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.example.secondcourse.webappdemo.services.*;

@Slf4j
@Controller
@SessionAttributes("name")
public class WelcomeController {
    
    // localhost:8080/
    @GetMapping({"", "/", "index"})
    public String loadWelcomePage(ModelMap model) {
    	model.put("name", getLoggedinUsername());
        log.debug("inside welcome controller");
        log.warn("logged in as: " + getLoggedinUsername());
        return "welcome.html";
    }

    private String getLoggedinUsername() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	return auth.getName();
    }
    
}
