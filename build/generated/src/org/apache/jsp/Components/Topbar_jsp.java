package org.apache.jsp.Components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Topbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Topbar -->\n");
      out.write("<nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("        <i class=\"fa fa-bars\"></i>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <!-- Topbar Search -->\n");
      out.write("    <form\n");
      out.write("        class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\" action=\"graph\" >\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for Stocks\" name=\"Sname\"\n");
      out.write("                   aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("            <div class=\"input-group-append\">\n");
      out.write("                <a href=\"Graph.jsp\" class=\"btn btn-primary\" type=\"submit\" value=\"submit\" onClick=\"ApiFetch('");
      out.print(request.getAttribute("abhi"));
      out.write("')\">\n");
      out.write("                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    <!-- Topbar Navbar -->\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("        <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("        <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\n");
      out.write("               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("            </a>\n");
      out.write("            <!-- Dropdown - Messages -->\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\n");
      out.write("                 aria-labelledby=\"searchDropdown\">\n");
      out.write("                <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control bg-light border-0 small\"\n");
      out.write("                               placeholder=\"Search for...\" aria-label=\"Search\"\n");
      out.write("                               aria-describedby=\"basic-addon2\">\n");
      out.write("                        <div class=\"input-group-append\">\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("        <!-- Nav Item - User Information -->\n");
      out.write("        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Douglas McGee</span>\n");
      out.write("                <img class=\"img-profile rounded-circle\" src=\"Static/img/undraw_profile.svg\">\n");
      out.write("            </a>\n");
      out.write("            <!-- Dropdown - User Information -->\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                 aria-labelledby=\"userDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                    Profile\n");
      out.write("                </a>\n");
      out.write("                <!--<a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                    Settings\n");
      out.write("                </a> -->\n");
      out.write("\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                    Logout\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("<!-- End of Topbar -->\n");
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
