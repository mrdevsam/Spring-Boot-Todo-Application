package com.example.secondcourse.webappdemo.controllers;

import org.springframework.*;

@Controller
public class sayHelloController {
    
    //link: http://localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, welcome to the page";
    }
}