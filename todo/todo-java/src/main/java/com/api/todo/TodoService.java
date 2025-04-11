package com.api.todo;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class TodoService {


private final TodoRepository todoRepository;


@Autowired
public TodoService(TodoRepository todoRepository) {
	this.todoRepository = todoRepository;
}


@Transactional

public Todo save(Todo todo) {
	return todoRepository.save(todo);
}


public Iterable<Todo> findAll() {
	return todoRepository.findAll();
}


public Optional<Todo> findByTodo(Long id) {
	return todoRepository.findById(id);
}

@Transactional

public Todo update(Long id, int done, String text) {
	Optional<Todo> optionalTodo = todoRepository.findById(id);
	if (optionalTodo.isPresent()) {
	Todo todo = optionalTodo.get();
	todo.setDone(done);
	todo.setText(text);
	return todoRepository.save(todo);
}

throw new RuntimeException("Todo not found with id " + id);

}

@Transactional
public void delete(Long id) {
	todoRepository.deleteById(id);
}

}