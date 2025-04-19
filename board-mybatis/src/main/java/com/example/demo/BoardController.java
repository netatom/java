package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class BoardController {

	@Autowired

	private BoardDao boardDao;

	// list

	@RequestMapping(value = "/boardlist", method = RequestMethod.GET)

	public String list(Model model) {

		List<Board> list = boardDao.getAll();

		model.addAttribute("list", list);

		model.addAttribute("total", list.size()); // list 개수

		return "BoardList";

	}

	// write

	@RequestMapping(value = "/boardcreate", method = RequestMethod.GET)

	public String create(Model model) {

		BoardForm form = new BoardForm();

		model.addAttribute("boardForm", form);

		return "BoardCreate";

	}

	// insert

	@RequestMapping(value = "/boardcreate", method = RequestMethod.POST)

	public String create(@ModelAttribute BoardForm boardForm, Model model, BindingResult errors) {

		Board board = new Board();

		board.setSubject(boardForm.getTxtSubject());

		board.setContent(boardForm.getTxtContent());

		boardDao.write(board);

		return "redirect:/boardlist";

	}

	// view

	@RequestMapping(value = "/boardRead", method = RequestMethod.GET)

	public String read(@RequestParam Integer id, Model model) {

		// 조회수 증가

		boardDao.updateHit(id);

		Board board = boardDao.selectBoard(id);

		String content = board.getContent();

		content = content.replace("\n", "<br/>");

		board.setContent(content);

		model.addAttribute("board", board);

		return "BoardRead";

	}

	// update view

	@RequestMapping(value = "/boardUpdate", method = RequestMethod.GET)

	public String update(@RequestParam Integer id, Model model) {

		BoardForm form = new BoardForm();

		Board board = boardDao.selectBoard(id);

		form.setId(board.getId());

		form.setTxtSubject(board.getSubject());

		form.setTxtContent(board.getContent());

		form.setCount(board.getHit());

		model.addAttribute("boardForm", form);

		return "BoardUpdate";

	}

	// update

	@RequestMapping(value = "/boardUpdate", method = RequestMethod.POST)

	public String update(@ModelAttribute BoardForm boardForm, Model model) {

		Board board = new Board();

		board.setSubject(boardForm.getTxtSubject()); // save

		board.setContent(boardForm.getTxtContent()); // save

		board.setId(boardForm.getId()); // save

		boardDao.update(board); // update 실행

		return "redirect:/boardRead?id=" + boardForm.getId();

	}

	// delete

	@RequestMapping(value = "/boardDelete", method = RequestMethod.GET)

	public String delete(@RequestParam Integer id, Model model) {
		System.out.println("삭제 요청 ID: " + id); // 로그 추가
		boardDao.delete(id);

		return "redirect:/boardlist";

	}

}