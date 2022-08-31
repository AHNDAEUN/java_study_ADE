package com.iu.start.home.board;

import static org.junit.Assert.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.start.home.board.impl.BoardDAO;
import com.iu.start.home.board.impl.BoardDTO;
import com.iu.start.home.board.notice.NoticeDAO;
import com.iu.start.home.board.notice.NoticeDTO;

public class NoticeDAO_Test extends MyAbstractTest{
	
	@Autowired
	private NoticeDAO noticeDAO;

//	@Test
//	public void getList(Map) throws Exception{
//		// 리스트는 얻는게 아니라 가지고 오는 것
//		List<BoardDTO> ar = noticeDAO.getList();
//		assertEquals(0, ar.size());
//		
		
		
		/*
		 * 실행할때 초기(설정)세팅할때 문제가 생긴것 java.lang.IllegalStateException: Failed to load
		 * ApplicationContext
		 * 
		 * caused by 이유
		 */	 
//	}
	
	@Test
	public void setAdd()  throws Exception{
		
		for(int i= 0; i<100 ; i++){
		NoticeDTO noticeDTO =new NoticeDTO();
		noticeDTO.setTitle("TITLE"+i);
		noticeDTO.setWriter("test"+i);
		noticeDTO.setContents("test"+i);
		
		int result = noticeDAO.setAdd(noticeDTO);
		
		if( i%10 ==0) { 
            Thread.sleep(500);    
		}
		
		}
		
		System.out.println("finish!!");
	
	}
//			@Test
//			public void getCountTest() throws Exception {
//				
//				long count = noticeDAO.getCount();
//				assertEquals(3, count);

//	@Test
//	public void setUpdate() throws Exception {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setNum(16L);
//		boardDTO.setTitle("test");
//		boardDTO.setContents("sdafqgw");
//		boardDTO.setWriter("wggrwqoipw");
//		int result = noticeDAO.setUpdate(boardDTO);
//		assertEquals(1, result);
//	}
//
//	@Test
//	public void setDelete() throws Exception {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setNum(1L);
//		int result = noticeDAO.setDelete(boardDTO);
//		assertEquals(1, result);
//	}
	
	
	
}
	
