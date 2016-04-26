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
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" >
        <script src="<c:url value="/resources/js/jquery-1.12.0.min.js" />"></script>
        <title>Item Form</title>
    </head>
    <body>
        
        <div class="container">
            <form action="<c:url value="/item/save" />" method="POST">
                <div class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-2">Code</label>
                        <div class="col-md-4">
                            <input type="text" class="form-control" name="code" />
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-2">Name</label>
                        <div class="col-md-4">
                            <input type="text" class="form-control" name="name" />
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-2">Price</label>
                        <div class="col-md-4">
                            <input type="text" class="form-control" name="price" />
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-2">Cost</label>
                        <div class="col-md-4">
                            <input type="text" class="form-control" name="cost" />
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-2">Stock</label>
                        <div class="col-md-4">
                            <input type="text" class="form-control" name="stock" />
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-2">ExpiredDate</label>
                        <div class="col-md-8">
                            <span class="input-group">
                                <input type="text" class="form-control datepicker" name="expiredDateParam" />
                            </span>
                        </div>
                    </div>
                </div>
                <div class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-2">&nbsp;</label>
                        <div class="col-md-4">
                            <span class="input-group">
                                <input type="submit" class="btn btn-primary" value="Save" />
                            </span>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </body>
    <script src="<c:url value="/resources/script/item-script.js" />"></script>
</html>
