package org.apache.jsp.Components;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Sidebar -->\n");
      out.write("<ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar - Brand -->\n");
      out.write("    <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"Dashboard.jsp\">\n");
      out.write("        <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("            <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\">Stock Trading <sup>🔥</sup></div>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Divider -->\n");
      out.write("    <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("    <!-- Nav Item - Dashboard -->\n");
      out.write("    <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"Dashboard.jsp\">\n");
      out.write("            <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("            <span>Dashboard</span></a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    <!-- Divider -->\n");
      out.write("    <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Nav Item - Charts -->\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"Buy\">\n");
      out.write("            <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("            <span>Buy Stocks</span></a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    <!-- Nav Item - Tables -->\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"Sell.jsp\">\n");
      out.write("            <i class=\"fas fa-fw fa-table\"></i>\n");
      out.write("            <span>Sell Stocks</span></a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    <!-- Divider -->\n");
      out.write("    <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("    <div class=\"text-center d-none d-md-inline\">\n");
      out.write("        <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("<!-- End of Sidebar -->\n");
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
