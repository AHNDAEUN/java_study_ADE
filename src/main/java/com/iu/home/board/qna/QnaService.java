package com.iu.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {
	
	@Autowired
	private QnaDAO qnaDAO;
	
	
	
	public List<QnaDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getList();
	}

	
	public QnaDTO getDetail(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getDetail(qnaDTO);
	}

	
	public int setAdd(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setAdd(qnaDTO);
	}

	
	public int setUpdate(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setUpdate(qnaDTO);
	}


	public int setDelete(QnaDTO qnaDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setDelete(qnaDTO);
	}

	


}
