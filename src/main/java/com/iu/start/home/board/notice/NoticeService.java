package com.iu.start.home.board.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.start.home.board.impl.BoardDTO;
import com.iu.start.home.board.impl.BoardService;


@Service
public class NoticeService implements BoardService {


	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<BoardDTO> getList(Long page) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("service page"+page);
		
		Long perPage = 15L; // 한페이지에 출력할 목록의 갯수
		
		// 한 페이지에 10개씩 출력 기준
		//page     // startrow      lastrow
		//1               1            10
		//2               11           20
		//3               21           30
		
		//Long startRow = page*10-9;
		Long startRow= (page-1)*perPage+1;
		Long lastRow = page*perPage;
		
		System.out.println("startRow:" + startRow);
		System.out.println("lastRow:" + lastRow);
		Map<String, Long> map= new HashMap<String, Long>();
		map.put("startRow", startRow);
		map.put("lastRow", lastRow);
		
		return noticeDAO.getList(map);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setAdd(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}
	
}
