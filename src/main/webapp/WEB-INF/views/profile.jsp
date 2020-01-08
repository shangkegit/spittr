<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
    </head>
    <body>
        <h1>Your Profile</h1>

        <div><c:out value="${spitter.userName}" /></div>
        <div><span><c:out value="${spitter.firstName} ${spitter.lastName}" /></div>
    </body>
</html>