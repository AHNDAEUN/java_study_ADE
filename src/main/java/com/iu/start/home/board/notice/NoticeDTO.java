package com.iu.start.home.board.notice;

import java.util.List;

import com.iu.start.home.board.impl.BoardDTO;
import com.iu.start.home.board.impl.BoardFileDTO;

public class NoticeDTO extends BoardDTO {
	
	private List<BoardFileDTO> boardFileDTOs;
	// 새로추가되는

	public List<BoardFileDTO> getBoardFileDTOs() {
		return boardFileDTOs;
	}

	public void setBoardFileDTOs(List<BoardFileDTO> boardFileDTOs) {
		this.boardFileDTOs = boardFileDTOs;
	}
	
	
	


}
