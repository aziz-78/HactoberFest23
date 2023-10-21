<%-- 
    Document   : edit_app
    Created on : May 28, 2023, 7:49:50 PM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="java.sql.ResultSet"%>
<%! ResultSet rs,c;student s;StudentDao a ;apply g;applyDao r;int pid;%>
<%@page import="dbclasses.*;"   contentType="text/html" pageEncoding="UTF-8"%>
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
g = new apply();
r = new applyDao();
g.id = userid;
c= r.selectPid(g);
c.next();
pid = c.getInt(1);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body style="background-color: black;margin-top: 100px" >
        <div class="container-lg d-flex justify-content-center align-items-center " style="margin-top:8px;">
            <form class=" border border-5  rounded bg-light px-5" style="width:550px" method="post" action="#" >
                <div class="mb-1" style="margin:30px">
                    <h1>Edit Course selection</h1>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="username" class="form-label">Enter Name*</label>
                  <input type="text" name="t1" class="form-control" id="username" value="<%= rs.getString(2) %>  "  readonly>
                </div>
               
                <div class="mb-1" style="margin:30px">
                  <label for="email" class="form-label">Enter Email</label>
                  <input type="email" name="t2" class="form-control" id="email" value="<%= rs.getString(3)%>"   readonly>
                </div>
                <div class="mb-1" style="margin:30px">
                  <label for="cnic" class="form-label">CNIC</label>
                  <input type="number" name="t3" class="form-control" id="cnic" value="<%= rs.getString(4)%>"  readonly>
                </div>
                <div class="mb-1" style="margin:30px">
                    <label for="course" class="form-label">select course*</label>
                    <select class="form-select" id='course' name="t4" required >
                        <option >Open this select menu</option>
                        <option 
                            <%if(pid==1){%>
                            <%="selected"%>
                            <%}%>
                            value="1">CS</option>
                        <option 
                            <%if(pid==2){%>
                            <%="selected"%>
                            <%}%>
                            value="2">AI</option>
                        <option 
                            <%if(pid==3){%>
                            <%="selected"%>
                            <%}%>
                            value="3">SE</option>
                        <option 
                            <%if(pid==4){%>
                            <%="selected"%>
                            <%}%>
                            value="4">BBA</option>
                    </select>
                </div>
                
                <button type="submit" class="btn btn-outline-primary" style="margin:30px">Submit</button>
              </form>
        </div>

    </body>
</html>
<%
if (request.getParameter("t4")!=null){
    g.pid= Integer.parseInt(request.getParameter("t4"))   ;
    r.updateCourse(g);
    response.sendRedirect("stddash.jsp");
}
%>