package com.example.secondcourse.webappdemo.services;

import java.util.*;

public interface MyCrudServ<T, ID> {
	Set<T> getTodos();
	T saveTodo(T object);
	Optional<T> findById(ID id);
	void deleteTodo(T obj);
	void deleteById(ID id);
}
