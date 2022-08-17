<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Login Page</h1>
	                   <!-- value에서 미리 값을 저장 -->
	<div>
        <form action="./login.aa" method="POST">
        
            <div class="container">
                <h2>ID 로그인</h2>
                <div>
                   	  <input type="text" value="user2" name="userName" >
                </div>
                 <div>
                      <input type="password" value="pw2" name="password">
                    <br>
                </div>
               
                   <div class="login">
                       	 <input type="submit" value="로그인">
                         <input type="reset" value="초기화">
                         자동로그인 <input type="checkbox" value="체크박스">
                       
                  </div>
                </div>
                
                	 <button > 아이디 찾기</button> 
       				 <button > 비밀번호 찾기</button>
                
	                 <a href = "join.aa"><input type="button" value="회원가입 하기"></a>
	       			 <a href= "/"><input type="button" value="메인 페이지로 돌아가기"></a>
        </div>
        </form>
   


</body>
</html>