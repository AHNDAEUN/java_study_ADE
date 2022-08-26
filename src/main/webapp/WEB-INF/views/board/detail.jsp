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
<h1 class="align-center">${board} Detail Page</h1>
<br>
<section class="container-fluid col-lg-5">
	<div class="row">
	<table class="table table-hover">
	    <tr>	
	      <td>#</td>
	      <td>TITLE</td>
	      <td>WRITER</td>
	      <td>DATE</td>
	      <td>HIT</td>
	    </tr>
	    	<tr>
				<td>${boardDTO.num}</td>
				<td>${boardDTO.title}</td>		
				<td>${boardDTO.writer}</td>
				<td>${boardDTO.regDate}</td>	
				<td>${boardDTO.hit}</td>		
			</tr>
		    
</table>
</div>
</section>

<div class="row">

<a href="./reply.aa" class ="btn btn-denger">reply</a>
</div>
<br>
<div class="align-center">
<a href = "./list.aa"><button class="btn btn-primary"> 공지목록 </button></a>
	<c:choose>
		<c:when test="${board eq 'Notice'}">
			<c:if test="${sessionScope.bankmember.userName eq 'Manager'}">
			<a href= "./update.aa?num=${boardDTO.num}"><button class="btn btn-primary">공지 수정</button></a>
			<a href="./delete.aa?num=${boardDTO.num}"><button class="btn btn-primary">공지 삭제</button></a>
			</c:if>
		</c:when>
		<c:otherwise>
			<c:if test="${sessionScope.bankmember.userName eq boardDTO.writer}">
			<a href= "./update.aa?num=${boardDTO.num}"><button class="btn btn-primary">QnA 수정</button></a>
			<a href="./delete.aa?num=${boardDTO.num}"><button class="btn btn-primary">QnA 삭제</button></a>
			</c:if>
		</c:otherwise>
	</c:choose>
</div>
<br><br>

<c:import url="../template/footer.jsp"></c:import>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>