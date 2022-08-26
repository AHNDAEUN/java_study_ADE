<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>

<c:import url="../template/header.jsp"></c:import>
<br><br>
<h1 class="align-center">${board} Add Page</h1>
<br><br>
<section class="container-fluid col-lg-4">
	<div class="row">
<form action="add.aa" method = "POST">
		<table class="table table-hover">
	  <thead>
	    <tr>
	      <th scope="col">TITLE</th>
			<td><input type="text" name="title"> </td>
	    </tr>
	    <tr>
	      <th scope="col">WRITER</th>
			<td><input type="text" name="writer" readonly value="${sessionScope.bnakmember.userName}"></td>
	    </tr>
	  </thead>
	  <tbody>
			<tr>
				<th scope="col" colspan="2">CONTENTS</th>
			</tr>
			<tr>	
				<td colspan="2"><textarea rows="30" cols="70" name="contents"></textarea></td>		
			</tr>
	   </tbody>
</table>
			<c:choose>
	<c:when test="${board eq 'Notice'}">
		<c:if test="${sessionScope.member.userName eq 'Manager'}">
		<div class="align-center">
			<a href = "./add.aa"><button class="btn btn-primary">공지 등록</button></a>
		</div>
		</c:if>
	</c:when>	
	<c:otherwise>
		<c:if test="${not empty sessionScope.member}">
		<div class="align-center">
			<a href = "./add.aa"><button class="btn btn-primary">QnA 등록</button></a>
		</div>
		</c:if>
	</c:otherwise>
</c:choose>
</form>
</div>
</section>
<br><br>
<c:import url="../template/footer.jsp"></c:import>
</body>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

</html>