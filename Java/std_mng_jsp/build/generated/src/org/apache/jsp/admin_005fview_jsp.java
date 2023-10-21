package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclasses.*;

public final class admin_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

int counter = 0;selectDao a;ResultSet rs;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"errorpage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");


HttpSession ses = request.getSession();
if (ses.getAttribute("aid")!=null){
   
}
else{
    response.sendRedirect("errorpage.jsp");
}





      out.write('\n');
      out.write('\n');

a = new selectDao();
rs=null;




      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-light bg-dark \">\n");
      out.write("           <span class=\"navbar-brand mb-0 h1 text-white\">View applications</span>\n");
      out.write("            <div class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <a  href=\"admdash.jsp\"  class=\"btn btn-outline-danger my-2 my-sm-0\" >Back to dashboard</a>\n");
      out.write("           </div>\n");
      out.write("       </nav>\n");
      out.write("        <div class=\"formcontainer\" style=\"margin-top:8px;\">\n");
      out.write("        <form class=\"   form \" style=\"width:500px\" method=\"post\" action=\"admin_view.jsp\">\n");
      out.write("            <label class=\"label l2 form-label\">Select Category</label>\n");
      out.write("            <select class=\"opt form-select\" id=\"cat\" name=\"category\">\n");
      out.write("                <option class=\"View\" value=\"Select\">Select</option>\n");
      out.write("                <option class=\"View\" value=\"View All\">View All</option>\n");
      out.write("                <option class=\"View\" value=\"Program Wise\">Program Wise</option>\n");
      out.write("                <option class=\"View\" value=\"Status Wise\">Status Wise</option>\n");
      out.write("               \n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("            <div id=\"cont\" class=\"mb-1\" > \n");
      out.write("                <label class=\"label l1 form-label\" id=\"lab\"></label>\n");
      out.write("                <select class=\"opt nopt form-select\" id=\"status\" name=\"status\">\n");
      out.write("                    <option value=\"Select\">Select</option>\n");
      out.write("                </select>\n");
      out.write("            </div><br>\n");
      out.write("            <input type=\"submit\" class=\"vstd btn btn-outline-primary\" id=\"sub\" value=\"View Student\" >\n");
      out.write("        </form>\n");
      out.write("            <table class=\"table table-lg table-dark table-hover tb1 \"  id=\"myTable\" style=\"margin-top: 23px\" >\n");
      out.write("          <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"col\">student id</th>\n");
      out.write("                  <th scope=\"col\">name</th>\n");
      out.write("                  <th scope=\"col\">email</th>\n");
      out.write("                  <th scope=\"col\">program</th>\n");
      out.write("                  <th scope=\"col\">status</th>\n");
      out.write("                </tr>\n");
      out.write("         </thead>\n");
      out.write("              <tbody>\n");
      out.write("                 ");

                    if(request.getParameter("category")!=null){
                      if(request.getParameter("category").equals("View All")){
                      rs= a.selectapplied();
                      
                    while(rs.next()){
      out.write(" \n");
      out.write("                    <tr><td>");
      out.print( rs.getInt(1) );
      out.write("\n");
      out.write("                    </td><td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(5) );
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                     </tr>       ");
   }  
      out.write("\n");
      out.write("                    ");
 }else if(request.getParameter("category").equals("Program Wise")){ if(request.getParameter("status").equals("Select")){ 
      out.write("\n");
      out.write("                    ");
 counter=2; }else{ 
      out.write("\n");
      out.write("                    ");
 counter=0;
                     int pid = Integer.parseInt(request.getParameter("status"));
                     rs=null;
                     rs=a.slt_prog_wise(pid);
                     while(rs.next()){
      out.write(" \n");
      out.write("                    <tr><td>");
      out.print( rs.getInt(1) );
      out.write("\n");
      out.write("                    </td><td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(5) );
      out.write("</td>\n");
      out.write("                     </tr>       ");
  }}  
      out.write("\n");
      out.write("                     ");
 }else if(request.getParameter("category").equals("Status Wise")){ if(request.getParameter("status").equals("Select")){ 
      out.write("\n");
      out.write("                      ");
 counter=2; }else{ 
      out.write("\n");
      out.write("                       ");
 counter=0;
                          String stat = request.getParameter("status");
                         rs=null;
                         rs=a.slt_stat_wise(stat);
                         
                         while(rs.next()){
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                     <tr><td>");
      out.print( rs.getInt(1) );
      out.write("\n");
      out.write("                     </td><td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( rs.getString(5) );
      out.write("</td>\n");
      out.write("                     \n");
      out.write("                     </tr>  ");
 }}}}
      out.write("                 \n");
      out.write("                    \n");
      out.write("              </tbody>\n");
      out.write("        </table>    \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("    .formcontainer{\n");
      out.write("    border: 2px solid black;\n");
      out.write("    width: 1100px;\n");
      out.write("    height: 450px;\n");
      out.write("    margin-left: 215px;\n");
      out.write("    margin-top: 40px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    padding: 30px;\n");
      out.write("    border-radius: 8px;\n");
      out.write("   \n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("    position: relative;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    #cont{\n");
      out.write("    visibility: hidden;\n");
      out.write("}\n");
      out.write(".opt{\n");
      out.write("       padding: 5px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    height: 36px;\n");
      out.write("    background: inherit;\n");
      out.write("    width: 233px;\n");
      out.write("    font-size: inherit;\n");
      out.write("    font-weight: bold;\n");
      out.write("    border: 1px solid black;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    margin-left: 30px;\n");
      out.write("}\n");
      out.write(".nopt{\n");
      out.write("    position: absolute;\n");
      out.write("    margin-left: 203px;\n");
      out.write("}\n");
      out.write(".l1{    \n");
      out.write("    position: absolute;\n");
      out.write("    margin-right: 48px;\n");
      out.write("    margin-top: 19px;\n");
      out.write("}\n");
      out.write(".l2{\n");
      out.write("    margin-right: 45px;\n");
      out.write("}\n");
      out.write(".vstd{\n");
      out.write("           \n");
      out.write("    padding: 8px;\n");
      out.write("    margin-left: 470px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    display: inline-block;\n");
      out.write("    position: absolute;\n");
      out.write("    margin-top: -70px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("     function clearTable() {\n");
      out.write("            var table = document.getElementById(\"myTable\");\n");
      out.write("            var rowCount = table.rows.length;\n");
      out.write("\n");
      out.write("            // Start from the last row and remove each row\n");
      out.write("            for (var i = rowCount - 1; i > 0; i--) {\n");
      out.write("                table.deleteRow(i);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        let cat=document.getElementById(\"cat\");\n");
      out.write("        let sub=document.getElementById(\"sub\");\n");
      out.write("     cat.addEventListener('change',function(){\n");
      out.write("         clearTable();\n");
      out.write("         let cont=document.getElementById(\"cont\");\n");
      out.write("         let status=document.getElementById(\"status\");\n");
      out.write("         let lab=document.getElementById(\"lab\");\n");
      out.write("         if(cat.value===\"Select\"){\n");
      out.write("             cont.style.visibility=\"hidden\";\n");
      out.write("             \n");
      out.write("         }\n");
      out.write("         else if(cat.value===\"Status Wise\"){\n");
      out.write("            lab.innerHTML=\"Select Status\";\n");
      out.write("             cont.style.visibility=\"visible\";\n");
      out.write("             status.options.remove(1);\n");
      out.write("            status.options.remove(1);\n");
      out.write("            status.options.remove(1);\n");
      out.write("            status.options.remove(1);\n");
      out.write("               var option2 = document.createElement(\"option\");\n");
      out.write("    option2.value = \"selected\";\n");
      out.write("    option2.text = \"Selected\";\n");
      out.write("    var option3 = document.createElement(\"option\");\n");
      out.write("    option3.value = \"not selected\";\n");
      out.write("    option3.text = \"Not Selected\";\n");
      out.write("       \n");
      out.write("    \n");
      out.write("       \n");
      out.write("            var option4 = document.createElement(\"option\");\n");
      out.write("    option4.value = \"Pending\";\n");
      out.write("    option4.text = \"Pending\";\n");
      out.write("    status.appendChild(option2);\n");
      out.write("    status.appendChild(option3);\n");
      out.write("    status.appendChild(option4);\n");
      out.write("    \n");
      out.write("         }\n");
      out.write("         else if(cat.value===\"Program Wise\"){\n");
      out.write("            lab.innerHTML=\"Select Program\";\n");
      out.write("             cont.style.visibility=\"visible\";\n");
      out.write("             status.options.remove(1);\n");
      out.write("            status.options.remove(1);\n");
      out.write("            status.options.remove(1);\n");
      out.write("            status.options.remove(1);\n");
      out.write("               var option2 = document.createElement(\"option\");\n");
      out.write("    option2.value = \"1\";\n");
      out.write("    option2.text = \"BS Computer Science\";\n");
      out.write("    var option3 = document.createElement(\"option\");\n");
      out.write("    option3.value = \"2\";\n");
      out.write("    option3.text = \"BS Artificial Intelligence\";\n");
      out.write("       \n");
      out.write("    var option4 = document.createElement(\"option\");\n");
      out.write("    option4.value = \"3\";\n");
      out.write("    option4.text = \"BS Software Engineering\";\n");
      out.write("       \n");
      out.write("            var option5 = document.createElement(\"option\");\n");
      out.write("    option5.value = \"4\";\n");
      out.write("    option5.text = \"BBA buisiness admin\";\n");
      out.write("    status.appendChild(option2);\n");
      out.write("    status.appendChild(option3);\n");
      out.write("    status.appendChild(option4);\n");
      out.write("    status.appendChild(option5);\n");
      out.write("         }\n");
      out.write("         else{\n");
      out.write("                 cont.style.visibility=\"hidden\";\n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         \n");
      out.write("     });\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
