package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sayHelloController {
    
    //link: http://localhost:8080/
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index.html";
    }
}
