<%-- 
    Document   : item-form
    Created on : 23/01/2016, 9:24:07 AM
    Author     : Artha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/css/bootstrap.min.css" />" >
        <script src="<c:url value="/resources/js/jquery-1.12.0.min.js" />"></script>
        <title>Item Form</title>
    </head>
    <body>
        <h1>Input Item</h1>
        <form action="<c:url value="/item/save" />" method="POST">
            <table>
                <tr>
                    <td><label for="code">Code</label></td>
                    <td><input type="text" name="code"></td>
                </tr>
                <tr>
                    <td><label for="name">Name</label></td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td><label for="price">Price</label></td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>
                    <td><label for="cost">Cost</label></td>
                    <td><input type="text" name="cost"></td>
                </tr>
                <tr>
                    <td><label for="quantity">Quantity</label></td>
                    <td><input type="text" name="quantity"></td>
                </tr>
                <tr>
                    <td><label for="expiredDate">Expired Date</label></td>
                    <td><input type="text" name="expiredDateParam"></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><input type="submit" value="Save"></td>
                </tr>
            </table>
        </form>
            
            <div class="container">
                <div class="form-inline">
                    <label>test</label>
                    <input type="text" name="test">
                </div>
            </div>
            <div class="container">
                <div class="form-inline">
                    <label>test</label>
                    <input type="text" name="test">
                </div>
            </div>
    </body>
    <script src="<c:url value="/resources/script/item-script.js" />"></script>
</html>
