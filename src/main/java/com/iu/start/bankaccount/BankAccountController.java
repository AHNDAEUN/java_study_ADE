package com.iu.start.bankaccount;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.start.bankmember.BankMemberDTO;

@Controller
@RequestMapping(value="/bankaccount/*")
public class BankAccountController {
	
	@Autowired
	private BankAccountService bankAccountService;
	
	public String add(BankAccountDTO bankAccountDTO,HttpSession session) throws Exception{
		
		BankMemberDTO bankMembersDTO = (BankMemberDTO) session.getAttribute("member");
		bankAccountDTO.setUserName(bankMembersDTO.getUserName());
		
		int result = bankAccountService.add(bankAccountDTO);
		
		
		return "redirect:./bankbook/list.aa";
	}
	

}
