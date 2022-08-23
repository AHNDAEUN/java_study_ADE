<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>마이페이지</h1>

<table border ="1">

<tr>

      <th>통장번호<th>
      <th>이름</th>



</tr>

<tr


	 <td>${requestScope.dto.accountNum}</td>
	 <td>${requestScope.dto.bookName}</td>
	 
	 


></tr>



 </table>











</body>
</html>