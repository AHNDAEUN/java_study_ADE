<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>bankmember list page</h1>
<form action ="search.aa" method ="POST"> 

<table border ="1">

	<thead>

			<tr> 
					<th>userName</th>
					<th>password</th>
					<th>name</th>
					<th>email</th>				
					<th>phone</th>
					
					
				</tr>
				
			</thead>
			
			
			<tbody>
			
				
				<c:forEach items ="${requestScope.list}" var = "dto"> 
				
				<%-- <h3> ${pageScope.dto} </h3> --%>
				<!-- 주소록 노출 -->
				
				<tr>
					
					<td> ${pageScope.dto.userName}</td>
					<td> ${pageScope.dto.password}</td>
					<td> ${pageScope.dto.name}</td>
					<td> ${pageScope.dto.email}</td>
					<td> ${pageScope.dto.phone}</td>
					
					</tr>	

				</c:forEach>
				
				
		</tbody>


</table>


</form>

</body>
</html>