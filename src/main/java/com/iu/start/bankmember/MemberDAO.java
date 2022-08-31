package com.iu.start.bankmember;

import java.util.List;

public interface MemberDAO {

public BankMemberDTO getLogin(BankMemberDTO bankmemberDTO) throws Exception;
	
	public int setJoin(BankMemberDTO bankmembersDTO ) throws Exception;

	public List<BankMemberDTO> getSearchById(String search) throws Exception;
	
	
	public BankMemberDTO getMyPage(BankMemberDTO bankmemberDTO) throws Exception;
}
