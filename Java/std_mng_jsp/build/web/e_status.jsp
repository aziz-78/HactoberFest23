<%-- 
    Document   : e_status
    Created on : May 30, 2023, 6:11:29 AM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="dbclasses.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if (request.getParameter("t4")!=null){
apply b;applyDao d;
b = new apply();
d = new applyDao();
b.aid=Integer.parseInt(request.getParameter("t5")) ;
b.status=(String)request.getParameter("t4");

d.updateStatus(b);
response.sendRedirect("set_status.jsp");
}



%>
