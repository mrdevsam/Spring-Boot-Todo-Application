package com.example.secondcourse.webappdemo.services;

import com.example.secondcourse.webappdemo.model.Todo;
import com.example.secondcourse.webappdemo.repositories.TodoRepo;
import java.util.*;

public interface TodoServiceImpl implements TodoService {
    
    private TodoRepo todoRepo;
    
    public TodoServiceImpl(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }
    
    @Override
    Set<Todo> getTodos() {
        
    }
    
    @Override
    Todo findById(int id) {
        
    }
    
    @Override
    void deleteById(int idToDelete) {
        
    }
    
    @Override
    Todo saveTodo(Todo td) {
        
    }
}