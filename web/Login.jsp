<%-- 
    Document   : Login
    Created on : 3 Mar, 2022, 7:48:09 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Stock-Trading</title>

        <!-- Custom fonts for this template-->
        <%@include file="Components/csslink.jsp" %>
    </head>

    <body class="bg_css">

        <div class="container">

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-10 col-lg-12 col-md-9">

                    <div class="card o-hidden border-0 shadow-lg" id="loginarea">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row" >
                                <div class="col-lg-6 d-none d-lg-block bg-login-abhi"></div>
                                <div class="col-lg-6">
                                    <%
                                    String msg = request.getParameter("msg");
                                    if (msg != null) {
                                        if (msg.equals("IncorrectPass")) { %>
                                    <h6 class="text-center mt-4 mb-0" style="color: red;">Incorrect Password!!!</h6>
                                    <% } else if (msg.equals("NosuchUser")) { %>
                                    <h6 class="text-center mt-4 mb-0" style="color: red;">Email doesn't exists!</h6>
                                    <% } else { %>
                                    <h6 class="text-center mt-4 mb-0" style="color: red;">Unknow Error Occured!!!</h6>
                                    <% }
                                        }
                                    %>
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                        </div>
                                        <form class="user" action="login" method="post">
                                            <div class="form-group">
                                                <input type="email" class="form-control form-control-user"
                                                       id="exampleInputEmail" aria-describedby="emailHelp"
                                                       placeholder="Enter Email Address..." name="Email" required>
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control form-control-user"
                                                       id="exampleInputPassword" placeholder="Password" name="Pass" required>
                                            </div>

                                            <button class="btn btn-primary btn-user btn-block" type="submit" >
                                                Login
                                            </button>

                                        </form>
                                        <hr>

                                        <div class="text-center">
                                            <a class="small" href="Register.jsp">Create an Account!</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="Static/vendor/jquery/jquery.min.js"></script>
        <script src="Static/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="Static/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="Static/js/sb-admin-2.min.js"></script>

    </body>

</html>
