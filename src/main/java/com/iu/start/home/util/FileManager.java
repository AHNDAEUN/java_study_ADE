package com.iu.start.home.util;

import java.io.File;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {

	//@Autowired  // 만들어서 찾아낸 객체를 주입
	//private ServletContext servletContext;
	
	//2. 매개변수로 받아오기
	//saveFile(ServletContext servletContext)
	
	//3.
	//save
	public String saveFile(ServletContext servletContext, String path, MultipartFile multipartFile) throws  Exception{
	// HDD를 저장	
		
		//1. 실제경로
		String realPath = servletContext.getRealPath(path);
		System.out.println(realPath);
		
		//2. 폴더(디렉토리) 체크
		File file = new File(realPath);
			
			if(!file.exists()) {
				
				file.mkdirs(); // 없으면 드렉토리를 만들어줌
			}
				//3.저장할 파일명 생성
				String fileName = UUID.randomUUID().toString();
				fileName= fileName+"_"+multipartFile.getOriginalFilename();
				
				//4.HDD저장
				file = new File(file, fileName);
				multipartFile.transferTo(file);
				
				return fileName;
	}

}
