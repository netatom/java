package com.api.todo;

public class TodoUpdateRequest {
	private int done;
    private String text;

    // 기본 생성자
    public TodoUpdateRequest() {}

    // Getter/Setter
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
