<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
    </head>
    <body>
        <div><c:out value="${spittle.message}" /></div>
        <div><span><c:out value="${spittle.time}" /></div>
    </body>
</html>