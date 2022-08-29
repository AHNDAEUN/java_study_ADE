package com.iu.start.bankaccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.start.bankmember.BankMemberDTO;

@Service
public class BankAccountService {

	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	public int setAccount(BankAccountDTO bankAccountDTO) throws Exception {
		int result = bankAccountDAO.setAccount(bankAccountDTO);
		return result;
	}
	
	public List<BankAccountDTO> getList(BankMemberDTO bankMemberDTO) throws Exception{
		
		return bankAccountDAO.getListByUserName(bankMemberDTO);
	}
}
