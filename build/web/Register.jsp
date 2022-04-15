<%-- 
    Document   : Register
    Created on : 7 Mar, 2022, 6:37:11 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <%@include file="Components/csslink.jsp" %>
    </head>
    <body class="bg_css">

        <div class="container">

            <div class="card o-hidden border-0 shadow-lg" id="loginarea">

                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-5 d-none d-lg-block bg-register-abhi"></div>
                        <div class="col-lg-7">
                            <%
                                String msg = request.getParameter("msg");
                                if (msg != null) {
                                if (msg.equals("success")) { %>
                            <h6 class="text-center mt-4 mb-0" style="color: red;">User registered Successfully!!!</h6>
                            <% } else if (msg.equals("fail")) { %>
                            <h6 class="text-center mt-4 mb-0" style="color: red;">Password and RepeatPassword doesn't matched!!!</h6>
                            <% } else { %>
                            <h6 class="text-center mt-4 mb-0" style="color: red;">Unknow Error Occured!!!</h6>
                            <% }
                                }
                            %>
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                                </div>
                                <form class="user" action="Verify-Registration" method="post">
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                                   placeholder="First Name" name="fname">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control form-control-user" id="exampleLastName"
                                                   placeholder="Last Name" name="lname">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control form-control-user" id="exampleInputEmail"
                                               placeholder="Email Address" name="mail">
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="password" class="form-control form-control-user"
                                                   id="exampleInputPassword" placeholder="Password" name="pass">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control form-control-user"
                                                   id="exampleRepeatPassword" placeholder="Repeat Password" name="rpass">
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-user btn-block">
                                        Register Account
                                    </button>

                                </form>
                                <hr>

                                <div class="text-center">
                                    <a class="small" href="Login.jsp">Already have an account? Login!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

    </body>

</html>
</html>
