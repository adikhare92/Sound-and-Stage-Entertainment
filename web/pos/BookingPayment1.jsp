<%-- 
    Document   : BookingPayment1
    Created on : 15 Feb, 2017, 1:59:02 PM
    Author     : Dear Kallu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="BookingPayment2.jsp">
            <table align="center">
                <tr>
                    <td>Enter Booking Code:</td>
                    <td><input type="text" name="txtbcode" required/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2" ><input type="submit" value="Make Payment"</td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
