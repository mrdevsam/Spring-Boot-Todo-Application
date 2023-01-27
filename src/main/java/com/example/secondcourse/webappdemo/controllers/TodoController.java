package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import com.example.secondcourse.webappdemo.services.TodoService;
import com.example.secondcourse.webappdemo.model.Todo;
import java.util.*;
import java.time.LocalDate;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
    
    private TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("myUsernameX");
        model.addAttribute("todos", todos);
        return "listTodos.html";
    }
    
    @GetMapping("add-todo")
    public String gotoCreateNewTodo(ModelMap model) {
        String username = model.get("name").toString();
        Todo newTodo = new Todo(0, username, "Default Description", LocalDate.now().plusYears(1), false);
        model.put("newTodo", newTodo);
        
        return "createOrUpdateTodo.html";
    }
    
    @PostMapping("add-todo")
    public String addNewTodo(ModelMap model, @Valid Todo tD, BindingResult result) {
        
        if (result.hasErrors()) {
            return "createOrUpdateTodo.html";
        }
        
        String username = model.get("name").toString();
        todoService.addTodo(username, tD.getDescription(), LocalDate.now().plusYears(1), false);
        
        return "redirect:list-todos";
    }
}
