package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
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
    	model.put("name", "myusernm");
        log.debug("inside welcome controller");
        return "welcome.html";
    }
    
}
