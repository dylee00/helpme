<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="User.UserDAO" %>
<%@page import=" User.User" %>
<%@ page import="java.io.PrintWriter"%>
<%--
로그인 확인하는 페이지
--%>
<%
    String ID = null;
    String PW = null;

    if (request.getParameter("ID") != null) {
        ID = (String) request.getParameter("ID");
    }

    if (request.getParameter("PW") != null) {
        PW = (String) request.getParameter("PW");
    }

    if (ID == null || PW == null) {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('입력이 안 된 사항이 있습니다.')");
        script.println("</script>");
        script.close();
        return;
    }

    UserDAO userDAO = new UserDAO();
    int result = userDAO.UserLogin(ID, PW);
    if (result == 1) {
        response.sendRedirect("login_success.jsp");
        return;
    }
    else {
        response.sendRedirect("login_fail.jsp");
    }

%>