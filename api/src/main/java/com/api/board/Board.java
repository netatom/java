package com.api.board;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

public class Board {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@JsonProperty("board_id") // JSON 직렬화에 사용
private Long board_id;

@JsonProperty("board_body") // JSON 직렬화에 사용
private String board_body;

@JsonProperty("subject") // JSON 직렬화에 사용
private String subject;

public Board() {
}

public Board(String subject, String board_body) {
	this.subject = subject;
	this.board_body = board_body;
}

// Getters and Setters

public Long getBoadr_id() {
	return board_id;
}


public void setBoard_id(Long board_id) {
	this.board_id = board_id;
}


public String getSubject() {
	return subject;
}


public void setSubject(String subject) {
	this.subject = subject;
}


public String getBoady_body() {
	return board_body;
}


public void setBoard_body(String board_body) {
	this.board_body = board_body;
}

private LocalDateTime createdAt;
}
