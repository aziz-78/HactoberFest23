package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dbclasses.*;

public final class set_005fstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ResultSet rs; 
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

HttpSession ses = request.getSession();
if (ses.getAttribute("aid")==null){
   response.sendRedirect("errorpage.jsp");
}

selectDao a = new selectDao();
rs= a.selectstatus();



      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: oldlace\">\n");
      out.write("        <nav class=\"navbar navbar-light bg-dark \">\n");
      out.write("           <span class=\"navbar-brand mb-0 h1 text-white\">Set Application Status</span>\n");
      out.write("            <div class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <a  href=\"admdash.jsp\"  class=\"btn btn-outline-danger my-2 my-sm-0\" >Back to dashboard</a>\n");
      out.write("           </div>\n");
      out.write("       </nav>\n");
      out.write("        <div class=\"container-lg d-flex justify-content-center align-items-center container1\" style=\"margin-top: 100px\" >\n");
      out.write("        <table class=\"table table-lg table-dark table-hover \" >\n");
      out.write("          <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th scope=\"col\">student id</th>\n");
      out.write("                  <th scope=\"col\">name</th>\n");
      out.write("                  <th scope=\"col\">program</th>\n");
      out.write("                  <th scope=\"col\">status</th>\n");
      out.write("                  <th scope=\"col\">update</th>\n");
      out.write("                </tr>\n");
      out.write("         </thead>\n");
      out.write("              <tbody>\n");
      out.write("                  ");
while(rs.next()){
      out.write("\n");
      out.write("                   <tr>\n");
      out.write("                       <th scope=\"col\">");
      out.print( rs.getInt(1) );
      out.write("</th>\n");
      out.write("                       <th scope=\"col\">");
      out.print( rs.getString(2) );
      out.write("</th>\n");
      out.write("                       <th scope=\"col\">");
      out.print( rs.getString(3) );
      out.write("</th>\n");
      out.write("                       <th scope=\"col\">");
      out.print( rs.getString(4) );
      out.write("</th>\n");
      out.write("                       <th scope=\"col\"><a href=\"edit_status.jsp?aid=");
      out.print( rs.getInt(5));
      out.write("\"   class=\" btn btn-outline-success\">set status</a></th>\n");
      out.write("                       \n");
      out.write("                   </tr>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("              </tbody>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("    .container1 {\n");
      out.write("  max-width: 1300px;\n");
      out.write("  margin: 30px auto;\n");
      out.write("  overflow: auto;\n");
      out.write("  min-height: 150px;\n");
      out.write("  border: 3px solid black;\n");
      out.write("  padding: 15px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("}\n");
      out.write("</style>");
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
