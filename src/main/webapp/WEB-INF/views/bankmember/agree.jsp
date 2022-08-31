<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>약관동의</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<body>
	<h1>약관동의 페이지</h1>


    <div>
      전체동의  <input type="checkbox" name="all" id="cb ">
        동의 1(필수)<input type="checkbox" name="" id="cb req">
        동의 2 (필수)<input type="checkbox" name="" id="cb req">
        동의 3 (선택)<input type="checkbox" name="" id="cb">
    </div>

<form action="./join.aa" id="frm">
<button>회원가입</button>

</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>	
<script src="/resources/js/member.js"></script>
<script>
    check();
</script>
</body>
</html>