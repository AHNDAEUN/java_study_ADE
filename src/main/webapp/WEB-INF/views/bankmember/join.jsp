<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Join page </h1>
	<div  class = "container">
	<h3> 회원가입 </h3>
	
	<hr>
		<form action = "join.aa" method ="POST" >
		<div>
		    아이디 입력 <input type="text" name = "userName">
		    <br>
		    
		    비밀번호 입력 <input type="password" name ="password" value="비밀번호(8~32자리)">  
		     <br>
		    
		    비밀번호 확인 <input type="password" value="비밀번호 재입력">
		    <br>
		    
		    이름 입력 <input type="text" name ="name">
		    <br>
		    
		    생년월일 <input type="date">
		    <br>
		    
		    성별 <select>
		        <OPtion >남</OPtion>
		        <OPtion >여</OPtion>
		    </select>
		    <br>
		    
		    이메일 입력<input type = "text" name = "email">
		    <br>
		    
		    전화번호 입력 <input type="text" name = "phone" value="010 - - " >
		    <br>
		
		     주소 입력 <textarea rows="2" cols="30"> </textarea>
		
		</div>
		
		<div>
		    <br><br><br>
		    <a href = "/" > <input type="submit" value="회원가입"> </a>
		    <a href = "./login" > <button> 취소 </button> </a>
		
		</div>
		
		</form>

</body>
</html>