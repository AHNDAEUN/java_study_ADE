package com.iu.start.bankmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BankMemberService {
	
	
	
	@Autowired
	private BankMemberDAO bankMemberDAO;
	
	public BankMemberDTO getLogin(BankMemberDTO bankMemberDTO) throws Exception {
		
		return bankMemberDAO.getLogin(bankMemberDTO); 
	} 
		
	public int setJoin(BankMemberDTO bankMemberDTO) throws Exception {
		
		return bankMemberDAO.setJoin(bankMemberDTO);
		
	}
			

	public List<BankMemberDTO> getSearchById (String search) throws Exception{
		
		return bankMemberDAO.getSearchById(search);
}

}
