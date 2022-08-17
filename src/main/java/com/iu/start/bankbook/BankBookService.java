package com.iu.start.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	//insert
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.setBankBook(bankBookDTO);
		
	}
	
	//모든 데이터를 조회
	public List<BankBookDTO> getList() throws Exception {
		
		return bankBookDAO.getList();
		
	}
	
	//sale의 값 바꾸기
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		
		return bankBookDAO.setChangeSale(bankBookDTO);
		
	}
	
	//BookNum의 값으로 조회
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		
		return bankBookDAO.getDetail(bankBookDTO);
	}
	
	//BankBook 업데이트
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	//BankBook 삭제
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		
		return bankBookDAO.setDelete(bankBookDTO);
	}

}
