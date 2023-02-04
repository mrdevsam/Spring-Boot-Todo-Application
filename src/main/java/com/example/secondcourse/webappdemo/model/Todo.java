package com.example.secondcourse.webappdemo.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Entity
@Data
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String username;
	
	@NotBlank
	@Size(min=3, message="please enter at least 3 characters!!!")
	private String description;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDate targetDate;
	
	@Enumerated(value = EnumType.STRING)
	private Status sts;
}
