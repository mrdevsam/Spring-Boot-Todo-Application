package com.example.secondcourse.webappdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.secondcourse.webappdemo.model.Todo;

public interface TodoRepo extends CrudRepository<Todo, Integer> {
    public Todo findByUsername(String username);
}
