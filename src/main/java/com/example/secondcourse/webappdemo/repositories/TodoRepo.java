package com.example.secondcourse.webappdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.secondcourse.webappdemo.model.Todo;
import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Integer> {
    public List<Todo> findByUsername(String username);
}
