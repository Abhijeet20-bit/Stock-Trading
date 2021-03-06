package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/Components/csslink.jsp");
    _jspx_dependants.add("/Components/IsLoggedIn.jsp");
    _jspx_dependants.add("/Components/Sidebar.jsp");
    _jspx_dependants.add("/Components/Topbar.jsp");
    _jspx_dependants.add("/Components/Footer.jsp");
    _jspx_dependants.add("/Components/LogoutModal.jsp");
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
      out.write("        <title>Home</title>\n");
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
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        ");
      out.write('\n');
      out.write('\n');

    if(session.getAttribute("UserName")==null) {
        response.sendRedirect("Login.jsp");
    }

      out.write('\n');
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            ");
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
      out.write("        <div class=\"sidebar-brand-text mx-3\">Stock Trading <sup>????</sup></div>\n");
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
      out.write("\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Topbar -->\n");
      out.write("                    ");
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
      out.write("                <button class=\"btn btn-primary\" type=\"submit\" value=\"submit\" >\n");
      out.write("                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                   \n");
      out.write("                </button>\n");
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
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");
      out.print( session.getAttribute("UserName") );
      out.write("</span>\n");
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
      out.write("\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                    <!-- Begin Page Content -->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <!-- Page Heading -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Content Row -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-primary shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">\n");
      out.write("                                                    Earnings (Monthly)</div>\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">$40,000</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-calendar fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-success shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-success text-uppercase mb-1\">\n");
      out.write("                                                    Earnings (Annual)</div>\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">$215,000</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-info shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-info text-uppercase mb-1\">Tasks\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                                    <div class=\"col-auto\">\n");
      out.write("                                                        <div class=\"h5 mb-0 mr-3 font-weight-bold text-gray-800\">50%</div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col\">\n");
      out.write("                                                        <div class=\"progress progress-sm mr-2\">\n");
      out.write("                                                            <div class=\"progress-bar bg-info\" role=\"progressbar\"\n");
      out.write("                                                                 style=\"width: 50%\" aria-valuenow=\"50\" aria-valuemin=\"0\"\n");
      out.write("                                                                 aria-valuemax=\"100\"></div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-clipboard-list fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Pending Requests Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-warning shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-warning text-uppercase mb-1\">\n");
      out.write("                                                    Pending Requests</div>\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">18</div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-auto\">\n");
      out.write("                                                <i class=\"fas fa-comments fa-2x text-gray-300\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Content Row -->\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <!-- Area Chart -->\n");
      out.write("                            <!--\n");
      out.write("                            <div class=\"col-xl-8 col-lg-7\">\n");
      out.write("                                <div class=\"card shadow mb-4\"> -->\n");
      out.write("                            <!-- Card Header - Dropdown -->\n");
      out.write("                            <!--\n");
      out.write("                            <div\n");
      out.write("                                class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                                <h6 class=\"m-0 font-weight-bold text-primary\">Earnings Overview</h6>\n");
      out.write("                                <div class=\"dropdown no-arrow\">\n");
      out.write("                                    <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\"\n");
      out.write("                                        data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                        <i class=\"fas fa-ellipsis-v fa-sm fa-fw text-gray-400\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu dropdown-menu-right shadow animated--fade-in\"\n");
      out.write("                                        aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("                                        <div class=\"dropdown-header\">Dropdown Header:</div>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            -->\n");
      out.write("                            <!-- Card Body -->\n");
      out.write("                            <!--\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"chart-area\">\n");
      out.write("                                    <canvas id=\"myAreaChart\"></canvas>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                            -->\n");
      out.write("                            <!-- Pie Chart -->\n");
      out.write("                            <div class=\"col-xl-4 col-lg-5\">\n");
      out.write("                                <div class=\"card shadow mb-4\">\n");
      out.write("                                    <!-- Card Header - Dropdown -->\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Revenue Sources</h6>\n");
      out.write("                                        <div class=\"dropdown no-arrow\">\n");
      out.write("                                            <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink\"\n");
      out.write("                                               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                                <i class=\"fas fa-ellipsis-v fa-sm fa-fw text-gray-400\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--fade-in\"\n");
      out.write("                                                 aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("                                                <div class=\"dropdown-header\">Dropdown Header:</div>\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                                <div class=\"dropdown-divider\"></div>\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Card Body -->\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"chart-pie pt-4 pb-2\">\n");
      out.write("                                            <canvas id=\"myPieChart\"></canvas>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"mt-4 text-center small\">\n");
      out.write("                                            <span class=\"mr-2\">\n");
      out.write("                                                <i class=\"fas fa-circle text-primary\"></i> Direct\n");
      out.write("                                            </span>\n");
      out.write("                                            <span class=\"mr-2\">\n");
      out.write("                                                <i class=\"fas fa-circle text-success\"></i> Social\n");
      out.write("                                            </span>\n");
      out.write("                                            <span class=\"mr-2\">\n");
      out.write("                                                <i class=\"fas fa-circle text-info\"></i> Referral\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"sticky-footer bg-white\">\n");
      out.write("    <div class=\"container my-auto\">\n");
      out.write("        <div class=\"copyright text-center my-auto\">\n");
      out.write("            <span>Copyright &copy; Made By Abhijeet???????? 2022</span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <!-- End of Footer -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("<!-- Scroll to Top Button-->\n");
      out.write("<a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<!-- Logout Modal-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("     aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">??</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JavaScript-->\n");
      out.write("<script src=\"Static/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("<script src=\"Static/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Core plugin JavaScript-->\n");
      out.write("<script src=\"Static/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Custom scripts for all pages-->\n");
      out.write("<script src=\"Static/js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page level plugins -->\n");
      out.write("<script src=\"Static/vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Page level custom scripts -->\n");
      out.write("\n");
      out.write("<script src=\"Static/js/demo/chart-pie-demo.js\"></script>\n");
      out.write("<script src=\"Static/js/callApi.js\"></script>\n");
      out.write("</body>\n");
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
