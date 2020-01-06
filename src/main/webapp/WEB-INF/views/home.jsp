<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
    </head>
    <body>
        <h1>Welcome Spittr</h1>
        <a href="<c:url value='/spittles' />">Spittr</a> |
        <a href="<c:url value='/spittles/rigister' />">Register</a>
    </body>
</html>