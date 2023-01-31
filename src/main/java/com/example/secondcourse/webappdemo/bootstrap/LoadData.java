package com.example.secondcourse.webappdemo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.secondcourse.webappdemo.services.*;
import com.example.secondcourse.webappdemo.model.*;
import java.time.LocalDate;

@Component
public class LoadData implements CommandLineRunner {

	private final TodoService tdserv;
	
	public LoadData(TodoService tdserv) {
		this.tdserv = tdserv;
	}
	
	@Override
	public void run(String... args) throws Exception {
		var counts = tdserv.getTodos().size();

		if (counts == 0) {
			loaddata();
		}
	}

	private void loaddata() {
		Todo todo = new Todo();
		todo.setDescription("Complete task A");
		todo.setTargetDate(LocalDate.now().plusYears(3));
		tdserv.saveTodo(todo);
		System.out.println("Todo loaded.....");
	}
}
