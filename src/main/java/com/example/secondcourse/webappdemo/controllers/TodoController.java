package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import com.example.secondcourse.webappdemo.services.TodoService;
import com.example.secondcourse.webappdemo.model.Todo;
import java.util.*;

@Controller
public class TodoController {
    
    private TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap) {
        List<Todo> todos = todoService.findByUsername("myUsernameX");
        model.addAttribute("todos", todos);
        return "listTodos.html";
    }
}