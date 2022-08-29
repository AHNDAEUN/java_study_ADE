package com.iu.start.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
	//수정
	//등록
	//판매여부 변경
	//리스트조회
	//항목조회
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.bankbook.BankBookDAO.";
	
	//insert
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setBankBook", bankBookDTO);
			
	}
	
	//모든 데이터를 조회
	public List<BankBookDTO> getList() throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getList");
			
	}
	
	//sale의 값 바꾸기
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
			
		return sqlSession.update(NAMESPACE+"setChangeSale", bankBookDTO);
	}
	
	//BookNum의 값으로 조회
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
			
		return sqlSession.selectOne(NAMESPACE+"getDetail", bankBookDTO);
	}
		
	//BankBook 업데이트
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
			
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}
		
	//BankBook 삭제
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
			
		return sqlSession.delete(NAMESPACE+"setDelete", bankBookDTO);
	}
	

}
