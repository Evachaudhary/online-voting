<%-- 
    Document   : outprocess
    Created on : May 29, 2018, 8:09:36 AM
    Author     : Eva
--%>

<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
    <head>
    <body bgcolor="grey">   
<%
int otp= (Integer) session.getAttribute("otp");
String otpvalue=request.getParameter("otpvalue");
int enterOtp=Integer.parseInt(otpvalue);
if(otp==enterOtp)
{
out.print("OTP Successfully Verified");
}
else
{
out.println("OTP not matched");
}



%>
</body>
</head>