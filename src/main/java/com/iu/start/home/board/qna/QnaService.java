package com.iu.start.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.start.home.board.impl.BoardDTO;
import com.iu.start.home.board.impl.BoardService;
import com.iu.start.home.util.Pager;

@Service
public class QnaService implements BoardService {
	
	@Autowired
	private QnaDAO qnaDAO;
	

	
	
	public int setReply(QnaDTO qnaDTO)throws Exception{
		BoardDTO boardDTO= qnaDAO.getDetail(qnaDTO);
		QnaDTO parent =(QnaDTO)boardDTO;
		
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setRef(parent.getStep()+1);
		qnaDTO.setRef(parent.getDepth()+1);
		
		qnaDAO.setStepUpdate(parent);
		int result = qnaDAO.setReplyAdd(qnaDTO);
		
		return 0;
	}
		
		@Override
		public List<BoardDTO> getList(Pager pager) throws Exception {
			Long totalCount=qnaDAO.getCount(pager);
			pager.getNum(totalCount);
			pager.getRowNum();
			
//			Long totalCount = qnaDAO.getPageCount();
//			
//			Long startRow=0L;
//			Long lastRow=0L;
//			Long perPage=10L;
//			lastRow=page*perPage;
//			startRow=(page-1)*perPage+1;
//			Map<String, Long> map = new HashMap<String, Long>();
//			map.put("startRow", startRow);
//			map.put("lastRow", lastRow);
			
			return qnaDAO.getList(pager);
		}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getDetail(boardDTO);
	}
	
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Insert 전 : "+boardDTO.getNum());
		int result = qnaDAO.setAdd(boardDTO);
		System.out.println("Insert 후 : "+boardDTO.getNum());
		return result;
	}
	

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.setDelete(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile[] files) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
	
	
	



