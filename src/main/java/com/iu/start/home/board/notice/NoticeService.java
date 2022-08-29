package com.iu.start.home.board.notice;

import java.io.File;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.start.bankmember.BankMemberFileDTO;
import com.iu.start.home.board.impl.BoardDTO;
import com.iu.start.home.board.impl.BoardFileDTO;
import com.iu.start.home.board.impl.BoardService;
import com.iu.start.home.util.FileManager;
import com.iu.start.home.util.Pager;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private FileManager fileManager;

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		
		Long totalCount = noticeDAO.getCount(pager);
		pager.getNum(totalCount);
		pager.getRowNum();
		// TODO Auto-generated method stub

		/*
		 * System.out.println("service page"+page);
		 * 
		 * Long perPage = 10L; // 한페이지에 출력할 목록의 갯수
		 * 
		 * // 한 페이지에 10개씩 출력 기준 //page // startrow lastrow //1 1 10 //2 11 20 //3 21 30
		 * 
		 * //Long startRow = page*10-9; Long startRow= (page-1)*perPage+1; Long lastRow
		 * = page*perPage;
		 * 
		 * System.out.println("startRow:" + startRow); System.out.println("lastRow:" +
		 * lastRow);
		 ******************************
		 * 
		 * 
		 * 
		 * jsp에 페이지번호를 출력 1-? 1. 글의 총갯수 => dao getcount 호출 2. 글의 총 갯수를 이용해서 총 페이지 수 구하기
		 * (한페이지당 10개)
		 * 
		 * 
		 * 
		 * Long totalcount = noticeDAO.getCount(); // 글의 총 갯수
		 * //-------------------------------------- Long totalPage = totalcount/perPage;
		 * // 글 총 페이지 수 // 숫자를 10으로 나눴을때 나머지가 0인지 아닌지
		 * 
		 * //11,12,13씩 나머지가 0이 아닌 것 if (totalcount%perPage !=0) {
		 * 
		 * //totalpage = totalPage+1; totalPage++; } //----------------------- //3.전체
		 * 블럭의 갯수 구하기 //block: 토탈페이지가 10개일 경우 5개 나눌때 1-5, 6-10 등 //한단위당 block으로 명칭하고
		 * 토탈블럭은 2개 //perblock : 한페이지에 출력할 번호의 수 // 1 ~ n개까지 출력할것인지 Long perblock= 5L;
		 * 
		 * Long totalblock = totalPage/perblock; if(totalPage/perblock != 0 ) {
		 * 
		 * totalblock++; }
		 * 
		 * //------------------------- //4. page로 현재 block 번호 찾기 // page block 1 1 2 1 3
		 * 1 4 1 5 1 6 2 7 2 .... 10 2 11 3
		 * 
		 * Long curBlock= page/perblock; if (page%perblock !=0) {
		 * 
		 * curBlock++; }
		 * 
		 * //------------------------- //5. 현재블럭 번호(curblock)으로 시작번호와 끝번호 알아오기 curblock
		 * startNum lastNum 1 1 5 2 6 10 3 11 15
		 * 
		 * 
		 * Long startNum= (curBlock-1)*perblock+1; Long lastNum= curBlock*perblock;
		 * 
		 * 
		 * Map<String, Long> map= new HashMap<String, Long>(); map.put("startRow",
		 * startRow); map.put("lastRow", lastRow);
		 */

		return noticeDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile[] files, ServletContext servletContext) throws Exception {
		// TODO Auto-generated method stub
		
	int result =noticeDAO.setAdd(boardDTO);
	String path=("/resources/upload/notice");
	
	for(MultipartFile multipartFile: files) {
		
		if(multipartFile.isEmpty()) {
			
			continue;
		}
		String fileName= fileManager.saveFile(servletContext, path, multipartFile);
		BoardFileDTO boardFileDTO =new BoardFileDTO();
		boardFileDTO.setFileName(fileName);
		boardFileDTO.setOriName(multipartFile.getOriginalFilename());
		boardFileDTO.setNum(boardDTO.getNum());
	}
		
		
		 return result; // noitceDAO.setAdd(boardDTO);
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
