package com.iu.home.bankbookMembers;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BankmeMberDAO1 {
	
	@Autowired
	private SqlSession sqlSession;
	//join
	public int setJoin(String userName) throws Exception {
		return 1;
	}

	// login
	public Object getLogin(String userName) throws Exception {
		return null; 
		
	}

	//search
	public List<Object> getSearch(String search) throws Exception{
		ArrayList<Object> ar =new ArrayList<Object>();
		return ar;
		// 만들때는 자식 타입 보내질때는 list(list자체로는 객체를 못만듬 interface)
		//size가 1개도 안들어가면 null
	} 
	//부모형태의 list로 리턴

}
