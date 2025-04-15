package com.api.board;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class BoardService {


private final BoardRepository boardRepository;


@Autowired
public BoardService(BoardRepository boardRepository) {
	this.boardRepository = boardRepository;
}

@Transactional

public Iterable<Board> findAll() {
	return boardRepository.findAll();
}


public Optional<Board> findByBoard_id(Long board_id) {
	return boardRepository.findById(board_id);
}

@Transactional

public Board save(Board board) {
	return boardRepository.save(board);
}

@Transactional

public Board update(Long board_id, String subject, String board_body) {
	Optional<Board> optionalBoard = boardRepository.findById(board_id);
	if (optionalBoard.isPresent()) {
	Board board = optionalBoard.get();
	board.setSubject(subject);
	board.setBoard_body(board_body);
	return boardRepository.save(board);
}

throw new RuntimeException("Board not found with id " + board_id);

}

@Transactional
public void delete(Long board_id) {
	boardRepository.deleteById(board_id);
}

}