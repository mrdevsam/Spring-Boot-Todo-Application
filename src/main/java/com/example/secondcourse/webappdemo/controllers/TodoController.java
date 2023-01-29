package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
import com.example.secondcourse.webappdemo.services.TodoServiceImpl;
import com.example.secondcourse.webappdemo.model.Todo;
import java.util.*;
import java.time.LocalDate;
//import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
    
    private TodoServiceImpl todoServiceImpl;
    
    public TodoController(TodoServiceImpl todoServiceImpl) {
        this.todoServiceImpl = todoServiceImpl;
    }
    
    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        
        model.addAttribute("todoList", todoList);
        return "listTodos.html";
    }
    
    @GetMapping("add-todo")
    public String gotoCreateNewTodo(ModelMap model) {
        String username = model.get("name").toString();
        Todo newTodo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
        model.put("newTodo", newTodo);
        
        return "createOrUpdateTodo.html";
    }
    
    @PostMapping("add-todo")
    public String addNewTodo(ModelMap model, Todo tD) {
        
        //if (result.hasErrors()) {
        //    return "createOrUpdateTodo.html";
        //}

        //if (tD.getDescription().length() < 10) {
        //	String errorMsgA = "Please input at least 10 characters!!!";
        //	model.put("errorMsgA", errorMsgA);
        //	return "createOrUpdateTodo.html";
        //}
        String username = model.get("name").toString();
        todoService.addTodo(username, tD.getDescription(), LocalDate.now().plusYears(1), false);
        
        return "redirect:list-todos";
    }
    
    @GetMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        //delete todo
        todoService.deleteById(id);
        return "redirect:list-todos";
    }
}
