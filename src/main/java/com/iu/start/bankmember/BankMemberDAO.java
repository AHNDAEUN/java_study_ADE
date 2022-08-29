package com.iu.start.bankmember;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankMemberDAO implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.bankmember.BankMemberDAO.";
	
	
	public int setAddFile(BankMemberFileDTO bankMemberFileDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setAddFile",bankMemberFileDTO);
	}
	
	public BankMemberDTO getLogin(BankMemberDTO bankMemberDTO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getLogin",bankMemberDTO);
		
	} 
		
	public int setJoin(BankMemberDTO bankMemberDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setJoin",bankMemberDTO);
		
		
	}
			

	public List<BankMemberDTO> getSearchById (String search) throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getSearchById", search);
	}

	@Override
	public BankMemberDTO getMyPage(BankMemberDTO bankMemberDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getMyPage", bankMemberDTO);
	} 

}
