package com.iu.start.home.board.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.start.home.board.impl.BoardDTO;
import com.iu.start.home.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeCotroller {

	@Autowired
	private NoticeService noticeService;
	
	//글목록
	@RequestMapping(value = "list.aa", method = RequestMethod.GET)
	public ModelAndView getList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		
	System.out.println(pager.getPage());
	System.out.println(pager.getKind());
	System.out.println(pager.getSearch());
	
	   
		System.out.println(pager);
		
//		System.out.println("page"+page);
		List<BoardDTO> ar = noticeService.getList(pager);
		
		mv.addObject("list", ar);
		mv.addObject("pager",pager);
		mv.setViewName("board/list");
		return mv; 
	}
	
	//글상세
	@RequestMapping(value="detail.aa",method = RequestMethod.GET)
	public String getDetail(BoardDTO boardDTO, Model model)throws Exception{
		boardDTO = noticeService.getDetail(boardDTO);
		model.addAttribute("boardDTO", boardDTO);
		return "board/detail.aa";
	}
	
	//글작성
	@RequestMapping(value = "add.aa", method = RequestMethod.GET)
	public String setAdd()throws Exception{
		return "board/add.aa";
	}
	
	@RequestMapping(value = "add.aa", method = RequestMethod.POST)
	public ModelAndView setAdd(BoardDTO boardDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setAdd(boardDTO);
		mv.setViewName("redirect:./list.aa");
		return mv;
		
	}
	
	//글수정
	@RequestMapping(value = "update.aa")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv)throws Exception{
		
		boardDTO = noticeService.getDetail(boardDTO);
		
		mv.addObject("boardDTO", boardDTO);
		mv.setViewName("board/update");
		return mv;
	}
	
	@RequestMapping(value = "update.aa", method = RequestMethod.POST)
	public String setUpdate(BoardDTO boardDTO)throws Exception{
		int result = noticeService.setUpdate(boardDTO);
		return "redirect:./detail.aa?num="+boardDTO.getNum();
	}
	
	
	//글삭제
	@RequestMapping(value = "delete.aa", method = RequestMethod.POST)
	public String setDelete(BoardDTO boardDTO)throws Exception{
		int result = noticeService.setDelete(boardDTO);
		return "redirect:./list.aa";
	}
	
	
}
