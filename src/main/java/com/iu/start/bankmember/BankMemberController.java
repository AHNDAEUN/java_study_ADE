package com.iu.start.bankmember;

import java.util.List;

import javax.print.DocFlavor.STRING;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/bankmember/*")
public class BankMemberController {
	
	
	@Autowired
	private BankMemberService bankMemberService;
	
	@RequestMapping(value= "login.aa", method = RequestMethod.GET)
	public void login() throws Exception {}
	
	@RequestMapping(value= "login.aa", method= RequestMethod.POST )
	public String login( HttpSession session, BankMemberDTO bankMemberDTO) throws Exception{
		

		bankMemberDTO = bankMemberService.getLogin(bankMemberDTO);
		System.out.println(bankMemberDTO);
		
		session.setAttribute("bankmember", bankMemberDTO);
		
		return "redirect:../";
		
		
	}
	@RequestMapping(value= "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
	
		
		session.invalidate();
		
		return "redirect:../";
	}
	
	@RequestMapping(value= "join.aa", method = RequestMethod.GET)
	public String join() {
		
		System.out.println("join Get 실행");
		return "member/join";
		
	}
	
	
	@RequestMapping(value= "join.aa", method = RequestMethod.POST)
	public String join(BankMemberDTO bankMemberDTO) throws Exception{
		
		System.out.println(" join Post 실행");
		int result= bankMemberService.setJoin(bankMemberDTO);
		
		
		return "redirect:./login.aa";
	}
	
	@RequestMapping( value= "search.aa", method = RequestMethod.GET)
	public void getSearchById() throws Exception {
		
		
		System.out.println("search 실행");
	}
	
	
	

	@RequestMapping(value= "search.aa", method = RequestMethod.POST)
	public ModelAndView getSearchById(String search, Model model) throws Exception{
		
		
		List<BankMemberDTO> ar =bankMemberService.getSearchById(search);
		model.addAttribute("list", ar);
		ModelAndView mv = new  ModelAndView();
		mv.setViewName("/member/list");

		return mv;
	}
	
}


	

