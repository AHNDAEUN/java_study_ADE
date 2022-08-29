package com.iu.start.home.bankbookMembers;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.start.bankmember.BankMemberDTO;
import com.iu.start.bankmember.BankMemberService;
import com.iu.start.home.board.MyAbstractTest;

public class bankbookMemberDAOTest extends MyAbstractTest {

	@Autowired
	private BankMemberService bankMemberService;
	private BankMemberDTO bankMemberDTO;
		
	@Test
	public void getLoginTest() throws Exception {
		bankMemberDTO = new BankMemberDTO();
		bankMemberDTO.setUserName("1234");
		bankMemberDTO.setPassword("1");
		bankMemberDTO = bankMemberService.getLogin(bankMemberDTO);
		assertNull(bankMemberDTO);
	}
	
	@Test
	public void setJoinTest() throws Exception {
		bankMemberDTO = new BankMemberDTO();
		bankMemberDTO.setUserName("56");
		bankMemberDTO.setPassword("s");
		bankMemberDTO.setName("s");
		bankMemberDTO.setEmail("s");
		bankMemberDTO.setPhone("s");
		int result =bankMemberService.setJoin(bankMemberDTO);
		assertEquals(1, result);
	}
		
		@Test
		public void getSearchById() throws Exception {
			List<BankMemberDTO> ar = bankMemberService.getSearchById("a");
			assertEquals(0, ar.size());
		}
		
//		@Test
//		public void getListTest() throws Exception{
//			BankMembersDTO bankMembersDTO = new BankMembersDTO();
//			bankMembersDTO.setUserName("1234");
//			Map<String, Object> map = bankMemberService.getMyPage(bankMembersDTO);
//			assertNotEquals(0, map);
//		}

	
	
	
	
	
	
	
/*  
 * //만들어진 객체를 주입해주는 @Autowired //<bean> 객체 만들어줌
 * 
 * 
 * //DAO 메서드 호출 private BankmeMberDAO1 bankMemberDAO1;
 * 
 * @Test public void setJoinTest() throws Exception { int result =
 * bankMemberDAO1.setJoin("df"); // 샘플데이터를 직접 입력 ,서버 실행시 필요한 dto를 넣어줌
 * //assertEquals(1, result); // 1이 오길 희망함 // actual= 실제값 -> result ,expect=희망함
 * 
 * //throw: 예외객체를 강제로 만들때 사용 throw new Exception();
 * 
 * }
 * 
 * @Test public void getLoginTest()throws Exception {
 * 
 * Object obj = bankMemberDAO1.getLogin("df");
 * 
 * assertNull(obj); //틀린 아이디를 입력해서 null이 나오길 희망함 }
 * 
 * 
 * 
 * @Test public void getSearch() throws Exception { List<Object> ar =
 * bankMemberDAO1.getSearch("ad");
 * 
 * assertNotEquals(0, ar.size()); //ar.size가 0이 아니길 희망함 }
 * 
 * }
 */
}