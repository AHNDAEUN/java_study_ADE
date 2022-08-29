<%@page import="com.iu.start.bankbook.BankBookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <%--  <%ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>) request.getAttribute("list"); %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bankbook list</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<style>
    .align-center {text-align: center;}
</style>
</head>
<body>
	<!-- /bankbook/list -->
	
	<!-- /bankbook/detail jsp:detail.jsp  -->
	<!-- link 주소는 상대경로 작성 -->
	<c:import url="../template/header.jsp"></c:import>
	<br><br>
	<h1 class="align-center">List Page</h1>
	<br>
	<section class="container-fluid col-lg-6">
		<div class="row">
		<table class="table">
		  <thead class="table-dark">
		    <tr>
		      <th scope="col">상품 이름</th>
		      <th scope="col">이자율</th>
		    </tr>
		  </thead>
		  <tbody>
		    <c:forEach items="${list}" var="dto" >
				<tr>
					<td><a href="./detail.aa?bookNum=${dto.bookNum}">${dto.bookName}</a></td>
					<td>${dto.bookRate}</td>	
				</tr>
			</c:forEach>
				
					
			</tbody>
				
				
		
		</table>
		<a href="./add.aa" class="btn btn-primary">상품등록</a>
		
	</div>
	</section>
	
	<c:import url="../template/footer.jsp"></c:import>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	

</body>
</html>