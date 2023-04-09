package com.example.secondcourse.webappdemo.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import java.time.LocalDate;
import lombok.*;

@Document
@NoArgsConstructor
@Getter
@Setter
public class Todo {

	@Transient
	public static final String SEQUENCE_NAME = "todo_sequence";

	@Id
	private long id;

	private String username;
	
	@NotBlank
	@Size(min=3, message="please enter at least 3 characters!!!")
	private String description;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDate targetDate;
	
	private Status sts;
}
