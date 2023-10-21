package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclasses.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

int counter;
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
      out.write('\n');

if(request.getParameter("t1")!=null){
admin a =new admin();
adminDao b = new adminDao();
a.id= Integer.parseInt(request.getParameter("t1"))   ;
a.password=request.getParameter("t2");
ResultSet rs =b.selectById(a);
counter = 0;
if(!rs.next()){
   counter = 1; 
}
else{
 int id = Integer.parseInt(request.getParameter("t1"))   ;
 String password = request.getParameter("t2");
 HttpSession ses = request.getSession();
 ses.setAttribute("aid", id);
 ses.setAttribute("apassword",password);
 response.sendRedirect("admdash.jsp");
}
}

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("         ");
if(counter == 1){ 
      out.write("\n");
      out.write("                <div class=\"alert alert-danger\">\n");
      out.write("                 Incorrect username or password\n");
      out.write("                </div>\n");
      out.write("         ");
}
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"container-lg d-flex justify-content-center align-items-center \" style=\"margin-top:170px;\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form class=\" border border-5  rounded bg-light \" style=\"width:500px\" method=\"post\" action=\"admin_login.jsp\">\n");
      out.write("                <div class=\"mb-3\" style=\"margin:30px\">\n");
      out.write("                    <h1>Admin login</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"userid\" class=\"form-label\">Enter id</label>\n");
      out.write("                  <input type=\"number\" name=\"t1\" class=\"form-control\" id=\"username\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"password\" class=\"form-label\">Enter Password</label>\n");
      out.write("                  <input type=\"password\" name=\"t2\" class=\"form-control\" id=\"password\" required>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <button   class=\"btn btn-outline-primary\" style=\"margin:30px\">Submit</button>\n");
      out.write("              </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
