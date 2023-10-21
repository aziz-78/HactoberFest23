package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclasses.*;

public final class stddash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Integer id;int counter;apply a;applyDao s;int count=0;String stat="";
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
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");



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





      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("        <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("           <span class=\"navbar-brand mb-0 h1\">Student Dashboard</span>\n");
      out.write("           <div style=\"margin-right: -810px;margin-top: 15px\">\n");
      out.write("               <div class=\"");
if(count==0){
      out.write("\n");
      out.write("                    ");
      out.print( "alert alert-warning");
      out.write("\n");
      out.write("                    ");
}else if(count==1 && stat.equals("selected")){
      out.write("\n");
      out.write("                    ");
      out.print( "alert alert-success");
      out.write("\n");
      out.write("                    ");
}else if(count==1 && stat.equals("not selected")){
      out.write("\n");
      out.write("                    ");
      out.print( "alert alert-danger");
      out.write("\n");
      out.write("                    ");
}else{
      out.write("\n");
      out.write("                    ");
      out.print( "alert alert-warning");
      out.write("\n");
      out.write("                    ");
}
      out.write("\"\n");
      out.write("                    role=\"alert\">\n");
      out.write("                  ");
if(count==0){
      out.write("\n");
      out.write("                  ");
      out.print( "apply for a course");
      out.write("\n");
      out.write("                  ");
}else if(count==1 && stat.equals("selected")){
      out.write("\n");
      out.write("                  ");
      out.print( "status: selected!");
      out.write("\n");
      out.write("                  ");
}else if(count==1 && stat.equals("not selected")){
      out.write("\n");
      out.write("                  ");
      out.print( "status: not selected!");
      out.write("\n");
      out.write("                  ");
}else{
      out.write("\n");
      out.write("                  ");
      out.print( "status:pending");
      out.write("\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <a  href=\"logout.jsp\"  class=\"btn btn-outline-danger my-2 my-sm-0\" >Logout</a>\n");
      out.write("           </div>\n");
      out.write("       </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"card-group d-flex flex-row justify-content-around align-items-center\" style=\"margin-top: 200px\">\n");
      out.write("            <div class=\"card bg-light mb-3 rounded\" style=\"max-width: 18rem;\">\n");
      out.write("              <div class=\"card-header\">Update</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h5 class=\"card-title\">update your Registration information</h5>\n");
      out.write("                  <p class=\"card-text\">if you made some mistake then update your application here</p>\n");
      out.write("                  <a href=\"edit_reg.jsp\" class=\"btn btn-outline-primary\">update</a>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"card bg-light mb-3 rounded\" style=\"max-width: 18rem;\">\n");
      out.write("              <div class=\"card-header\">apply</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h5 class=\"card-title\">Apply for courses</h5>\n");
      out.write("                  <p class=\"card-text\">apply for the relevant courses you look forward to study</p\n");
      out.write("                  <br>\n");
      out.write("                  <br>\n");
      out.write("                  \n");
      out.write("                  <a href=\"#\" class=\"btn btn-outline-primary\" id=\"app\">apply</a>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("            <div class=\"card bg-light mb-3 rounded\" style=\"max-width: 18rem;\">\n");
      out.write("              <div class=\"card-header\">Edit</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h5 class=\"card-title\">Edit application</h5>\n");
      out.write("                  <p class=\"card-text\">change the course you applied for</p>\n");
      out.write("                  <br><br>\n");
      out.write("                  <a href=\"#\" class=\"btn btn-outline-primary\" id=\"app1\">edit</a>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script>\n");
      out.write("    const btn1= document.getElementById(\"app\");\n");
      out.write("    const btn2= document.getElementById(\"app1\");\n");
      out.write("    btn1.addEventListener('click',function(){\n");
      out.write("        ");
if(counter==0){
      out.write("\n");
      out.write("               btn1.setAttribute(\"href\",\"apply.jsp\");\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    });\n");
      out.write("    btn2.addEventListener('click',function(){\n");
      out.write("        ");
if(counter==1){
      out.write("\n");
      out.write("               btn2.setAttribute(\"href\",\"edit_app.jsp\");\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    });\n");
      out.write("        \n");
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
