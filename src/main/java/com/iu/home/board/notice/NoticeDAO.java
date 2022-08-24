package com.iu.home.board.notice;

import java.util.List;

import javax.swing.Spring;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.home.board.impl.BoardDAO;
import com.iu.home.board.impl.BoardDTO;
@Repository
public abstract class NoticeDAO implements BoardDAO{
	// abstract or orverriding
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE= "com.iu.home.notice.NoticeDAO.";
	
	
	@Override
	public List<BoardDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList");
	}

	@Override
	public BoardDTO getDetail(BoardDTO barBoardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getDetail", barBoardDTO);
	}

	@Override
	public int setAdd(BoardDTO baoBoardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setAdd", baoBoardDTO);
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
