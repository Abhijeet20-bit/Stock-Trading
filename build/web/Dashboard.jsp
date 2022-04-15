<%-- 
    Document   : Dashboard
    Created on : 7 Mar, 2022, 8:47:36 PM
    Author     : Hp
--%>

<%@page import="java.util.Set"%>
<%@page import="java.util.LinkedHashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <%@include file="Components/csslink.jsp" %>
    </head>

    <body id="page-top">
        <%@include file="Components/IsLoggedIn.jsp" %>
        
        
        <!-- Page Wrapper -->

        <div id="wrapper">

            <!-- Sidebar -->
            <%@include file="Components/Sidebar.jsp"%>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                
                <div id="content">
                    <%@include file="Components/Topbar.jsp" %>
                    <% if(request.getParameter("msg")==null) { %>
                    <h3 id="NoDisplay"> You Do Not have any Stocks to Display!<br> Buy Some Stocks Or Search for Stocks Using the search bar </h3>  
                    <% } %>
                    <% 
                    if (request.getParameter("msg")!=null) { %>
                    <!-- Topbar -->
                    
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->


                        <!-- Content Row -->
                        <div class="row">

                            <!-- Earnings (Monthly) Card Example -->
                            <div class="col-xl-4 col-md-6 mb-4">
                                <div class="card border-left-primary shadow h-100 py-2">
                                    <div class="card-body">
                                        <div class="row no-gutters align-items-center">
                                            <div class="col mr-2">
                                                <div class="text-xs font-weight-bold text-primary text-uppercase mb-1" >
                                                    Total Invested Amount(in USD)</div>
                                                <div class="h5 mb-0 font-weight-bold text-gray-800" id="invamt">$<%= request.getAttribute("investedAmount")%></div>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-calendar fa-2x text-gray-300"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- Earnings (Monthly) Card Example -->
                            <div class="col-xl-4 col-md-6 mb-4">
                                <div class="card border-left-success shadow h-100 py-2">
                                    <div class="card-body">
                                        <div class="row no-gutters align-items-center">
                                            <div class="col mr-2">
                                                <div class="text-xs font-weight-bold text-success text-uppercase mb-1" id="profit_loss">
                                                    Loading!!!    </div>
                                                <div class="h5 mb-0 font-weight-bold text-gray-800" id="amt"></div>
                                            </div>
                                            <div class="col-auto">
                                                <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>

                        <!-- Content Row -->

                        <div class="row">


                            <!-- Pie Chart -->
                            <div class="col-xl-4 col-lg-5">
                                <div class="card h-100 shadow mb-4">
                                    <!-- Card Header - Dropdown -->
                                    <div
                                        class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-primary">Your Holdings Ratio</h6>
                                        <div class="dropdown no-arrow">
                                            <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink"
                                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                            </a>
                                            <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                                                 aria-labelledby="dropdownMenuLink">
                                                <div class="dropdown-header">Dropdown Header:</div>
                                                <a class="dropdown-item" href="#">Action</a>
                                                <a class="dropdown-item" href="#">Another action</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="#">Something else here</a>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- Card Body -->
                                    <div class="card-body">
                                        <div class="chart-pie pt-4 pb-2">
                                            <canvas id="myPieChart"></canvas>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-4 col-lg-5">
                                <div class="card shadow mb-4 scroll" >
                                    <!-- Card Header - Dropdown -->
                                    <div
                                        class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-primary">All Your Holdings</h6>

                                    </div>
                                    <!-- Card Body -->
                                    <div class="card-body">
                                        <% LinkedHashMap<String, String> AllHoldings = (LinkedHashMap<String, String>) request.getAttribute("HoldingDetails");
                                            AllHoldings.remove("invAmt");
                                            if (AllHoldings != null) {
                                                //System.out.println(AllHoldings.get("InvAmt"));
                                                Set<String> keys = AllHoldings.keySet();
                                                for (String Key : keys) {
                                                    String list[] = AllHoldings.get(Key).split("-");%>
                                        <div class="card border-left-success shadow py-2">
                                            <div class="card-body">
                                                <div class="row no-gutters align-items-center">
                                                    <div class="col mr-2">
                                                        <div class="text font-weight-bold text-success text-uppercase mb-1">
                                                            <%= Key%> </div>

                                                        <div class="text-s mb-0 font-weight-bold text-gray-800">QTY:<%= list[1]%></div>
                                                        <div class="text-s mb-0 font-weight-bold text-gray-800">AVG BUY Price: $<%= list[2]%></div>
                                                    </div>
                                                    <div class="col-auto">
                                                        <i class="fas fa-calendar fa-2x text-gray-300"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <% }
                                            }%>

                                    </div>

                                </div>
                            </div>






                        </div>

                    </div>
                    <!-- /.container-fluid -->
                    <% } %>
                </div>
                
                <!-- End of Main Content -->

                <!-- Footer -->
                <%@include file="Components/Footer.jsp" %>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <%@include file="Components/LogoutModal.jsp" %>

        <!-- Bootstrap core JavaScript-->
        <script src="Static/vendor/jquery/jquery.min.js"></script>
        <script src="Static/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="Static/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="Static/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="Static/vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->

        <script src="Static/js/demo/chart-pie-demo.js" req = "<%= request.getAttribute("fordonut")%>"></script>
        <script src="Static/js/callApi.js" ></script>
        <script src="Static/js/DashBoard.js" Data = "<%= request.getAttribute("allSymbols")%>"></script> 
    </body>
</html>
