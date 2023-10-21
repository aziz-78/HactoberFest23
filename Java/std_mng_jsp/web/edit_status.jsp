<%-- 
    Document   : edit_status
    Created on : May 30, 2023, 3:56:13 AM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="dbclasses.*"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! ResultSet rs;String s;Integer id;apply b;applyDao d;%>
<%
HttpSession ses = request.getSession();
if (ses.getAttribute("aid")==null){
   response.sendRedirect("errorpage.jsp");
}

if (request.getParameter("aid") != null) {
  id = Integer.parseInt(request.getParameter("aid"));
} else {
  response.sendRedirect("errorpage.jsp");
}
selectDao  a = new selectDao();
rs= a.edit_status(id);
rs.next();
s= rs.getString(4);
b = new apply();
d = new applyDao();
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
       
    </head>
    <body style="background-color: black">
        <nav class="navbar navbar-light bg-light">
           <span class="navbar-brand mb-0 h1">Edit</span>
           <div class="form-inline my-2 my-lg-0">
            <a  href="set_status.jsp"  class="btn btn-outline-danger my-2 my-sm-0" >back to edit status</a>
           </div>
       </nav>
       <div class="container-lg d-flex justify-content-center align-items-center " style="margin-top:40px;">
            <form class=" border border-5  rounded bg-light px-5" style="width:550px" method="post" action="e_status.jsp" >
                <div class="mb-1" style="margin:30px">
                    <h1>edit status</h1>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="userid" class="form-label">Student Id*</label>
                  <input type="text" name="t1" class="form-control" id="userid" value="<%= rs.getInt(1)%>" readonly>
                </div>
               
                <div class="mb-1" style="margin:30px">
                  <label for="name" class="form-label">Student name*</label>
                  <input type="text" name="t2" class="form-control" id="name" value="<%= rs.getString(2)%>" readonly>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="program" class="form-label">Program</label>
                  <input type="text" name="t3" class="form-control" id="program" value="<%= rs.getString(3)%>" readonly >
                </div>
                
                <div class="mb-1" style="margin:30px">
                   <label for="status" class="form-label">select status*</label>
                    <select class="form-select" id='status' name="t4" required >
                        <option >Open this select menu</option>
                        <option <%if(s.equals("pending")){%>
                            <%="selected"%>
                            <%}%> value="pending">pending</option>
                        <option 
                            <%if(s.equals("selected")){%>
                            <%="selected"%>
                            <%}%>value="selected">Selected</option>
                        <option <%if(s.equals("not selected")){%>
                            <%="selected"%>
                            <%}%> value="not selected">Not Selected</option>
                        
                    </select>
                    <input type="hidden" name="t5" class="form-control"  value="<%= id%>" readonly >
                </div>
                            
                <button type="submit" class="btn btn-outline-primary" style="margin:30px">Submit</button>
              </form>
        </div>

    </body>
</html>
