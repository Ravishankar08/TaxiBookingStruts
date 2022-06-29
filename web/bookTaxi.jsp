<%@taglib uri="http://struts.apache.org/tags-html" prefix="tag" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Taxi Booking page</h1>
        <tag:form action="/taxiBookprocess" method="post" >
            <table>
                <tr>
                    <td>From :</td>
                    <td>
                        <tag:select property="fromoptions" >
                            <tag:option value="1">DLF</tag:option>
                            <tag:option value="2">Velacherry</tag:option>
                            <tag:option value="3">T Nagar</tag:option>
                            <tag:option value="4">Tambaram</tag:option>
                            <tag:option value="5">Nungambakam</tag:option>

                        </tag:select>
                    </td>
                </tr>
                <tr>
                    <td ><tag:errors property="fromerr"/></td>
                </tr>
                <tr>
                    <td>To :</td>
                    <td><tag:select property="tooptions" >
                            <tag:option value="1">DLF</tag:option>
                            <tag:option value="2">Velacherry</tag:option>
                            <tag:option value="3">T Nagar</tag:option>
                            <tag:option value="4">Tambaram</tag:option>
                            <tag:option value="5">Nungambakam</tag:option>

                        </tag:select></td>

                </tr>
                <tr>
                    <td colspan="2"><tag:errors property="toerr"/></td>
                </tr>
                <tr>
                    <td>Time :</td>
                    <td><tag:text property="reqTime"/></td>
                </tr>
                <tr>
                    <td colspan="2"><tag:errors property="timeerr"/></td>
                </tr>
                <tr>
                    <td colspan="2"><center><tag:submit property="bookBtn"/></center></td>
                </tr>
               
            </table>
        </tag:form>
    </body>
</html>
