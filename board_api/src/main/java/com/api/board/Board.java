package com.api.board;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("board_id")
    private Long board_id;

    @JsonProperty("board_body")
    private String board_body;

    @JsonProperty("subject")
    private String subject;

    private LocalDateTime createdAt;

    public Board() {}

    public Board(String subject, String board_body) {
        this.subject = subject;
        this.board_body = board_body;
    }

    public Long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Long board_id) {
        this.board_id = board_id;
    }

    public String getBoard_body() {
        return board_body;
    }

    public void setBoard_body(String board_body) {
        this.board_body = board_body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
