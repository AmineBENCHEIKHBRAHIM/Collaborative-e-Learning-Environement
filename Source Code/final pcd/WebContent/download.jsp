<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="styles/global.css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.min.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.setup.js"></script>
<title>Insert title here</title>
</head>
<%@ page import="java.sql.ResultSet" %>

<body BACKGROUND="images/demo/body_bg444.jpg" style="background-attachment:fixed;";>

<!-- ####################################################################################################### -->
	
	<header>
		<div class="wrapper">
			<span id="usernav"><a href="index.html">Logout</a>  <a href="profile.html">Profil</a><a href="groupes.html">groupe</a></span>
		</div>
	</header>

      <div id="comments"> 
        <ul class="commentlist">
		  <h2>Files</h2>
	<% 
	ResultSet resultat = (java.sql.ResultSet)request.getAttribute("filelist");
	//response.sendRedirect("index2.jsp");
	while(resultat.next()){
		int id = resultat.getInt(1);
		String nom = resultat.getString(2);
		String path = resultat.getString(3);
		int row = resultat.getRow();
		//request.setAttribute("path", path);
		//request.setAttribute("nomfile", nom);
		
		%>
		
		 <li class="comment_odd">
            <div class="author"><img class="avatar" src="images/demo/avatar.gif" width="32" height="32" alt="" /><span class="name"><a href="#"><%=nom %></a></span> </div>
            <div class="submitdate"><a href="#">August 4, 2009 at 8:35 am</a></div>
            <p>This is an example of a file</p>
            <strong>
			<form action="DownloadFile" method="post">
					<input type="hidden" id="path" name="path" value="<%=path%>">
					<input type="hidden" id="filename" name="filename" value="<%=nom%>">
					<input type="submit" value="Download File !">
			</form>
			</strong>
          </li>
		<%}
	//response.sendRedirect("index2.jsp");
	%>
        </ul>
      </div>
</body>
</html>