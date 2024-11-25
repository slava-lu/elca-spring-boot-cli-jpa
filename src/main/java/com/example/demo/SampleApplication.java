package com.example.demo;

import com.example.demo.Todo.Todo;
import com.example.demo.Todo.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SampleApplication implements CommandLineRunner {

	private final TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Todo todo1 = Todo.builder()
				.title("todo 1")
				.description("description 1")
				.completed(true)
				.build();

		Todo todo2 = Todo.builder()
				.title("todo 2")
				.description("description 2")
				.completed(false)
				.build();

		todoRepository.save(todo1);
		todoRepository.save(todo2);

		todoRepository.findAll().forEach(
				todo -> System.out.println(todo.toString())
		);
	}
}
