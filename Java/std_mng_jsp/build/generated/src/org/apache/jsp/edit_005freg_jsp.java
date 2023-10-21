package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclasses.*;

public final class edit_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ResultSet rs;student s;StudentDao a ;
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


  s =new student();
  a = new StudentDao();
  Integer userid = (Integer) session.getAttribute("id");
  s.id= userid;
  rs =a.selectById(s); 
if(!rs.next()){
    response.sendRedirect("errorpage.jsp");
}



      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("        <div class=\"container-lg d-flex justify-content-center align-items-center \" style=\"margin-top:8px;\">\n");
      out.write("            <form class=\" border border-5  rounded bg-light px-5\" style=\"width:550px\" method=\"post\" action=\"edit_reg.jsp\" >\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                    <h1>Update Registration info</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"username\" class=\"form-label\">Enter Name*</label>\n");
      out.write("                  <input type=\"text\" name=\"t1\" class=\"form-control\" id=\"username\" value=\"");
      out.print( rs.getString(2) );
      out.write("  \"  required>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"email\" class=\"form-label\">Enter Email*</label>\n");
      out.write("                  <input type=\"email\" name=\"t2\" class=\"form-control\" id=\"email\" value=\"");
      out.print( rs.getString(3));
      out.write("\"   required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"cnic\" class=\"form-label\">Enter CNIC*</label>\n");
      out.write("                  <input type=\"number\" name=\"t3\" class=\"form-control\" id=\"cnic\" value=\"");
      out.print( rs.getString(4));
      out.write("\"  required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"phone\" class=\"form-label\">Enter phone*</label>\n");
      out.write("                  <input type=\"number\" name=\"t4\" class=\"form-control\" id=\"phone\" value=\"");
      out.print( rs.getString(5));
      out.write("\"  required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"password\" class=\"form-label\">Enter Password*</label>\n");
      out.write("                  <input type=\"password\" name=\"t5\" class=\"form-control\" id=\"password\" value=\"");
      out.print( rs.getString(6));
      out.write("\" required>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" class=\"btn btn-outline-primary\" style=\"margin:30px\">Submit</button>\n");
      out.write("              </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");


  if(request.getParameter("t1")!=null){
    s.name= (String)request.getParameter("t1");
    s.email = (String)request.getParameter("t2");
    s.cnic=(String)request.getParameter("t3");
    s.phone=(String)request.getParameter("t4");
    s.password=(String)request.getParameter("t5");
    a.update(s);
    response.sendRedirect("stddash.jsp");
}


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
