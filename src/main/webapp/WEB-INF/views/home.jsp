<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
<a href="./member/login.aa">Login</a>
<a href="./member/join.aa">join</a>
</c:if>
<hr>
<c:if test=" ${not empty sessionScope.member}">
<h3>${sessionScope.member.name} 환영합니다. </h3>
<a href= "./member/logout.aa">logout</a>
<a href="#">mypage</a> 
</c:if>

<a href="./bankbook/add.aa "> add </a>
<a href="./member/search.aa "> member search </a>
<a href="./bankbook/list.aa "> member list </a>
</body>
</html>
</body>
</html>
