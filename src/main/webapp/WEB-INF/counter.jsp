<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Counter</title>
    </head>
    <body>
        <c:out value="You've visited this site ${count}"/>
        <a href="/">Visit again!</a>
    </body>
</html>