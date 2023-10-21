<%-- 
    Document   : edit_reg
    Created on : May 28, 2023, 5:30:24 AM
    Author     : Dell
--%>
<%@page import="java.sql.ResultSet"%>
<%@ page errorPage="errorpage.jsp" %> 
<%! ResultSet rs;student s;StudentDao a ;%>
<%@page import="dbclasses.*"  contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

  s =new student();
  a = new StudentDao();
  Integer userid = (Integer) session.getAttribute("id");
  s.id= userid;
  rs =a.selectById(s); 
if(!rs.next()){
    response.sendRedirect("errorpage.jsp");
}


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body style="background-color: black">
        <div class="container-lg d-flex justify-content-center align-items-center " style="margin-top:8px;">
            <form class=" border border-5  rounded bg-light px-5" style="width:550px" method="post" action="edit_reg.jsp" >
                <div class="mb-1" style="margin:30px">
                    <h1>Update Registration info</h1>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="username" class="form-label">Enter Name*</label>
                  <input type="text" name="t1" class="form-control" id="username" value="<%= rs.getString(2) %>  "  required>
                </div>
               
                <div class="mb-1" style="margin:30px">
                  <label for="email" class="form-label">Enter Email*</label>
                  <input type="email" name="t2" class="form-control" id="email" value="<%= rs.getString(3)%>"   required>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="cnic" class="form-label">Enter CNIC*</label>
                  <input type="number" name="t3" class="form-control" id="cnic" value="<%= rs.getString(4)%>"  required>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="phone" class="form-label">Enter phone*</label>
                  <input type="number" name="t4" class="form-control" id="phone" value="<%= rs.getString(5)%>"  required>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="password" class="form-label">Enter Password*</label>
                  <input type="password" name="t5" class="form-control" id="password" value="<%= rs.getString(6)%>" required>
                </div>
                
                <button type="submit" class="btn btn-outline-primary" style="margin:30px">Submit</button>
              </form>
        </div>

    </body>
</html>
<%

  if(request.getParameter("t1")!=null){
    s.name= (String)request.getParameter("t1");
    s.email = (String)request.getParameter("t2");
    s.cnic=(String)request.getParameter("t3");
    s.phone=(String)request.getParameter("t4");
    s.password=(String)request.getParameter("t5");
    a.update(s);
    response.sendRedirect("stddash.jsp");
}

%>