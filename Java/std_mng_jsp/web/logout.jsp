<%-- 
    Document   : logout
    Created on : May 28, 2023, 4:17:08 AM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session.removeAttribute("id");
session.removeAttribute("password");
 
session.invalidate();
response.sendRedirect("login.jsp");
%>