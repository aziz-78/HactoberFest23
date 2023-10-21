<%-- 
    Document   : admin_login
    Created on : May 29, 2023, 5:47:53 AM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclasses.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!int counter;%>
<%
if(request.getParameter("t1")!=null){
admin a =new admin();
adminDao b = new adminDao();
a.id= Integer.parseInt(request.getParameter("t1"))   ;
a.password=request.getParameter("t2");
ResultSet rs =b.selectById(a);
counter = 0;
if(!rs.next()){
   counter = 1; 
}
else{
 int id = Integer.parseInt(request.getParameter("t1"))   ;
 String password = request.getParameter("t2");
 HttpSession ses = request.getSession();
 ses.setAttribute("aid", id);
 ses.setAttribute("apassword",password);
 response.sendRedirect("admdash.jsp");
}
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body style="background-color: black">
         <%if(counter == 1){ %>
                <div class="alert alert-danger">
                 Incorrect username or password
                </div>
         <%}%>
      
        <div class="container-lg d-flex justify-content-center align-items-center " style="margin-top:170px;">
            
            
            <form class=" border border-5  rounded bg-light " style="width:500px" method="post" action="admin_login.jsp">
                <div class="mb-3" style="margin:30px">
                    <h1>Admin login</h1>
                </div>
                <div class="mb-3" style="margin:30px">
                  <label for="userid" class="form-label">Enter id</label>
                  <input type="number" name="t1" class="form-control" id="username" required>
                </div>
                <div class="mb-3" style="margin:30px">
                  <label for="password" class="form-label">Enter Password</label>
                  <input type="password" name="t2" class="form-control" id="password" required>
                </div>
               
                <button   class="btn btn-outline-primary" style="margin:30px">Submit</button>
              </form>
        </div>

    </body>
</html>
