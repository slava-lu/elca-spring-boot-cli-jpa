package com.example.demo.Todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TodoRepositoryTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void saveTodo_returnSavedTodo() {

        Todo todo = Todo.builder()
                .title("test")
                .description("test todo")
                .completed(true)
                .build();

        Todo savedTodo = todoRepository.save(todo);

        assertThat(savedTodo).isNotNull();
        assertThat(savedTodo.getTitle()).isEqualTo("test");
    }

}