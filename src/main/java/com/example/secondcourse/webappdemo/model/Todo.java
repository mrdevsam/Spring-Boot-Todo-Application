package com.example.secondcourse.webappdemo.model;
import java.time.LocalDate;
import lombok.*;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Todo{
    
    private int id;
    private String username;
    
    @Size(min = 10, message = "Please enter at least 10 characters...")
    private String description;
    
    private LocalDate targetDate;
    private boolean isDone;
    
}