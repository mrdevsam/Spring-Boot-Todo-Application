package com.example.secondcourse.webappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import com.example.secondcourse.webappdemo.services.TodoService;
import com.example.secondcourse.webappdemo.model.Todo;
import java.util.*;
import java.time.LocalDate;
import jakarta.validation.Valid;

@Controller
@Slf4j
@SessionAttributes("name")
public class TodoController {
    
    private TodoService todoServiceImpl;
    
    
    public TodoController(TodoService todoServiceImpl) {
        this.todoServiceImpl = todoServiceImpl;
    }
    
    @GetMapping("list-todos")
    public String listAllTodos(ModelMap model) {
    	log.debug("inside todo controller");
        var todoList = todoServiceImpl.getTodos();
        model.addAttribute("todoList", todoList);
        return "listTodos.html";
    }
    
    
    @GetMapping("add-todo")
    public String gotoCreateNewTodo(ModelMap model) {
        Todo newTodo = new Todo();
        model.put("newTodo", newTodo);
        log.debug("going to create new todo");
        return "createTodoPage.html";
    }
    
    @PostMapping("add-todo")
    public String addNewTodo(ModelMap model, @Valid Todo newTodo, BindingResult result, @RequestParam int id) {
        
        if (result.hasErrors()) {
        	var erMsg = result.getFieldError().toString();
        	log.warn(erMsg);
        	model.put("newTodo", newTodo);
            return "createTodoPage.html";
            
        } else {
        	newTodo.setId(id);
            todoServiceImpl.saveTodo(newTodo);
            log.debug("saving new todo by id: " + Integer.toString(id));
            return "redirect:list-todos";
        }
    }
    
    @GetMapping("delete-todo")
    public String deletetodo(@RequestParam int id) {
        log.debug("deleting todo by id: " + Integer.toString(id));
        todoServiceImpl.deleteById(id);
        return "redirect:list-todos";
    }

    @GetMapping("update-todo")
    public String gotoUpdateTodo(ModelMap model, @RequestParam int id) {
         var newTodo = todoServiceImpl.findById(id).get();
         model.addAttribute("newTodo", newTodo);
         log.debug("going to update an existing todo by id: " + Integer.toString(id));
         return "createTodoPage.html";
    }
    
}
