package com.spring.db.jdbc.board.model;

/*
-- 게시판 테이블 생성
CREATE TABLE jdbc_board (
	board_No INT PRIMARY KEY AUTO_INCREMENT,
    writer VARCHAR(100) NOT NULL,
    title VARCHAR(255) NOT NULL,
    content TEXT
);
 */

public class BoardVO {
	
	private int boardNo;
	private String writer;
	private String title;
	private String content;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", writer=" + writer + ", title=" + title + ", content=" + content + "]";
	}
	
	

}
