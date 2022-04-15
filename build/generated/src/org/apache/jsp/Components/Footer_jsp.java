package org.apache.jsp.Components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../Static/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"../Static/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Static/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <footer class=\"sticky-footer bg-white\">\n");
      out.write("                <div class=\"container my-auto\">\n");
      out.write("                    <div class=\"copyright text-center my-auto\">\n");
      out.write("                        <span>Copyright &copy; Made By Abhijeet💕💕 2022</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </footer>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <script src=\"../Static/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"../Static/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"../Static/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"../Static/js/sb-admin-2.min.js\"></script>\n");
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
