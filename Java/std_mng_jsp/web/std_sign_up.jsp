<%-- 
    Document   : std_sign_up
    Created on : May 27, 2023, 3:16:53 PM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="dbclasses.*"  contentType="text/html" pageEncoding="UTF-8"%>
<%if(request.getParameter("t1")!=null){ 
StudentDao a = new StudentDao();
student s = new student();
s.name= request.getParameter("t1");
s.email=request.getParameter("t2");
s.cnic= request.getParameter("t3") ;
s.phone=request.getParameter("t4") ;
s.password=request.getParameter("t5");
a.insert(s);
response.sendRedirect("login.jsp");  
}%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body style="background-color: black">
     

        <div class="container-lg d-flex justify-content-center align-items-center " style="margin-top:40px;">
            <form class=" border border-5  rounded bg-light px-5" style="width:550px" method="post" action="std_sign_up.jsp" >
                <div class="mb-1" style="margin:30px">
                    <h1>Student Sign Up</h1>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="username" class="form-label">Enter Name*</label>
                  <input type="text" name="t1" class="form-control" id="username" required>
                </div>
               
                <div class="mb-1" style="margin:30px">
                  <label for="email" class="form-label">Enter Email*</label>
                  <input type="email" name="t2" class="form-control" id="email" required>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="cnic" class="form-label">Enter CNIC*</label>
                  <input type="number" name="t3" class="form-control" id="cnic" required>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="phone" class="form-label">Enter phone*</label>
                  <input type="number" name="t4" class="form-control" id="phone" required>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="password" class="form-label">Enter Password*</label>
                  <input type="password" name="t5" class="form-control" id="password" required>
                </div>
                
                <button type="submit" class="btn btn-outline-primary" style="margin:30px">Submit</button>
              </form>
        </div>

    </body>
</html>
