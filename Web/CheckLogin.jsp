<%--
  Created by IntelliJ IDEA.
  User: idayeon
  Date: 2023/05/28
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
로그인 값 받는 페이지
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form action="UserLogin.jsp" method="post">
    아이디 : <input type="text" name="ID"><br>
    비밀번호 : <input type="text" name="PW"><br>
    <input type="submit" value="로그인">
</form>
</body>
</html>