package com.example.secondcourse.webappdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.secondcourse.webappdemo.model.Todo;

public class TodoRepo extends CrudRepository<Todo, Integer> {
    public Todo findByUserName(Stirng userName);
}