<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>notice list page</title>
</head>
<body>

<nav aria-label="Page navigation example">
  <ul class="pagination">
  <c:if test="${pager.pre}">
    <li class="page-item">
      <a class="page-link" href="./list.aa?page=${pager.startNum-1}" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    </c:if>
    
    
    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
        
        <li class="page-item"><a class="page-link" href="./list.aa?page=${i}">${i}</a></li>
    
    </c:forEach>
    
    <%-- <c:choose>
    <c:when test="${pager.next}"></c:when>
    
    <c:otherwise>
    <li class="page-item disabled">
    </c:otherwise>
    </c:choose> --%>
   
    <li class="page-item ${pager.next?'':'disabled'}"><!-- jsp 3항 연산자 -->
    <!--  true라면 ?로 아무이상이 없고 : flase일 경우 disabled를 줌-->
      <a class="page-link" href="./list.aa?page=${pager.lastNum+1}" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>

</body>
</html>