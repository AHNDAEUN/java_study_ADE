package com.iu.start.bankbook;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping(value="/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value="list.aa", method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		
		List<BankBookDTO> ar = bankBookService.getList();
		
		model.addAttribute("list",ar);
		
		return "bankbook/list";
		
	}
	
	@RequestMapping(value="detail.aa", method=RequestMethod.GET)
	public ModelAndView getDetail(BankBookDTO bankBookDTO, HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		session.setAttribute("dto", bankBookDTO);
		mv.setViewName("bankbook/detail");
		mv.addObject("dto",bankBookDTO);
		
		return mv;
	}
	
	
	@RequestMapping(value="add.aa", method=RequestMethod.GET)
	public void add(BankBookDTO bankBookDTO, Model model ) throws Exception{
		System.out.println("상품 등록 실행 GET");
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("dto", bankBookDTO);
	}
		

	
	// /bankbook/add POST
	// name, rate
	@RequestMapping(value="add.aa", method=RequestMethod.POST)
	public ModelAndView add(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("add post 실행");
		System.out.println(bankBookDTO.getBookNum());
		System.out.println(bankBookDTO.isBookSale());
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		Calendar ca = Calendar.getInstance();
		bankBookDTO.setBookNum(ca.getTimeInMillis());
		int result= bankBookService.setBankBook(bankBookDTO);
		
		//등록 후 리스트 페이지로 이동
		mv.setViewName("redirect:./list.aa");
		
		return mv;
	}
	
	@RequestMapping(value="update.aa", method=RequestMethod.GET)
	public void update(BankBookDTO bankBookDTO, Model model) throws Exception {
		System.out.println("UPDATE GET");
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		
		model.addAttribute("dto", bankBookDTO);
	}
	
	@RequestMapping(value="update.aa", method=RequestMethod.POST)
	public ModelAndView update(BankBookDTO bankBookDTO, ModelAndView mv) throws Exception {
		System.out.println("UPDATE POST");
		
		int result = bankBookService.setUpdate(bankBookDTO);
		
		mv.setViewName("redirect:./detail.aa?bookNum="+bankBookDTO.getBookNum());

//		if(result>0) {
//			System.out.println("성공");
//			modelAndView.setViewName("redirect:./detail.do?bookNum="+bankBookDTO.getBookNum());
//		}
		
		return mv;

	}
	
	@RequestMapping(value="delete.aa", method=RequestMethod.GET)
	public ModelAndView delete(BankBookDTO bankBookDTO, ModelAndView mv) throws Exception {
		int result = bankBookService.setDelete(bankBookDTO);
		
		mv.setViewName("redirect:./list.aa");
		
		return mv;
	}
	
	

}
