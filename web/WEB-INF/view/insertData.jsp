<%-- 
    Document   : insertData
    Created on : Apr 15, 2014, 5:45:42 PM
    Author     : Kasha and Jeff
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <H1>The Rukert Terminals Container Tracker </H1>
         
         <% 
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/rukerttracker", "root", "Colorado1982");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
                statement.executeQuery("select * from containerinventory") ; 
        %>
           <div style="height:50%;overflow:auto;"> 
           <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>Container Number</TH>
                <TH>Full Out Date</TH>
                <TH>Empty In Date</TH>
                <TH>Empty Out Date</TH>
                <TH>Full In Date</TH>
                <TH>Comments</TH>
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></TD>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getString(5) %></TD>
                <TD> <%= resultset.getString(6) %></TD>
                <TD> <%= resultset.getString(7) %></TD>
            </TR>
            <% } %>
        </TABLE>
           </DIV>
        
        
    </body>
</html>
