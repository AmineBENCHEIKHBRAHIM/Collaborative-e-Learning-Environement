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
<body BACKGROUND="images/demo/body_bg444.jpg" style="background-attachment:fixed;background-size: 1800px 1800px ";>

<!-- ####################################################################################################### -->
	
	<header>
		<div class="wrapper">
			<span id="usernav"><a href="index.html">Logout</a>  <a href="profile.jsp">Profil</a><a href="groupe.jsp">groupe</a></span>
		</div>
	</header>
<form action="UploadFile" method="post" enctype="multipart/form-data">
	select file : <input type="file" name="filetoupload">
	<input type="submit" value="Upload File !">
</form>
<br>
<br>
<br>
<br>
<br>
<form action="DisplayData" method="post">
	<input type="submit" value="Show me The Files !">
</form>
<br>
<br>

<br>
<p></p>
</body>
</html>