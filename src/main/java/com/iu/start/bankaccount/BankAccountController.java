package com.iu.start.bankaccount;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.start.bankbook.BankBookDTO;
import com.iu.start.bankmember.BankMemberDTO;

@Controller
@RequestMapping(value="/bankaccount/*")
public class BankAccountController {
	
	@Autowired
	private BankAccountService bankAccountService;
	
	@RequestMapping(value="add.aa", method = RequestMethod.GET)
	public String setAc(BankAccountDTO bankAccountDTO,HttpSession session) throws Exception{
		System.out.println("setGet");
		BankBookDTO bankbookDTO = (BankBookDTO)session.getAttribute("dto");
		BankMemberDTO bankMembersDTO = (BankMemberDTO) session.getAttribute("member");
		bankAccountDTO.setUserName(bankMembersDTO.getUserName());
		bankAccountDTO.setBookNum(bankbookDTO.getBookNum());
		session.setAttribute("account", bankAccountDTO);

	
		//DTO : userName, bookNum
		int result = bankAccountService.setAccount(bankAccountDTO);
		
		
		return "redirect:./bankbook/list.aa";
	}
	

	@RequestMapping(value="add.aa", method=RequestMethod.POST)
	public ModelAndView setA (BankAccountDTO bankaccountDTO) throws Exception {
		System.out.println("setPost");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:./add.aa");
		int result = bankAccountService.setAccount(bankaccountDTO);
		if(result>0) {
			mv.setViewName("redirect:../");
			return mv;
		}
		return mv;
	}
}
