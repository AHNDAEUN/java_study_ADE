<%@page import="com.iu.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- 
    <%
	//요청이 발생하면 생성, 응답이 나가면 소멸 : RequestScope 
    BankBookDTO bankbookDTO = (BankBookDTO) request.getAttribute("dto"); 
    %>
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook Detail</h1>
	
	<table border = "4">
	
		<tr>
		<th>num</th>
		<th>name</th>
		<th>rate</th>
		<th>sale</th>
		
		</tr>
		
		<tr>
		<td>${requestScope.dto.bookNum}</td>
		<td>${requestScope.dto.bookName}</td>
		<td>${dto.bookRate}</td>
		<td>${dto.bookSale}</td>
		
		
		</tr>
	</table>
	
	<a href="./list.aa">리스트보기</a>
	<input type="button" value="뒤로가기" onClick="location.href='list.aa'">
	<!-- 상대경로 -->
	<a href = "../bankmember/login.aa" >Login</a>
	<!-- 절대경로 -->
	<a href ="../bankmember/join.aa">Join</a>
	<a href ="./bankbook/update.aa?bookNum=${dto.bookNum}">Update</a>
	<a href ="./bankbook/delete.aa?bookNum=${dto.bookNum }">Delete</a>
	<c:if test="${not empty sessionScope.member}">
	<a href ="../bankaccount/add.aa?bookNum=${dto.bookNum }">가입하기</a>
	</c:if>
</body>
</html>