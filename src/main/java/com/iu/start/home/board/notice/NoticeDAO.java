package com.iu.start.home.board.notice;

import java.util.List;
import java.util.Map;

import javax.swing.Spring;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.start.home.board.impl.BoardDAO;
import com.iu.start.home.board.impl.BoardDTO;

@Repository
public class NoticeDAO implements BoardDAO{
	// abstract or orverriding
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.home.board.notice.NoticeDAO.";
	
	
	@Override
	public List<BoardDTO> getList(Map<String, Long> map) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList", map);
	}

	@Override
	public BoardDTO getDetail(BoardDTO BoardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getDetail", BoardDTO);
	}

	@Override
	public int setAdd(BoardDTO BoardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setAdd", BoardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setUpdate",boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setDelete",boardDTO);
	}

	

}
