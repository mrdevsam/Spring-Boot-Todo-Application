package com.example.secondcourse.webappdemo.services;

import com.example.secondcourse.webappdemo.model.Todo;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.*;

@Service
public class TodoService {
    
    private static int todosCount = 0;
    private static List<Todo> todoList = new ArrayList<>();
    
    static {
        todoList.add(new Todo(++todoList, "myUsernameX","Learn AWS", 
							LocalDate.now().plusYears(1), false ));
		todoList.add(new Todo(++todosCount, "myUsernameX","Learn DevOps", 
				LocalDate.now().plusYears(2), false ));
		todoList.add(new Todo(++todosCount, "myUsernameX","Learn Full Stack Development", 
				LocalDate.now().plusYears(3), false ));
    }
    
    public List<Todo> findByUsername(String username) {
        return todoList;
    }
    
    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
        Todo todo = Todo(++todosCount, username, description, targetDate, isDone);
        return todoList.add(todo);
    }
}