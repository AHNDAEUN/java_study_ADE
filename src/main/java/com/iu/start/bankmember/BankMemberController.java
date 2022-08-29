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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/bankmember/*")
public class BankMemberController {
	//이 클래스는 Controller역할, 
	//Container에게 이 클래스의 객체를 생성 위임
	
	@Autowired
	private BankMemberService bankMemberService;
	
	@RequestMapping(value= "login.aa", method = RequestMethod.GET)
	public String login() throws Exception {
		System.out.println("log get");
	 return "bankmember/login";
	}
	
	@RequestMapping(value= "login.aa", method= RequestMethod.POST )
	public String login( HttpSession session, BankMemberDTO bankMemberDTO) throws Exception{
		System.out.println("logpost");

		bankMemberDTO = bankMemberService.getLogin(bankMemberDTO);
		System.out.println(bankMemberDTO);
		
		session.setAttribute("bankmember", bankMemberDTO);
		
		// "redirect:다시접속할URL주소(절대경로,상대경로)"
		return "redirect:../";
		
		
	}
	
	
	@RequestMapping(value= "logout.aa", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
	
		
		session.invalidate();
		
		return "redirect:../";
	}
	
	@RequestMapping(value= "join.aa", method = RequestMethod.GET)
	public String join() {
		
		System.out.println("join Get 실행");
		return "bankmember/join";
		
	}
	
	
	@RequestMapping(value= "join.aa", method = RequestMethod.POST)
	public String join(BankMemberDTO bankMemberDTO, MultipartFile photo) throws Exception{
		
		System.out.println(" join Post 실행");
		System.out.println(photo);
		System.out.println("업로드 시 파일명:"+photo.getOriginalFilename());
		System.out.println("업로드 시 파라미터명:"+photo.getName()); //photo가 들어와
		System.out.println("업로드하는 파일의 크기:"+photo.getSize());
		int result= bankMemberService.setJoin(bankMemberDTO,photo);
		
		
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
		mv.setViewName("/bankmember/list");

		return mv;
	}
	
	@RequestMapping (value="mypage.aa", method=RequestMethod.GET)
	public ModelAndView myPage(HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		BankMemberDTO bankMemberDTO = (BankMemberDTO)session.getAttribute("member");
//		Map<String, Object> map = new HashMap<String, Object>();
//		map = bankMemberService.getMyPage(bankMembersDTO);
//		
//		mv.addObject("dto", map);
		
		bankMemberDTO = bankMemberService.getMyPage(bankMemberDTO);
		//List<BankAccountDTO> ar = bankAccountService.getList(bankMembersDTO);
		
		//mv.addObject("list", ar);
		mv.addObject("dto", bankMemberDTO);
		mv.setViewName("member/mypage");
		
		return mv;
	}
}