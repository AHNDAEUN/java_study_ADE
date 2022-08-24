package com.iu.start.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.start.home.board.impl.BoardDTO;
import com.iu.start.home.board.notice.NoticeService;

@Controller
public class QnaController {
	
	
	@Autowired
	private QnaService qnaService;
	
	//글목록
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getList()throws Exception{
		ModelAndView mv = new ModelAndView();
		List<QnaDTO> ar=qnaService.getList();
		
		
		mv.addObject("list", ar);
		mv.addObject("board", "notice");
		mv.setViewName("board/list");
		return mv; 
	}
	
	//글상세
	@RequestMapping(value="detail",method = RequestMethod.GET)
	public String getDetail(QnaDTO qnaDTO, Model model)throws Exception{
		qnaDTO = qnaService.getDetail(qnaDTO);
		model.addAttribute("qnaDTO", qnaDTO);
		return "qna/detail";
	}
	
	//글작성
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String setAdd()throws Exception{
		return "qna/add";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setAdd(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setAdd(qnaDTO);
		mv.setViewName("redirect:./list");
		return mv;
		
	}
	
	//글수정
	@RequestMapping(value = "update")
	public ModelAndView setUpdate(QnaDTO qnaDTO, ModelAndView mv)throws Exception{
		qnaDTO=qnaService.getDetail(qnaDTO);
		
		mv.addObject("qnaDTO", qnaDTO);
		mv.setViewName("qna/update");
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String setUpdate(QnaDTO qnaDTO)throws Exception{
		
		int result = qnaService.setUpdate(qnaDTO);
		return "redirect:./detail?num="+qnaDTO.getNum();
	}
	
	
	//글삭제
	public String setDelete(QnaDTO qnaDTO)throws Exception{
		int result = qnaService.setUpdate(qnaDTO);
		return "redirect:./list";
	}
	

}
