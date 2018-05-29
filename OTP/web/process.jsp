<%-- 
    Document   : process
    Created on : May 29, 2018, 8:09:05 AM
    Author     : Eva
--%>
<%@page import="java.util.Random"%>
<%@page import="java.io.BufferedReader"%>
<%@page import ="java.io.*" %>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.URLConnection"%> 
<%@page import=" java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    
String hash = "aeffa313a19670e58c60bbf29dc199c4fac1579245d1f825a59b41af0dbe0ef6";
String username= "eva.mcs17.du@gmail.com";
String numbers = request.getParameter("phone");
String sender="TXTLCL";
String test="0";  //parametr of API
Random rand=new Random();
int otp=rand.nextInt(9000)+1000; //9 folllowed by 0 will determine the length of otp ,here is 4 
session.setAttribute("otp",otp);
String message="Your%20OTP%20is%20:"+otp;  //%20 means space i.e code for space
out.print(message);

URLConnection myURLConnection=null;
URL myURL=null;
BufferedReader reader=null;

String encoded_message=URLEncoder.encode(message);
String mainUrl="http://api.textlocal.in/send/?";  
//Prepare parameter string 
StringBuilder sbPostData= new StringBuilder(mainUrl);
sbPostData.append("&username="+username);
sbPostData.append("&hash="+hash); 
sbPostData.append("&message="+message);
sbPostData.append("&sender="+sender);
sbPostData.append("&numbers="+numbers); 
sbPostData.append("&test="+test);

//final string
mainUrl = sbPostData.toString();
try
{
//prepare connection
myURL = new URL(mainUrl);
myURLConnection = myURL.openConnection();
myURLConnection.connect();
InputStream stream=myURLConnection.getInputStream();
int i;
while((i=stream.read())!=-1)
{
    out.print((char)i);
}

response.sendRedirect("otp.jsp");
//finally close connection
}
catch (IOException e)
{
e.printStackTrace(); 
}
%>
</body>
</html>