package com.example.secondcourse.webappdemo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.secondcourse.webappdemo.model.Todo;
import java.util.List;

public interface TodoRepo extends MongoRepository<Todo, Long> {
    public List<Todo> findByUsername(String username);
}
