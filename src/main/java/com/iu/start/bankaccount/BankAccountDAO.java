package com.iu.start.bankaccount;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.bankaccount.BankAccountDAO.";
	
	public int add(BankAccountDTO bankAccountDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"add", bankAccountDTO);
	}
}
