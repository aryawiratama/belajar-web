<%-- 
    Document   : login
    Created on : 04/05/2016, 1:22:58 PM
    Author     : Artha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-4 col-md-offset-3">
                <c:if test="${error != null}">
                    <div class="alert alert-danger">Invalid Username & Password</div>
                </c:if>
                    <form action="<c:url value="/login" />" method="post">
                    <div class="form-inline">
                        <div class="form-group">
                            <label class="control-label"><h3>Login Page</h3></label>
                        </div>
                    </div>
                    <div class="form-inline">
                        <div class="form-group">
                            <label class="control-label">Username</label>
                            <input type="text" name="username" class="form-control" />
                        </div>
                    </div>
                    <div class="form-inline">
                        <div class="form-group">
                            <label class="control-label">Password</label>
                            <input type="password" name="password" class="form-control" />
                        </div>
                    </div>
                    <div class="form-inline">
                        <div class="form-group">
                            <label class="control-label">&nbsp;</label>
                            <input type="submit" class="btn btn-primary" name="submit" value="Login"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
