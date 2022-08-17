<%@page import="com.iu.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%BankBookDTO bankBookDTO = new BankBookDTO(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    .align-center {text-align: center;}
</style>
<body>
	<form action="update.iu" class="align-center" method="post" >
		<div>
		<h1>Update Page</h1>
		</div>
		BookNum<input type="text" name="bookNum" readonly="readonly" value="${dto.bookNum}" >
		<div>
		BookName<input type="text" name="bookName" value = "${dto.bookName}">
		</div>
		<div>
		BookRate<input type="text" name="bookRate" value = "${dto.bookRate}">
		</div>
		<input type ="submit" value="Update">
	
</form>
</body>
</html>