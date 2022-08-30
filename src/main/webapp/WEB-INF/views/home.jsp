<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
	
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:if test=" ${empty sessionScope.member}">
로그인<a href="./bankmember/login.aa">Login</a>
회원가입<a href="./bankmember/join.aa">join</a>
</c:if>
<hr>
<c:if test=" ${not empty sessionScope.member}">
<h3>${sessionScope.member.name} 환영합니다.</h3>
<a href= "./bankmember/logout.aa">logout</a>
<a href="#">mypage</a> 
</c:if>

상품 추가<a href="./bankbook/add.aa "> add </a>
id 검색<a href="./bankmember/search.aa "> member search </a>
통장 정보<a href="./bankbook/list.aa "> member list </a>


</body>
</html>
