<%-- 
    Document   : alogout.jsp
    Created on : May 29, 2023, 5:49:27 PM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
HttpSession ses = request.getSession();
ses.removeAttribute("aid");
ses.removeAttribute("apassword");
ses.invalidate();
response.sendRedirect("login.jsp");

%>