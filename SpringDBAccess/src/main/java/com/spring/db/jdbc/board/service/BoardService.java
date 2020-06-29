package com.spring.db.jdbc.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.jdbc.board.model.BoardVO;
import com.spring.db.jdbc.board.repository.IBoardDAO;
import com.spring.db.jdbc.board.repository.IBoardMapper;

@Service
public class BoardService implements IBoardService {
	
	//JDBC Template을 이용한 SQL 처리.
//	@Autowired
//	private IBoardDAO dao;
	
	//MyBatis를 이용한 SQL 처리.
	@Autowired
	private IBoardMapper dao;

	@Override
	public List<BoardVO> getArticles() {
		return dao.getArticles();
	}

	@Override
	public void insertArticle(BoardVO article) {
		dao.insertArticle(article);
	}

	@Override
	public void deleteArticle(int index) {
		dao.deleteArticle(index);
	}

	@Override
	public BoardVO getContent(int index) {
		return dao.getContent(index);
	}

	@Override
	public void modifyArticle(BoardVO article) {
		dao.modifyArticle(article);
	}

	@Override
	public List<BoardVO> getSearchList(String keyword) {
		//%를 붙여서 dao에게 전달해야 함! 절대 sql문에 %를 붙이면 안됨!!!
		keyword = "%" + keyword + "%";
		return dao.getSearchList(keyword);
	}

}
