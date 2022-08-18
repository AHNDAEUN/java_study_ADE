package com.iu.start.bankmember;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankMemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.bankmember.BankMemberDAO.";
	
	public BankMemberDTO getLogin(BankMemberDTO bankMemberDTO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getLogin",bankMemberDTO);
		
	} 
		
	public int setJoin(BankMemberDTO bankMemberDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setJoin",bankMemberDTO);
		
		
	}
			

	public List<BankMemberDTO> getSearchById (String search) throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getSearchById", search);
	} 

}
