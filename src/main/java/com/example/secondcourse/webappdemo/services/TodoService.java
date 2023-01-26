package com.example.secondcourse.webappdemo.services;

import com.example.secondcourse.webappdemo.model.Todo;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.*;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();
    
    static {
        todoList.add(new Todo(1, "myUsernameX","Learn AWS", 
							LocalDate.now().plusYears(1), false ));
		todoList.add(new Todo(2, "myUsernameX","Learn DevOps", 
				LocalDate.now().plusYears(2), false ));
		todoList.add(new Todo(3, "myUsernameX","Learn Full Stack Development", 
				LocalDate.now().plusYears(3), false ));
    }
}