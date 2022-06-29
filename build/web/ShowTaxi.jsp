
<%@page import="com.myapp.struts.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Taxi list</title>
        <style>
            .attribute{
                width:100px;
                background-color:lightcyan ;
            }
            thead{
                background-color: lightblue;
            }
        </style>
    </head>
    <body>
        <h1>Taxi List</h1>
        <ul>
            <%
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm aa");
                for (Taxi taxi : DBClass.Taxi_List) {
                    int count = 1;
                    
            %>
            <li><%="Taxi " + taxi.getId() + " &nbsp &nbsp Salary : " + taxi.getSalary()%></li>

            <%
                out.println("<br>");
                for (TaxiOrders order : taxi.OrdersOfTaxi) {

            %>

            <table border="1" width="20%" cellspacing="10" cellpadding="5" >
                        <thead>
                            <tr>
                                <th colspan="2"><%="Order " + count%></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="attribute">Customer </td>
                                <td><%=order.getCustomerName().toUpperCase()%></td>
                            </tr>
                            <tr>
                                <td class="attribute">Cost </td>
                                <td><%=order.getPrice()%></td>
                            </tr>
                            <tr>
                                <td class="attribute">From</td>
                                <td><%=DBClass.place[order.getFrom()].getPlaceName()%></td>
                            </tr>
                            <tr>
                                <td class="attribute">Destination</td>
                                <td><%=DBClass.place[order.getTo()].getPlaceName()%></td>
                            </tr>
                            <tr>
                                <td class="attribute">Request Time</td>
                                <td><%=formatter.format(order.getReqTime())%></td>
                            </tr>
                            <tr>
                                <td class="attribute">Pick Up Time</td>
                                <td><%=formatter.format(order.getPickUpTime())%></td>
                            </tr>
                            <tr>
                                <td class="attribute">Drop Time</td>
                                <td><%=formatter.format(order.getDropTime())%></td>
                            </tr>
                            <tr>
                                <td class="attribute">Taxi Loss</td>
                                <td><%=order.getLoss()%></td>
                            </tr>
                        </tbody>
                    </table>
                            <br>

            <%
                count++;
                
                    }
                }
            %>
        </ul>
        <br>
        <form action="Adminlogout" method="post">
            <button type="submit" name="logbtn">Logout</button>
        </form>
    </body>
</html>
