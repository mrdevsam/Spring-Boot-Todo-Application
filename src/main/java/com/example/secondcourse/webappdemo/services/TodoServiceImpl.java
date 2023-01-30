package com.example.secondcourse.webappdemo.services;

import org.springframework.stereotype.Service;
import com.example.secondcourse.webappdemo.model.Todo;
import com.example.secondcourse.webappdemo.repositories.TodoRepo;
import java.util.*;

@Service
public class TodoServiceImpl implements TodoService {
    
    private final TodoRepo todoRepo;
    
    public TodoServiceImpl(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }
    
    @Override
    public Set<Todo> getTodos() {
    	Set<Todo> todolist = new HashSet<>();
    	todoRepo.findAll().forEach(todolist::add);
        return todolist;
    }
    
    @Override
    public Optional<Todo> findById(Integer id) {
        return todoRepo.findById(id);
    }
    
    @Override
    public void deleteById(Integer id) {
    	todoRepo.deleteById(id);
    }
    
    @Override
    public Todo saveTodo(Todo object) {
        return todoRepo.save(object);
    }

    @Override
    public void deleteTodo(Todo obj) {
    	todoRepo.delete(obj);
    }
}
