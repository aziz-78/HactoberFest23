package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclasses.*;

public final class apply_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ResultSet rs; student a;StudentDao s;apply g;applyDao r;Integer b;
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

if(session.getAttribute("id")==null){
    response.sendRedirect("errorpage.jsp");
    
}
a = new student();
s = new StudentDao();
b = (Integer)session.getAttribute("id");
a.id=b;
rs =s.selectById(a); 
if(!rs.next()){
    response.sendRedirect("errorpage.jsp");
}


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black;margin-top: 100px\" >\n");
      out.write("        <div class=\"container-lg d-flex justify-content-center align-items-center \" style=\"margin-top:8px;\">\n");
      out.write("            <form class=\" border border-5  rounded bg-light px-5\" style=\"width:550px\" method=\"post\" action=\"apply.jsp\" >\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                    <h1>Apply for a course</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"username\" class=\"form-label\">Enter Name*</label>\n");
      out.write("                  <input type=\"text\" name=\"t1\" class=\"form-control\" id=\"username\" value=\"");
      out.print( rs.getString(2) );
      out.write("  \"  readonly>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"email\" class=\"form-label\">Enter Email</label>\n");
      out.write("                  <input type=\"email\" name=\"t2\" class=\"form-control\" id=\"email\" value=\"");
      out.print( rs.getString(3));
      out.write("\"   readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                  <label for=\"cnic\" class=\"form-label\">CNIC</label>\n");
      out.write("                  <input type=\"number\" name=\"t3\" class=\"form-control\" id=\"cnic\" value=\"");
      out.print( rs.getString(4));
      out.write("\"  readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-1\" style=\"margin:30px\">\n");
      out.write("                    <label for=\"course\" class=\"form-label\">select course*</label>\n");
      out.write("                    <select class=\"form-select\" id='course' name=\"t4\" required >\n");
      out.write("                        <option selected>Open this select menu</option>\n");
      out.write("                        <option value=\"1\">CS</option>\n");
      out.write("                        <option value=\"2\">AI</option>\n");
      out.write("                        <option value=\"3\">SE</option>\n");
      out.write("                        <option value=\"4\">BBA</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button type=\"submit\" class=\"btn btn-outline-primary\" style=\"margin:30px\">Submit</button>\n");
      out.write("              </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");

g = new apply();
r = new applyDao();
if (request.getParameter("t4")!=null){
    g.id = b;
    g.pid= Integer.parseInt(request.getParameter("t4"))   ;
    g.status="pending";
    r.insert(g);
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
