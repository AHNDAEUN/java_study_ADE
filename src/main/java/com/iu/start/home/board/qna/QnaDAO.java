package com.iu.start.home.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.start.home.board.impl.BoardDAO;
import com.iu.start.home.board.impl.BoardDTO;

@Repository
public class QnaDAO  {

	@Autowired
	private SqlSession session;
	private final String NAMESPACE= "com.iu.start.home.qna.QnaDAO.";
	
	

	public List<QnaDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(NAMESPACE+"getList");
	}


	public QnaDTO getDetail(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(NAMESPACE+"getDetail",qnaDTO);
	}


	public int setAdd(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(NAMESPACE+"setAdd", qnaDTO);
	}

	
	public int setUpdate(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return session.update(NAMESPACE+"setUpdate",qnaDTO);
	}

	
	public int setDelete(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return session.delete(NAMESPACE+"setDelete",qnaDTO);
		

		
	}

}
