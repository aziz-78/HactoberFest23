<%-- 
    Document   : stddash
    Created on : May 28, 2023, 3:18:40 AM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %>  
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclasses.*"  contentType="text/html" pageEncoding="UTF-8"%>
<%! Integer id;int counter;apply a;applyDao s;int count=0;String stat="";%>
<!DOCTYPE html>
<%


if (session.getAttribute("id")!=null){
   
}
else{
    response.sendRedirect("errorpage.jsp");
}
counter = 0;
id= (Integer)session.getAttribute("id");
a=new apply();
s=new applyDao();
a.id= id;
ResultSet rs = s.selectById(a);
if(rs.next()){
   counter = 1; 
}
selectDao z = new selectDao();

ResultSet res = z.slt_stat(id);
if(res.next()){
 count = 1;
 stat= res.getString(1);
}
else{
    count = 0;
    stat=" ";
}




%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body style="background-color: black">
        <nav class="navbar navbar-light bg-light">
           <span class="navbar-brand mb-0 h1">Student Dashboard</span>
           <div style="margin-right: -810px;margin-top: 15px">
               <div class="<%if(count==0){%>
                    <%= "alert alert-warning"%>
                    <%}else if(count==1 && stat.equals("selected")){%>
                    <%= "alert alert-success"%>
                    <%}else if(count==1 && stat.equals("not selected")){%>
                    <%= "alert alert-danger"%>
                    <%}else{%>
                    <%= "alert alert-warning"%>
                    <%}%>"
                    role="alert">
                  <%if(count==0){%>
                  <%= "apply for a course"%>
                  <%}else if(count==1 && stat.equals("selected")){%>
                  <%= "status: selected!"%>
                  <%}else if(count==1 && stat.equals("not selected")){%>
                  <%= "status: not selected!"%>
                  <%}else{%>
                  <%= "status:pending"%>
                  <%}%>
              </div>
           </div>
           <div class="form-inline my-2 my-lg-0">
            <a  href="logout.jsp"  class="btn btn-outline-danger my-2 my-sm-0" >Logout</a>
           </div>
       </nav>
        
        <div class="card-group d-flex flex-row justify-content-around align-items-center" style="margin-top: 200px">
            <div class="card bg-light mb-3 rounded" style="max-width: 18rem;">
              <div class="card-header">Update</div>
                <div class="card-body">
                  <h5 class="card-title">update your Registration information</h5>
                  <p class="card-text">if you made some mistake then update your application here</p>
                  <a href="edit_reg.jsp" class="btn btn-outline-primary">update</a>
                </div>
             </div>
            <div class="card bg-light mb-3 rounded" style="max-width: 18rem;">
              <div class="card-header">apply</div>
                <div class="card-body">
                  <h5 class="card-title">Apply for courses</h5>
                  <p class="card-text">apply for the relevant courses you look forward to study</p
                  <br>
                  <br>
                  
                  <a href="#" class="btn btn-outline-primary" id="app">apply</a>
                </div>
             </div>
            <div class="card bg-light mb-3 rounded" style="max-width: 18rem;">
              <div class="card-header">Edit</div>
                <div class="card-body">
                  <h5 class="card-title">Edit application</h5>
                  <p class="card-text">change the course you applied for</p>
                  <br><br>
                  <a href="#" class="btn btn-outline-primary" id="app1">edit</a>
                </div>
             </div>
        </div>
       
    </body>
</html>
<script>
    const btn1= document.getElementById("app");
    const btn2= document.getElementById("app1");
    btn1.addEventListener('click',function(){
        <%if(counter==0){%>
               btn1.setAttribute("href","apply.jsp");
        <%}%>
    });
    btn2.addEventListener('click',function(){
        <%if(counter==1){%>
               btn2.setAttribute("href","edit_app.jsp");
        <%}%>
    });
        
</script>