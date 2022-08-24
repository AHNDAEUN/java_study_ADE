/*
 * package com.iu.start.home.bankbookMembers;
 * 
 * import static org.junit.Assert.*;
 * 
 * import java.util.List;
 * 
 * import org.junit.Test;
 * 
 * import com.iu.start.bankmember.BankMemberDAO;
 * 
 * public class bankbookMemberDAOTest extends myAbstractTest {
 * 
 * 
 * 
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