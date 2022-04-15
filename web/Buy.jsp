<%-- 
    Document   : Buy.jsp
    Created on : 20 Mar, 2022, 2:09:47 PM
    Author     : Hp
--%>

<%@page import="java.util.Set"%>
<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.util.Map"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- css link -->
        <%@include file="Components/csslink.jsp" %>

    </head>
    <body id="page-top">
        <%@include file="Components/IsLoggedIn.jsp" %>
        <div id="wrapper">
            <!-- Sidebar link -->
            <%@include file="Components/Sidebar.jsp" %>
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <!-- topbar link -->
                    <%@include file="Components/Topbar.jsp" %>
                    <div class="container">
                        <div class="card o-hidden border-0 shadow-lg"  >
                            <div class="card-body ">
                                <%
                                    String msg = request.getParameter("msg");
                                    if (msg != null) {
                                        if (msg.equals("success")) { %>
                                    <h6 class="text-center mt-4 mb-0" style="color: red;">Share Added</h6>
                                    <% } else { %>
                                    <h6 class="text-center mt-4 mb-0" style="color: red;">Unknow Error Occured!!!</h6>
                                    <% }
                                        }
                                    %>

                                <form class="user" action="Bought" method="get">
                                    <div class="form-group row">
                                        <select class="form-select" id="SelectResult" name="Ssym" >
                                            <% if(request.getAttribute("param")!=null) { %>
                                                <option selected value="<%= request.getAttribute("param2") %>"><%= request.getAttribute("param") %> </option>
                                            <% } 
                                            else { %>
                                                    <option selected disabled>Stock Name</option>
                                                <% } %>    
                                            <% LinkedHashMap<String,String> AllStocks=(LinkedHashMap<String,String>)request.getAttribute("BuySelect");
                                                Set<String> keys=AllStocks.keySet();
                                                for(String Key: keys) {%>
                                                <option value="<%=AllStocks.get(Key) %>">
                                                        <%= Key %>
                                                    </option>
                                            <% } %>
                                        </select>
                                    </div>
                                    <div>
                                        <input type="text" class="form-input" id="Quantity" placeholder="Quantity" onchange="getAmount()" onclick="getResult()" name="Quantity">
                                    </div>
                                    <div>
                                        <input readonly type="text" class="form-input" id="Amount" placeholder="Amount Will be displayed here" name="Amount">
                                    </div>
                                    <div>
                                        <input readonly type="text" class="form-input" id="Date" placeholder="Date" name="Date">
                                    </div>
                                        <button class="btn btn-primary btn-user btn-block" type="submit">
                                        BUY STOCK
                                    </button>
                                </form>
                                
                            </div>
                        </div>
                    </div>
                </div> <!-- end of Main COntent -->
                <!-- Footer -->
                <%@include file="Components/Footer.jsp" %>
                <!-- End of Footer -->
            </div> <!-- content-wrapper -->
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
        
        
        <script src="Static/js/BuyJS.js" ></script>

    </body>
</html>
