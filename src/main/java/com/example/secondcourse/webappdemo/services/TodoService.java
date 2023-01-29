package com.example.secondcourse.webappdemo.services;

import com.example.secondcourse.webappdemo.model.Todo;
import java.util.*;

public interface TodoService {
    Set<Todo> getTodos();
    Todo findById(int id);
    void deleteById(int idToDelete);
    Todo saveTodo(Todo td);
}
