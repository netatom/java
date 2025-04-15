package com.api.board;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "/api/board")

public class BoardController {

private final BoardService boardService;


@Autowired
public BoardController(BoardService boardService) {
	this.boardService = boardService;
}

//테이블 리스트 가져오기
@GetMapping(value = "/")
public Iterable<Board> list() {
	return boardService.findAll();
}

// POST로 유저 추가
@PostMapping
public Board post(@RequestParam("subject") String subject, @RequestParam("board_body") String board_body) {
	Board board = new Board(subject, board_body);
	return boardService.save(board);
}

// board_id로 테이블 값 가져오기
@GetMapping(value = "/{board_id}")
public Optional<Board> findOne(@PathVariable("board_id") Long board_id) {
	return boardService.findByBoard_id(board_id);
}

// board_id로 테이블 값 수정하기
@PutMapping(value = "/{board_id}")
public Board update(@PathVariable("board_id") Long board_id, @RequestParam("subject") String subject, @RequestParam("board_body") String board_body) {
	return boardService.update(board_id, subject, board_body);
}

// board_id로 테이블 값 삭제하기
@DeleteMapping(value = "/{board_id}")
public void delete(@PathVariable("board_id") Long board_id) {
	boardService.delete(board_id);
}

}
