package com.spring.db.jdbc.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.db.jdbc.board.model.BoardVO;
import com.spring.db.jdbc.board.service.IBoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private IBoardService service;
	
	//글 작성 화면 요청
	@GetMapping("/write")
	public void write() {
		System.out.println("/board/write: GET");
	}
	
	//글 작성 처리 요청
	@PostMapping("/write")
	public String write(BoardVO article) {
		System.out.println("/board/write: POST");
		service.insertArticle(article);
		return "redirect:/board/list";
	}
	
	//글 목록 화면 요청
	@GetMapping("/list")
	public void list(Model model) {
		System.out.println("/board/list: GET");
		model.addAttribute("bList", service.getArticles());
	}
	
	//글 내용보기 요청
	@GetMapping("/content")
	public void content(int boardNo, Model model) {
		System.out.println("/board/content?boardNo=" + boardNo + ": GET");
		model.addAttribute("article", service.getContent(boardNo));
	}
	
	//글 수정 화면 요청
	@GetMapping("/modify")
	public void modify(int boardNo, Model model) {
		System.out.println("/board/modify?boardNo=" + boardNo + ": GET");
		model.addAttribute("article", service.getContent(boardNo));
	}
	
	//글 수정 처리 요청
	@PostMapping("/modify")
	public String modify(BoardVO article) {
		System.out.println("/board/modify?boardNo=" + article.getBoardNo() + ": POST");
		service.modifyArticle(article);
		return "redirect:/board/content?boardNo="+article.getBoardNo();
	}
	
	//글 삭제 요청
	@GetMapping("/delete")
	public String delete(int boardNo) {
		System.out.println("/board/delete?boardNo=" + boardNo + ": GET");
		service.deleteArticle(boardNo);
		return "redirect:/board/list";
	}
	
	//게시글 검색 처리 요청
	@GetMapping("/searchList")
	public String searchList(String keyword, Model model) {
		model.addAttribute("bList", service.getSearchList(keyword));
		return "board/list";
	}
	
	
	
	
	
	

}
