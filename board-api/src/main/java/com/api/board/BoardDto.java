package com.api.board;

public class BoardDto {
	private String subject;
    private String board_body;

    public BoardDto() {}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBoard_body() {
        return board_body;
    }

    public void setBoard_body(String board_body) {
        this.board_body = board_body;
    }
}
