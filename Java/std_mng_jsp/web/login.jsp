<%-- 
    Document   : login
    Created on : May 27, 2023, 12:46:05 PM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclasses.*"  contentType="text/html" pageEncoding="UTF-8"%>
<%! int counter;%>
<!DOCTYPE html>
<%
if(request.getParameter("t1")!=null){
student s =new student();
StudentDao a = new StudentDao();
s.id= Integer.parseInt(request.getParameter("t1"))   ;
s.password=request.getParameter("t2");
ResultSet rs =a.validate(s);
counter = 0;
if(!rs.next()){
   counter = 1; 
}
else{
 int id = Integer.parseInt(request.getParameter("t1"))   ;
 String password = request.getParameter("t2");
 session.setAttribute("id", id);
 session.setAttribute("password",password);
 response.sendRedirect("stddash.jsp");
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
            
            <form class=" border border-5  rounded bg-light " style="width:500px" method="post" action="login.jsp">
                <div class="mb-3" style="margin:30px">
                    <h1>Student login</h1>
                </div>
                <div class="mb-3" style="margin:30px">
                  <label for="userid" class="form-label">Enter Id</label>
                  <input type="number" name="t1" class="form-control" id="userid" required>
                </div>
                <div class="mb-3" style="margin:30px">
                  <label for="password" class="form-label">Enter Password</label>
                  <input type="password" name="t2" class="form-control" id="password" required>
                </div>
                <div class="mb-3 form-check" style="margin:30px">
                    <span class="form-text"> do not have an account <a href="std_sign_up.jsp" class="text-primary">sign Up!</a></span>
         
                    <span class="form-text">For admin login click <a href="admin_login.jsp" class="text-primary">here</a></span>  
                </div>
                <button class="btn btn-outline-primary" style="margin:30px">Submit</button>
              </form>
        </div>

    </body>
</html>
