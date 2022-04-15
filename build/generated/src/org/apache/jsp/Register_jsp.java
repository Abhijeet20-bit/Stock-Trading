package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Components/csslink.jsp");
  }

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
      out.write("        <title>Register</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"Static/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template-->\n");
      out.write("<link href=\"Static/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"Static/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg_css\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");
 
            String msg=request.getParameter("msg");
            if(msg.equals("success")) { 
      out.write("\n");
      out.write("            <h6 style=\"colour: red;\">User registered Successfully</h6>\n");
      out.write("            ");
 }
            else if(msg.equals("fail")){ 
      out.write("\n");
      out.write("            <h6 style=\"colour: red;\">Password and RepeatPassword doesn't matched</h6>\n");
      out.write("            ");
 }
            else { 
      out.write("\n");
      out.write("                <h6 style=\"colour: red;\">Unknow Error Occured</h6>\n");
      out.write("            ");
 }
        
      out.write("\n");
      out.write("        <div class=\"card o-hidden border-0 shadow-lg\" id=\"loginarea\">\n");
      out.write("            <div class=\"card-body p-0\">\n");
      out.write("                <!-- Nested Row within Card Body -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-5 d-none d-lg-block bg-register-abhi\"></div>\n");
      out.write("                    <div class=\"col-lg-7\">\n");
      out.write("                        <div class=\"p-5\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <h1 class=\"h4 text-gray-900 mb-4\">Create an Account!</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <form class=\"user\">\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <div class=\"col-sm-6 mb-3 mb-sm-0\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" id=\"exampleFirstName\"\n");
      out.write("                                            placeholder=\"First Name\" name=\"fname\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-user\" id=\"exampleLastName\"\n");
      out.write("                                            placeholder=\"Last Name\" name=\"lname\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control form-control-user\" id=\"exampleInputEmail\"\n");
      out.write("                                        placeholder=\"Email Address\" name=\"mail\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row\">\n");
      out.write("                                    <div class=\"col-sm-6 mb-3 mb-sm-0\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control form-control-user\"\n");
      out.write("                                            id=\"exampleInputPassword\" placeholder=\"Password\" name=\"pass\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control form-control-user\"\n");
      out.write("                                            id=\"exampleRepeatPassword\" placeholder=\"Repeat Password\" name=\"rpass\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"login.html\" class=\"btn btn-primary btn-user btn-block\">\n");
      out.write("                                    Register Account\n");
      out.write("                                </a>\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                            <hr>\n");
      out.write("                            \n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a class=\"small\" href=\"Login.jsp\">Already have an account? Login!</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
