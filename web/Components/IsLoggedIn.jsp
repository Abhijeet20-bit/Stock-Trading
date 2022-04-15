<%-- 
    Document   : IsLoggedIn
    Created on : 23 Mar, 2022, 5:23:02 PM
    Author     : Hp
--%>

<%
    if(session.getAttribute("UserName")==null) {
        response.sendRedirect("Login.jsp");
    }
%>
