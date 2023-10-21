package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admdash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");


HttpSession ses = request.getSession();
if (ses.getAttribute("aid")!=null){
   
}
else{
    response.sendRedirect("errorpage.jsp");
}





      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black\">\n");
      out.write("        <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("           <span class=\"navbar-brand mb-0 h1\">Admin Dashboard</span>\n");
      out.write("           <div class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <a  href=\"alogout.jsp\"  class=\"btn btn-outline-danger my-2 my-sm-0\" >Logout</a>\n");
      out.write("           </div>\n");
      out.write("       </nav>\n");
      out.write("        <div class=\"card-group d-flex flex-row justify-content-around align-items-center\" style=\"margin-top: 200px\">\n");
      out.write("             <div class=\"card bg-light mb-3 rounded\" style=\"max-width: 18rem;\">\n");
      out.write("              <div class=\"card-header\">Selection</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h5 class=\"card-title\">set status</h5>\n");
      out.write("                  <p class=\"card-text\">set the application status of applicants</p>\n");
      out.write("                  <a href=\"set_status.jsp\" class=\"btn btn-outline-primary\">update</a>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"card bg-light mb-3 rounded\" style=\"max-width: 18rem;\">\n");
      out.write("              <div class=\"card-header\">view</div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h5 class=\"card-title\">View applications</h5>\n");
      out.write("                  <p class=\"card-text\">set the application status of applicants</p>\n");
      out.write("                  <a href=\"admin_view.jsp\" class=\"btn btn-outline-primary\">update</a>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
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
