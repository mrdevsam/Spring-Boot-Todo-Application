package com.example.secondcourse.webappdemo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public record Todo(
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	int id, 
	String userName,  
	String description, 
	LocalDate targetDate, 
	boolean isDone) {}
