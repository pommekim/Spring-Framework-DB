package com.spring.db.jdbc.score.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.db.jdbc.score.model.ScoreVO;

@Repository
public class ScoreDAO implements IScoreDAO {

	@Override
	public void insertScore(ScoreVO scores) {
		
	}

	@Override
	public List<ScoreVO> selectAllScores() {
		return null;
	}

	@Override
	public void deleteScore(int stuNum) {
		
	}

	@Override
	public ScoreVO selectOne(int stuNum) {
		return null;
	}

}
