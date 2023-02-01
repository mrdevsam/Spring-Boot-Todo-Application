package com.example.secondcourse.webappdemo.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Size;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Entity
@Data
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank
	@Size(min=3)
	private String description;
	
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDate targetDate;
	
	private boolean isDone;
}
