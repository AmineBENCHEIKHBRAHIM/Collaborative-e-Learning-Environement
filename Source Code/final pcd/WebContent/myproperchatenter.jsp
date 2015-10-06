<%@ page isErrorPage="true" language="java"
    contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<html>
    <head>
        <meta http-equiv="Content-Type" 
            content="text/html; charset=UTF-8"/>
        <title>Login page</title>
    </head>
    <body>
        <form action="LoginChat" method="post">
            <span>Type a name then press login to enter chat room</span>
            <input id="chatlogin" type="text" value="Your Login" name="chatlogin" />
            <input type="submit" value="login"/>
        </form>
    </body>
</html>