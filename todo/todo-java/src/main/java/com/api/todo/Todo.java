package com.api.todo;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

//import lombok.Getter;
//import lombok.Setter;


//@Getter
//@Setter

@Entity

public class Todo {

@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

@JsonProperty("id") // JSON 직렬화에 사용
private Long id;

@JsonProperty("text") // JSON 직렬화에 사용
private String text;

@JsonProperty("done") // JSON 직렬화에 사용
private int done;

public Todo() {
}

public Todo(int done, String text) {
	this.done = done;
	this.text = text;
}

// Getters and Setters

public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public int getDone() {
	return done;
}


public void setDone(int done) {
	this.done = done;
}


public String getText() {
	return text;
}


public void setText(String text) {
	this.text = text;
}

}
