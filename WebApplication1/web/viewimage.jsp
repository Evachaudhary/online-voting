<%-- 
    Document   : view
    Created on : Mar 20, 2018, 11:16:07 AM
    Author     : Eva
--%
<%-- 
    Document   : viewfile
    Created on : Mar 15, 2018, 7:45:56 PM
    Author     : pushkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VIEW IMAGE </title>
    </head>
    <body>
        <%  OutputStream img =null;
            Connection conn=null;
            Statement ps=null;
            ResultSet rs=null;
            String str=request.getParameter("fname");
            Blob file=null;
            byte [] filedata=null;
            try
            {
                String filename=request.getParameter("fname");
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/image","root","12345678");
                    conn.setAutoCommit(false);
                    ps=conn.createStatement();
                }
                catch(Exception e)
                {
                    out.println(e.getMessage());
                }
                rs=ps.executeQuery("select * from trn_imgs");
                try{
                    if(rs.next())
                    {   filedata = rs.getBytes(3);
                        //file=rs.getBlob(1);
                        //filedata=file.getBytes(1,(int)file.length());
                    }
                    else
                    {
                        out.println("File Not Found");
                    }
                    response.setContentType("image/jpeg");
                  //  response.getOutputStream().write(imageData);
                    img =response.getOutputStream(); //kind of response header 
                    //response.setHeader("Content_Disposition","inline");
                    response.setContentLength(filedata.length);
                    
                    OutputStream output=response.getOutputStream();
                    img.write(filedata);  //write the bytes fetched from the db to o/p screen object 
                    output.flush(); //covert byte content into given data type 
                    img.flush();
                    img.close();
                }
                catch(Exception e)
                {
                    out.println(e.getMessage());
                }
        %>
        
        <%
           }
           catch(Exception e)
            {
                out.println(e.getMessage());
            }
            finally
            {
                try
                {
                    rs.close();
                    ps.close();
                    conn.close();
                }
                catch(Exception e)
                {
                    out.println(e.getMessage());
                }
            }
        %>
    </body>
</html>
