package com.api.todo;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")

@RestController

@RequestMapping(value = "/api/todo")

public class TodoController {

private final TodoService todoService;


@Autowired
public TodoController(TodoService todoService) {
	this.todoService = todoService;
}


// POST로 유저 추가
@PostMapping
public Todo post(@RequestBody Todo todo) {
	return todoService.save(todo);
}

// 테이블 리스트 가져오기
@GetMapping
public Iterable<Todo> list() {
	return todoService.findAll();
}

// id로 테이블 값 가져오기
@GetMapping(value = "/{id}")
public Optional<Todo> findOne(@PathVariable("id") Long id) {
	return todoService.findByTodo(id);
}

// id로 테이블 값 수정하기
@PutMapping(value = "/{id}")
public Todo update(@PathVariable("id") Long id, @RequestBody TodoUpdateRequest request) {
    return todoService.update(id, request.getDone(), request.getText());
}

// id로 테이블 값 삭제하기
@DeleteMapping(value = "/{id}")
public void delete(@PathVariable("id") Long id) {
	todoService.delete(id);
}

}
