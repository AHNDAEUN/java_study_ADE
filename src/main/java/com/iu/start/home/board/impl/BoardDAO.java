package com.iu.start.home.board.impl;

import java.util.List;
import java.util.Map;

import com.iu.start.home.util.Pager;

public interface BoardDAO {
	
	//file 추가
	public Long setAddFile(BoardDTO BoardDTO) throws Exception;
	
	//글의 총갯수
	
	public Long getCount(Pager pager) throws Exception;
	//글목록
	
	public List<BoardDTO> getList(Pager pager) throws Exception;
	
	// 글상세보기
	
	public BoardDTO getDetail(BoardDTO BoardDTO) throws Exception;
	
	// 글쓰기
	
	public int setAdd(BoardDTO BoardDTO) throws Exception;
	
	// 글수정
	
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	//글삭제
	
	public int setDelete(BoardDTO boardDTO) throws Exception;

}
