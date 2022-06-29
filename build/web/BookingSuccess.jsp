
<%@page import="java.text.SimpleDateFormat"%>
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
        <h1>Your Booking is success</h1>
        <%
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm aa");
            TaxiOrders order=(TaxiOrders)request.getAttribute("curr_order");
        %>
        <table border="1" width="30%" cellspacing="5">
            <tbody>
                <tr>
                    <td>Taxi Id </td>
                    <td><%=order.getTaxiId()%></td>
                </tr>
                <tr>
                    <td>From :</td>
                    <td><%=DBClass.place[order.getFrom()].getPlaceName()%></td>
                </tr>
                <tr>
                    <td>To</td>
                    <td><%=DBClass.place[order.getTo()].getPlaceName()%></td>
                </tr>
                <tr>
                    <td>Request Time</td>
                    <td><%=formatter.format(order.getReqTime())%></td>
                </tr>
                <tr>
                    <td>Pickup Time</td>
                    <td><%=formatter.format(order.getPickUpTime())%></td>
                </tr>
                <tr>
                    <td>Drop Time</td>
                    <td><%=formatter.format(order.getDropTime())%></td>
                </tr>
                <tr>
                    <td>Taxi Cost</td>
                    <td><%=order.getPrice()%></td>
                </tr>
               
                
                
            </tbody>
        </table>

    </body>
</html>
