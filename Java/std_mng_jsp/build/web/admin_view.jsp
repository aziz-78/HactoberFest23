<%-- 
    Document   : admin_view
    Created on : May 30, 2023, 8:35:21 AM
    Author     : Dell
--%>
<%@ page errorPage="errorpage.jsp" %> 
<%@page import="java.sql.ResultSet"%>
<%@page import="dbclasses.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

HttpSession ses = request.getSession();
if (ses.getAttribute("aid")!=null){
   
}
else{
    response.sendRedirect("errorpage.jsp");
}




%>
<%!int counter = 0;selectDao a;ResultSet rs;%>
<%
a = new selectDao();
rs=null;



%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-light bg-dark ">
           <span class="navbar-brand mb-0 h1 text-white">View applications</span>
            <div class="form-inline my-2 my-lg-0">
            <a  href="admdash.jsp"  class="btn btn-outline-danger my-2 my-sm-0" >Back to dashboard</a>
           </div>
       </nav>
        <div class="formcontainer" style="margin-top:8px;">
        <form class="   form " style="width:500px" method="post" action="admin_view.jsp">
            <label class="label l2 form-label">Select Category</label>
            <select class="opt form-select" id="cat" name="category">
                <option class="View" value="Select">Select</option>
                <option class="View" value="View All">View All</option>
                <option class="View" value="Program Wise">Program Wise</option>
                <option class="View" value="Status Wise">Status Wise</option>
               
            </select><br>

            <div id="cont" class="mb-1" > 
                <label class="label l1 form-label" id="lab"></label>
                <select class="opt nopt form-select" id="status" name="status">
                    <option value="Select">Select</option>
                </select>
            </div><br>
            <input type="submit" class="vstd btn btn-outline-primary" id="sub" value="View Student" >
        </form>
            <table class="table table-lg table-dark table-hover tb1 "  id="myTable" style="margin-top: 23px" >
          <thead>
                <tr>
                  <th scope="col">student id</th>
                  <th scope="col">name</th>
                  <th scope="col">email</th>
                  <th scope="col">program</th>
                  <th scope="col">status</th>
                </tr>
         </thead>
              <tbody>
                 <%
                    if(request.getParameter("category")!=null){
                      if(request.getParameter("category").equals("View All")){
                      rs= a.selectapplied();
                      
                    while(rs.next()){%> 
                    <tr><td><%= rs.getInt(1) %>
                    </td><td><%= rs.getString(2) %></td>
                   <td><%= rs.getString(3) %></td>
                   <td><%= rs.getString(4) %></td>
                   <td><%= rs.getString(5) %></td>
                    
                     </tr>       <%   }  %>
                    <% }else if(request.getParameter("category").equals("Program Wise")){ if(request.getParameter("status").equals("Select")){ %>
                    <% counter=2; }else{ %>
                    <% counter=0;
                     int pid = Integer.parseInt(request.getParameter("status"));
                     rs=null;
                     rs=a.slt_prog_wise(pid);
                     while(rs.next()){%> 
                    <tr><td><%= rs.getInt(1) %>
                    </td><td><%= rs.getString(2) %></td>
                   <td><%= rs.getString(3) %></td>
                   <td><%= rs.getString(4) %></td>
                   <td><%= rs.getString(5) %></td>
                     </tr>       <%  }}  %>
                     <% }else if(request.getParameter("category").equals("Status Wise")){ if(request.getParameter("status").equals("Select")){ %>
                      <% counter=2; }else{ %>
                       <% counter=0;
                          String stat = request.getParameter("status");
                         rs=null;
                         rs=a.slt_stat_wise(stat);
                         
                         while(rs.next()){%>

                    
                     <tr><td><%= rs.getInt(1) %>
                     </td><td><%= rs.getString(2) %></td>
                     <td><%= rs.getString(3) %></td>
                     <td><%= rs.getString(4) %></td>
                     <td><%= rs.getString(5) %></td>
                     
                     </tr>  <% }}}}%>                 
                    
              </tbody>
        </table>    
        </div>
    </body>
</html>
<style>
    .formcontainer{
    border: 2px solid black;
    width: 1100px;
    height: 450px;
    margin-left: 215px;
    margin-top: 40px;
    box-sizing: border-box;
    padding: 30px;
    border-radius: 8px;
   
    align-items: center;
    justify-content: center;
    position: relative;
    
    
    
    #cont{
    visibility: hidden;
}
.opt{
       padding: 5px;
    box-sizing: border-box;
    height: 36px;
    background: inherit;
    width: 233px;
    font-size: inherit;
    font-weight: bold;
    border: 1px solid black;
    border-radius: 5px;
    margin-top: 10px;
    margin-left: 30px;
}
.nopt{
    position: absolute;
    margin-left: 203px;
}
.l1{    
    position: absolute;
    margin-right: 48px;
    margin-top: 19px;
}
.l2{
    margin-right: 45px;
}
.vstd{
           
    padding: 8px;
    margin-left: 470px;
    cursor: pointer;
    display: inline-block;
    position: absolute;
    margin-top: -70px;
   
}
}
</style>
<script>
     function clearTable() {
            var table = document.getElementById("myTable");
            var rowCount = table.rows.length;

            // Start from the last row and remove each row
            for (var i = rowCount - 1; i > 0; i--) {
                table.deleteRow(i);
            }
        }
        let cat=document.getElementById("cat");
        let sub=document.getElementById("sub");
     cat.addEventListener('change',function(){
         clearTable();
         let cont=document.getElementById("cont");
         let status=document.getElementById("status");
         let lab=document.getElementById("lab");
         if(cat.value==="Select"){
             cont.style.visibility="hidden";
             
         }
         else if(cat.value==="Status Wise"){
            lab.innerHTML="Select Status";
             cont.style.visibility="visible";
             status.options.remove(1);
            status.options.remove(1);
            status.options.remove(1);
            status.options.remove(1);
               var option2 = document.createElement("option");
    option2.value = "selected";
    option2.text = "Selected";
    var option3 = document.createElement("option");
    option3.value = "not selected";
    option3.text = "Not Selected";
       
    
       
            var option4 = document.createElement("option");
    option4.value = "Pending";
    option4.text = "Pending";
    status.appendChild(option2);
    status.appendChild(option3);
    status.appendChild(option4);
    
         }
         else if(cat.value==="Program Wise"){
            lab.innerHTML="Select Program";
             cont.style.visibility="visible";
             status.options.remove(1);
            status.options.remove(1);
            status.options.remove(1);
            status.options.remove(1);
               var option2 = document.createElement("option");
    option2.value = "1";
    option2.text = "BS Computer Science";
    var option3 = document.createElement("option");
    option3.value = "2";
    option3.text = "BS Artificial Intelligence";
       
    var option4 = document.createElement("option");
    option4.value = "3";
    option4.text = "BS Software Engineering";
       
            var option5 = document.createElement("option");
    option5.value = "4";
    option5.text = "BBA buisiness admin";
    status.appendChild(option2);
    status.appendChild(option3);
    status.appendChild(option4);
    status.appendChild(option5);
         }
         else{
                 cont.style.visibility="hidden";
         }
         
         
     });
</script>