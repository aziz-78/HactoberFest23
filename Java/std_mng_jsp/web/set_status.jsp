<%-- 
    Document   : set_status
    Created on : May 29, 2023, 8:05:37 PM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclasses.*" contentType="text/html" pageEncoding="UTF-8"%>
<%! ResultSet rs; %>
<!DOCTYPE html>
<%
HttpSession ses = request.getSession();
if (ses.getAttribute("aid")==null){
   response.sendRedirect("errorpage.jsp");
}

selectDao a = new selectDao();
rs= a.selectstatus();


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body style="background-color: oldlace">
        <nav class="navbar navbar-light bg-dark ">
           <span class="navbar-brand mb-0 h1 text-white">Set Application Status</span>
            <div class="form-inline my-2 my-lg-0">
            <a  href="admdash.jsp"  class="btn btn-outline-danger my-2 my-sm-0" >Back to dashboard</a>
           </div>
       </nav>
        <div class="container-lg d-flex justify-content-center align-items-center container1" style="margin-top: 100px" >
        <table class="table table-lg table-dark table-hover " >
          <thead>
                <tr>
                  <th scope="col">student id</th>
                  <th scope="col">name</th>
                  <th scope="col">program</th>
                  <th scope="col">status</th>
                  <th scope="col">update</th>
                </tr>
         </thead>
              <tbody>
                  <%while(rs.next()){%>
                   <tr>
                       <th scope="col"><%= rs.getInt(1) %></th>
                       <th scope="col"><%= rs.getString(2) %></th>
                       <th scope="col"><%= rs.getString(3) %></th>
                       <th scope="col"><%= rs.getString(4) %></th>
                       <th scope="col"><a href="edit_status.jsp?aid=<%= rs.getInt(5)%>"   class=" btn btn-outline-success">set status</a></th>
                       
                   </tr>
                  <%}%>
              </tbody>
        </table>
        </div>
    </body>
</html>
<style>
    .container1 {
  max-width: 1300px;
  margin: 30px auto;
  overflow: auto;
  min-height: 150px;
  border: 3px solid black;
  padding: 15px;
  border-radius: 5px;
}
</style>