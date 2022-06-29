<%@page import="com.myapp.struts.*"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Admin Flow</h1>
        <ol>
            <li><a href="ShowTaxi.jsp">Show Taxi Details</a></li>
            <li><a href="ShowUser.jsp">Show User Details</a></li>
        </ol>
        <br>
        <br>
        <html:form  method="post" action="resttaxi">
            <html:text property="restno"  />
            <html:submit property="restbtn" value ="rest"/>
        </html:form>
        <h2>Taxis at rest</h2>
        <%
            for (Taxi taxi : DBClass.Taxi_List) {
                if (taxi.isRest()) {
                    out.println("<li>Taxi " + taxi.getId() + "</li>");
                }
            }
        %>
         <html:form  method="post" action="unresttaxi">
            <html:text property="restno2"/>
            <html:submit property="restbtn" value ="unrest"/>
        </html:form>
        <html:errors property="resterr"/>


    </body>
</html>
