<%@ page isErrorPage="true" language="java"
    contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored ="false" %>
<!-- Redirect to index.jsp if no UID -->

<html>
    <head>
        <meta http-equiv="Content-Type" 
            content="text/html; charset=UTF-8"/>
        <title>Login page</title>
        <link href="styles/chat.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="scripts/chat.js"></script>
    </head>
    <body>
    		 <div>This is chat page</div>
            <div>Type message then press ENTER key to send message</div>
            <div>Click logout to return the login page</div>
            <div>Your name: <%=request.getAttribute("chatlogin") %></div>
            <div id="content" class="content"></div>
            <div>
            <form action="ChatController" method="post">
                <!-- listen to keyup to send message if enter pressed -->
                <textarea class="msg-input" id="msg" name = "msg">input text here</textarea>
				<input type="submit" value="Send">           
           </form>
            </div>
        <form action="LogoutChat" method="post">
           
            <input type="submit" value="logoutchat" />
        </form>
    </body>
</html>