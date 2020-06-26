package com.spring.db.mybatis.score.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.mybatis.score.model.ScoreVO;
import com.spring.db.mybatis.score.repository.IScoreMapper;

@Service("scoreService2")
public class ScoreService implements IScoreService {
	
	@Autowired
	private IScoreMapper dao;

	@Override
	public void insertScore(ScoreVO scores) {
		scores.calcData();
		dao.insertScore(scores);
	}

	@Override
	public List<ScoreVO> selectAllScores() {
//		List<ScoreVO> list = dao.selectAllScores();
		return dao.selectAllScores();
	}

	@Override
	public void deleteScore(int stuNum) {
		dao.deleteScore(stuNum);
	}

	@Override
	public ScoreVO selectOne(int stuNum) {
		return dao.selectOne(stuNum);
	}
	
	
	
	
	
	
	
	
	
	

}
