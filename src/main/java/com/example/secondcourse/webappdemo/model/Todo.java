package com.example.secondcourse.webappdemo.model;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Todo{
    
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean isDone;
    
}