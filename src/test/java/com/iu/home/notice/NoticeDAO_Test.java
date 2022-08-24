package com.iu.home.notice;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.home.board.impl.BoardDAO;
import com.iu.home.board.impl.BoardDTO;
import com.iu.home.board.notice.NoticeDAO;
import com.iu.home.board.notice.NoticeDTO;

public class NoticeDAO_Test extends MyAbstractTest{
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Test
	public void getList() throws Exception{
		// 리스트는 얻는게 아니라 가지고 오는 것
		List<BoardDTO> ar = noticeDAO.getList();
		assertEquals(0, ar.size());
		
		
		
		/*
		 * 실행할때 초기(설정)세팅할때 문제가 생긴것 java.lang.IllegalStateException: Failed to load
		 * ApplicationContext
		 * 
		 * caused by 이유
		 */	 
	}
	
	@Test
	public void setAddTest()  throws Exception{
		NoticeDTO noticeDTO =new NoticeDTO();
		noticeDTO.setTitle("test");
		noticeDTO.setWriter("test");
		noticeDTO.setContents("test");
		int result = noticeDAO.setAdd(null);
		assertEquals(1, result);
		
		
	}
	
	
//	@Test
//	public void getDetail(BoardDTO barBoardDTO) throws Exception{}
//	
//	
//	@Test
//	public void setAdd(BoardDTO baoBoardDTO) throws Exception{}
//		
//	@Test
//	public void setUpdate(BoardDTO boardDTO) throws Exception{}
//	
//	@Test
//	public void setDelete(BoardDTO boardDTO) throws Exception{}

	}

