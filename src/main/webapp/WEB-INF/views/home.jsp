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


<%-- <c:if test="${member eq null}"> --%>

<div><br>
<c:if test="${empty bankmember}">
로그인 <a href="./bankmember/login.aa"><button> Login </button></a>
<br>
회원가입 <a href="./bankmember/join.aa"><button> join </button></a>
</c:if>


<c:if test="${not empty bankmember}">

<h3>${sessionScope.bankmember.name} 환영합니다. </h3>
<a href= "./member/logout.aa">logout</a>

</c:if>
</div>


<br>
상품 추가 <a href="./bankbook/add.aa "> <button> add </button> </a>
<br>
상품 검색 <a href="./bankmember/search.aa "> <button> member search </button> </a>
<br>
통장 정보 <a href="./bankbook/list.aa "> <button> bankbook list </button> </a>
<br>


</body>
</html>
</body>
</html>
