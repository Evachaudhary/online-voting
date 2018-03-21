<%-- 
    Document   : loginpage
    Created on : Feb 13, 2018, 9:53:35 AM
    Author     : Eva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="evoting.logindao"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="obj" class="evoting.loginbean"/>
        <jsp:setproperty property ="*" name="obj"/>
        <h1>Hello World!</h1>
    </body>
</html>
