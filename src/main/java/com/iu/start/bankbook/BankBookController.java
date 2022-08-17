package com.iu.start.bankbook;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

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
	public ModelAndView detail(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		
		mv.setViewName("bankbook/detail");
		mv.addObject("dto",bankBookDTO);
		
		return mv;
	}
	
	@RequestMapping(value="add.aa", method=RequestMethod.GET)
	public void add() throws Exception{
		System.out.println("상품 등록 실행 GET");
		
	}
	
	@RequestMapping(value="add.aa" ,method=RequestMethod.POST)
	public ModelAndView add(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		Calendar ca = Calendar.getInstance();
		long num = ca.getTimeInMillis();
		
		bankBookDTO.setBookNum(num);
		bankBookDTO.setBookSale(true);

		bankBookService.setBankBook(bankBookDTO);
		
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
		
		return mv;

	}
	
	@RequestMapping(value="delete.aa", method=RequestMethod.GET)
	public ModelAndView delete(BankBookDTO bankBookDTO, ModelAndView mv) throws Exception {
		int result = bankBookService.setDelete(bankBookDTO);
		
		mv.setViewName("redirect:./list.aa");
		
		return mv;
	}
	
	

}
