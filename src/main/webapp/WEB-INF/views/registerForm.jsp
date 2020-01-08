<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
    </head>
    <body>
        <h1>Register</h1>

        <form method="POST">
            First Name: <input type="text" name="firstName" /><br/>
            Last Name: <input type="text" name="lastName" /><br/>
            UserName: <input type="text" name="userName" /><br/>
            Password: <input type="text" name="password" /><br/>
            <input type="submit" value="Register" />
        </from>
    </body>
</html>