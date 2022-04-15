<%-- 
    Document   : Error.jsp
    Created on : 30 Mar, 2022, 2:21:47 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= request.getParameter("msg") %></h1>
    </body>
</html>
