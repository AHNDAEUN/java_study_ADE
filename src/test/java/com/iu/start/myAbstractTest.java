package com.iu.start;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class myAbstractTest {

	@Autowired //주입
	private SqlSession sqSession;
	
	@Test
	public void test() {
		// 단정문 = null이 아니길 희망
		assertNotNull(sqSession);
		//notnull= true
		fail("Not yet implemented");
	}

}
