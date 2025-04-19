package com.example.demo;

import java.util.List;

public interface BoardDao {

	public List<Board> getAll();

	public Board selectBoard(int id);

	public void write(Board board);

	public void update(Board board);

	public void delete(int id);

	public void updateHit(int id);

}