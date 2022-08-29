package com.iu.start.bankmember;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.swing.TransferHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.start.bankaccount.BankAccountService;
import com.iu.start.bankmember.BankMemberDAO;

@Service
public class BankMemberService {
	
	
	
	@Autowired
	private BankMemberDAO bankMemberDAO;
	@Autowired
	private BankAccountService bankAccountService;
	@Autowired
	private ServletContext servletContext;
	

	public BankMemberDTO getLogin(BankMemberDTO bankMemberDTO) throws Exception {
		
		return bankMemberDAO.getLogin(bankMemberDTO); 
	} 
		
	public int setJoin(BankMemberDTO  bankMemberDTO, MultipartFile photo) throws Exception {
	 int result=bankMemberDAO.setJoin(bankMemberDTO);
		//1. HDD에 파일을 저장
		//- 파일 저장 시 파일의 경로는 TOMCAT기준이 아닌 운영체제의 기준으로 설정
		//1) 파일 저장 위치 
		/// /resources/upload/member
		//2) 저장할 폴더의 실제경로 반환(OS 기준)
		String realpath= servletContext.getRealPath("resources/upload/member");
		System.out.println("Realpath : "+realpath);
		
		//3) 저장할 폴더의 정보를 가지는 자바객체를 생성
		File file = new File(realpath);
		
		//** file 첨부가 없을때 구분
		//if (photo.getSize()!==0) 
		if(!photo.isEmpty()){
			
		if(!file.exists()) {
			
			file.mkdirs(); // 없으면 드렉토리를 만들어줌
		}
		//4) 파일을 저장할때 중복되지 않는 파일명 생성
		//      -- 시간, java api (class이용:uuid),..
		String fileName= UUID.randomUUID().toString();
		System.out.println(fileName);
		
		Calendar ca = Calendar.getInstance();
		Long time =ca.getTimeInMillis();
		fileName= fileName+"_"+photo.getOriginalFilename();
		System.out.println(fileName);
		// 이상태로 저장하면 어떤 파일인지 구분하기 어려워 확장자를 붙여야함
		
		
		//5) HDD에 파일 저장
		// 어느 폴더에 어떤 이름으로 저장할 file 객체 생성
			file = new File(file, fileName);
			      		  // 경로, 저장할 위치(파일명)
		//(1) multipartfile 클래스에 transferTo(전송)메서드 사용
			photo.transferTo(file);
			
		//(2) fileCopyUtils 클래스의 copy 메서드 사용
		
		
		//2 저장된 파일 정보를 DB에 저장 
			BankMemberFileDTO membersFileDTO =new BankMemberFileDTO();
			membersFileDTO.setFileName(fileName);
			membersFileDTO.setOriName(photo.getOriginalFilename());
			membersFileDTO.setUserName(bankMemberDTO.getUserName());
			bankMemberDAO.setAddFile(membersFileDTO);
			
		}// isempty 끝
		
		
		return result;
		
	}
			

	public List<BankMemberDTO> getSearchById (String search) throws Exception{
		
		return bankMemberDAO.getSearchById(search);
}

	
//	public Map<String, Object> getMyPage(BankMemberDTO bankMemberDTO) throws Exception {
//	Map<String, Object> map = new HashMap<String, Object>();
//	bankMemberDTO = bankMembersDAO.getMyPage(bankMemberDTO);
//	List<BankAccountDTO> ar = bankAccountService.getList(bankMembersDTO); 
//	map.put("list", ar);
//	map.put("dto", bankMemberDTO);
//	return map;
//}	
	
	public BankMemberDTO getMyPage(BankMemberDTO bankMemberDTO) throws Exception{
		return bankMemberDAO.getMyPage(bankMemberDTO);

	}
	
	
}
