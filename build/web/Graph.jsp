<%-- 
    Document   : Graph
    Created on : 14 Mar, 2022, 10:16:50 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="Components/csslink.jsp" %>
    </head>
    <body id="page-top">
        <%@include file="Components/IsLoggedIn.jsp" %>
        <div id="wrapper">

            <%@include file="Components/Sidebar.jsp" %>

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <%@include file="Components/Topbar.jsp" %>

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->


                        <!-- Content Row -->
                        <div class="row">
                            <div class="col-xl-6">
                                <div class="row">
                                    <div class="col-xl-6 col-md-6 mb-4">
                                        <div class="card border-left-primary shadow h-100 py-2">
                                            <div class="card-body">
                                                <div class="row no-gutters align-items-center">
                                                    <div class="col mr-2">
                                                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
                                                            Current Value
                                                        </div>
                                                        <div class="h5 mb-0 font-weight-bold text-gray-800" id="CurrentValue"></div>
                                                    </div>
                                                    <div class="col-auto">
                                                        <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6 col-md-6 mb-4">
                                        <div class="card border-left-primary shadow h-100 py-2">
                                            <div class="card-body">
                                                <div class="row no-gutters align-items-center">
                                                    <div class="col mr-2">
                                                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
                                                            Prev Close
                                                        </div>
                                                        <div class="h5 mb-0 font-weight-bold text-gray-800" id="PrevClose"></div>
                                                    </div>
                                                    <div class="col-auto">
                                                        <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xl-6 col-md-6 mb-4">
                                        <div class="card border-left-primary shadow h-100 py-2">
                                            <div class="card-body">
                                                <div class="row no-gutters align-items-center">
                                                    <div class="col mr-2">
                                                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1" >
                                                            Today's High
                                                        </div>
                                                        <div class="h5 mb-0 font-weight-bold text-gray-800" id="TodaysHigh"></div>
                                                    </div>
                                                    <div class="col-auto">
                                                        <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6 col-md-6 mb-4">
                                        <div class="card border-left-primary shadow h-100 py-2">
                                            <div class="card-body">
                                                <div class="row no-gutters align-items-center">
                                                    <div class="col mr-2">
                                                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1" >
                                                            Today's Low
                                                        </div>
                                                        <div class="h5 mb-0 font-weight-bold text-gray-800" id="TodaysLow"></div>
                                                    </div>
                                                    <div class="col-auto">
                                                        <i class="fas fa-dollar-sign fa-2x text-gray-300"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xl-12 col-md-12 mb-4">
                                        <div class="card border-left-primary shadow h-100 py-2">
                                            <div class="card-body">
                                                <div class="row no-gutters align-items-center">
                                                    <div class="col mr-2">
                                                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1" >
                                                            volume
                                                        </div>
                                                        <div class="h5 mb-0 font-weight-bold text-gray-800" id="VolumeCard"></div>
                                                    </div>
                                                    <div class="col-auto">
                                                        <i class="fas fa-clipboard-list fa-2x text-gray-300"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-6">
                                <div class="col-xl-12 col-lg-12">
                                    <div class="card shadow mb-4">
                                        <!-- Card Header - Dropdown -->

                                        <div
                                            class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                            <h6 class="m-0 font-weight-bold text-primary"><%=request.getAttribute("stockname") %></h6>
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
                                            <div class="chart-area">
                                                <!--<canvas id="myAreaChart"></canvas>-->
                                                <canvas id="myChart"></canvas>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row ">
                            <div class="col-auto align-items-center" >
                                <a class="btn btn-primary " href="Buy?sym=<%=request.getAttribute("stockname")  %>">BUY</a> 
                            </div>
                            
                        </div>


                        <!--<h1>Hello World!!</h1>
                        <h2>Abhijeet- <%=request.getAttribute("abhi")%></h2>

                        <button class="btn btn-primary" type="submit" value="submit" onClick="ApiFetch('<%=request.getAttribute("abhi")%>')">
                            <i class="fas fa-search fa-sm"></i>
                        </button>
                        <br>
                        <div id="data">
                            rnc
                        </div>-->








                        <!-- Content Row -->







                    </div>
                    <!-- /.container-fluid -->

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
        <script src="Static/js/demo/chart-area-demo.js" Data="<%=request.getAttribute("symbol")  %>" ></script> 
        <script src="https://cdn.jsdelivr.net/npm/chart.js" ></script>
        <script src="Static/js/Drawgraph.js " Data="<%=request.getAttribute("symbol")  %>"></script>
        <script src="Static/js/apieg.js" Data="<%=request.getAttribute("symbol")  %>" > </script>
    </body>
</html>
