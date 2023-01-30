package com.example.secondcourse.webappdemo.services;

import org.springframework.stereotype.Service;
import com.example.secondcourse.webappdemo.model.Todo;
import com.example.secondcourse.webappdemo.repositories.TodoRepo;
import java.util.*;

@Service
public class TodoServiceImpl implements TodoService {
    
    private TodoRepo todoRepo;
    
    public TodoServiceImpl(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }
    
    @Override
    public Set<Todo> getTodos() {
        return null;
    }
    
    @Override
    public Todo findById(int id) {
        return null;
    }
    
    @Override
    public void deleteById(int idToDelete) {
    }
    
    @Override
    public Todo saveTodo(Todo td) {
        return null;
    }
}
