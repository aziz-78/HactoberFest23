package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbclasses.*;
import java.sql.ResultSet;

public final class edit_005fstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ResultSet rs;String s;Integer id;apply b;applyDao d;
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
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write('\n');

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
        
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("        <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("           <span class=\"navbar-brand mb-0 h1\">Edit</span>\n");
      out.write("           <div class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <a  href=\"set_status.jsp\"  class=\"btn btn-outline-danger my-2 my-sm-0\" >back to edit status</a>\n");
      out.write("           </div>\n");
      out.write("       </nav>\n");
      out.write("       <div class=\"container-lg d-flex justify-content-center align-items-center \" style=\"margin-top:40px;\">\n");
      out.write("            <form class=\" border border-5  rounded bg-light px-5\" style=\"width:550px\" method=\"post\" action=\"e_status.jsp\" >\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                    <h1>edit status</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"userid\" class=\"form-label\">Student Id*</label>\n");
      out.write("                  <input type=\"text\" name=\"t1\" class=\"form-control\" id=\"userid\" value=\"");
      out.print( rs.getInt(1));
      out.write("\" readonly>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"name\" class=\"form-label\">Student name*</label>\n");
      out.write("                  <input type=\"text\" name=\"t2\" class=\"form-control\" id=\"name\" value=\"");
      out.print( rs.getString(2));
      out.write("\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"program\" class=\"form-label\">Program</label>\n");
      out.write("                  <input type=\"text\" name=\"t3\" class=\"form-control\" id=\"program\" value=\"");
      out.print( rs.getString(3));
      out.write("\" readonly >\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                   <label for=\"status\" class=\"form-label\">select status*</label>\n");
      out.write("                    <select class=\"form-select\" id='status' name=\"t4\" required >\n");
      out.write("                        <option >Open this select menu</option>\n");
      out.write("                        <option ");
if(s.equals("pending")){
      out.write("\n");
      out.write("                            ");
      out.print("selected");
      out.write("\n");
      out.write("                            ");
}
      out.write(" value=\"pending\">pending</option>\n");
      out.write("                        <option \n");
      out.write("                            ");
if(s.equals("selected")){
      out.write("\n");
      out.write("                            ");
      out.print("selected");
      out.write("\n");
      out.write("                            ");
}
      out.write("value=\"selected\">Selected</option>\n");
      out.write("                        <option ");
if(s.equals("not selected")){
      out.write("\n");
      out.write("                            ");
      out.print("selected");
      out.write("\n");
      out.write("                            ");
}
      out.write(" value=\"not selected\">Not Selected</option>\n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("                    <input type=\"hidden\" name=\"t5\" class=\"form-control\"  value=\"");
      out.print( id);
      out.write("\" readonly >\n");
      out.write("                </div>\n");
      out.write("                            \n");
      out.write("                <button type=\"submit\" class=\"btn btn-outline-primary\" style=\"margin:30px\">Submit</button>\n");
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
