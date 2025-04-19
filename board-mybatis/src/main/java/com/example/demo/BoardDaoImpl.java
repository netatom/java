package com.example.demo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository

public class BoardDaoImpl implements BoardDao {

	@Autowired

	private SqlSession sqlSession;

	public List<Board> getAll() {

		return sqlSession.selectList("board.selectAll"); // board namespace의 selectall의 id값

	};

	public void write(Board board) {

		sqlSession.selectList("board.insert", board);

	};

	public void update(Board board) {

		sqlSession.selectList("board.update", board);

	};

	public void delete(int id) {

		sqlSession.selectList("board.delete", id);

	}

	public Board selectBoard(int id) {

		return sqlSession.selectOne("board.selectBoard", id);

	}

	public void updateHit(int id) {

		sqlSession.update("board.updateHit", id);

	};

}