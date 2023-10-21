<%-- 
    Document   : admdash
    Created on : May 29, 2023, 5:21:02 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page errorPage="errorpage.jsp" %> 
<%

HttpSession ses = request.getSession();
if (ses.getAttribute("aid")!=null){
   
}
else{
    response.sendRedirect("errorpage.jsp");
}




%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body style="background-color: black">
        <nav class="navbar navbar-light bg-light">
           <span class="navbar-brand mb-0 h1">Admin Dashboard</span>
           <div class="form-inline my-2 my-lg-0">
            <a  href="alogout.jsp"  class="btn btn-outline-danger my-2 my-sm-0" >Logout</a>
           </div>
       </nav>
        <div class="card-group d-flex flex-row justify-content-around align-items-center" style="margin-top: 200px">
             <div class="card bg-light mb-3 rounded" style="max-width: 18rem;">
              <div class="card-header">Selection</div>
                <div class="card-body">
                  <h5 class="card-title">set status</h5>
                  <p class="card-text">set the application status of applicants</p>
                  <a href="set_status.jsp" class="btn btn-outline-primary">update</a>
                </div>
             </div>
             <div class="card bg-light mb-3 rounded" style="max-width: 18rem;">
              <div class="card-header">view</div>
                <div class="card-body">
                  <h5 class="card-title">View applications</h5>
                  <p class="card-text">set the application status of applicants</p>
                  <a href="admin_view.jsp" class="btn btn-outline-primary">view</a>
                </div>
             </div>
        </div>
    </body>
</html>
