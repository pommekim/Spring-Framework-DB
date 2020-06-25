package com.spring.db.jdbc.board.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.db.jdbc.board.model.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO {
	
	class BoardMapper implements RowMapper<BoardVO> {

		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return null;
		}
		
	}
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<BoardVO> getArticles() {
		return null;
	}

	@Override
	public void insertArticle(BoardVO article) {
		String sql = "INSERT INTO jdbc_board (writer, title, content) VALUES (?,?,?)";
		template.update(sql, article.getWriter(), article.getTitle(), article.getContent());
	}

	@Override
	public void deleteArticle(int index) {
	}

	@Override
	public BoardVO getContent(int index) {
		return null;
	}

	@Override
	public void modifyArticle(BoardVO article, int index) {
	}

}
