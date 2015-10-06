<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="Domain.*"%>   
 <%@page import="DAO.ForumBeanManager"%> 
 <%@page import="java.util.*"%>
 <%@page import="java.io.IOException"%>
 <%@page import="java.sql.Connection"%>
 <%@page import="java.sql.ResultSet"%>
 <%@page import="java.sql.Statement"%>
 <%@page import="classes.DatabaseConnection"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Telephasic</title>
<meta charset="utf-8">
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,600" rel="stylesheet" type="text/css">
<!--[if lte IE 8]>
<script src="js/html5shiv.js">
<![endif]-->
<script src="js/jquery.min.js"></script>
<script src="js/jquery.dropotron.js"></script>
<script src="js/skel.min.js"></script>
<script src="js/skel-panels.min.js"></script>
<script src="js/init.js"></script>

<link rel="stylesheet" href="css/skel-noscript.css" type="text/css"/>
<link rel="stylesheet" href="css/style1.css" type="text/css"/>
<link rel="stylesheet" href="css/style-n1.css" type="text/css"/>

</head>
<body class="homepage">
<div id="header-wrapper">
  <div id="header" class="container">
    <h1 id="logo"><a href="profile.jsp">PROFILE</a></h1>
    <nav id="nav">
      <ul>
        <li> <a href="">Dropdown</a>
          <ul>
            <li><a href="#">choix 1</a></li>
            <li><a href="#">choix 2</a></li>
            <li><a href="#">choix 3</a></li>
            <li> <span>choix 4</span>
              <ul>
                <li><a href="#">Lorem ipsum dolor</a></li>
                <li><a href="#">Phasellus consequat</a></li>
                <li><a href="#">Magna phasellus</a></li>
                <li><a href="#">Etiam dolore nisl</a></li>
              </ul>
            </li>
            <li><a href="#">choix 5</a></li>
          </ul>
        </li>
        <li><a href="forum_accueil.jsp">Forum</a></li>
        <li class="break"><a href="upload.jsp">GL DRIVE</a></li>
        <li><a href="chat.jsp">LIVE CHAT</a></li>
      </ul>
    </nav>
  </div>
  <section id="hero" class="container">
  
  
 
  
  
  
  
  
    <header>
      <h2>Veuillez s�lectionner les membres que vous voulez ajouter <br>
        � votre groupe de travail</h2>
    </header>
  <form method="POST" action="AddMembers">  
  
  
  
  
  
  <%
Object obj = session.getAttribute("session");
// attribut session ok, test si utilisateur courant la poss�de
if(obj != null)
{
	
		ForumBeanManager fbm = new ForumBeanManager();
		List<Utilisateur> lu = fbm.listeruser();
		Boolean membre = false;
		//response.sendRedirect("index2.jsp");
		for(Utilisateur t : lu){
			int n = t.getIdUtilisateur();
			membre=false;
			Connection conn;
			Statement stmt;
			ResultSet res;

			String query;
			
			DatabaseConnection dbconn;
			
			try
			{
				
				query = "select * from intgroupemembre where groupe_no="+session.getAttribute("idgroupe");
				dbconn = new DatabaseConnection();
				conn = dbconn.setConnection();
				res = dbconn.getResult(query, conn);
				request.setAttribute("idgrp", session.getAttribute("idgroupe"));
				System.out.print(session.getAttribute("idgroupe"));
				//response.sendRedirect("index2.jsp");
				while(res.next()){
					int id = res.getInt(2);
					System.out.println(id);
					if(id==n) 
						{membre = true;
						}
					
						}
				if(membre==false){
					String nom = t.getPseudo();
					int s = t.getIdUtilisateur();
					%><input type="checkbox" name="interests" value="<%=s%>"><%=nom %><br><%
				}
				}
				    
					//RequestDispatcher rd = request.getRequestDispatcher("/download.jsp");
					//rd.forward(request, response);
				
				   // response.sendRedirect("index2.jsp");
			
			catch(Exception e){}
			
			
			
			
}
			
			
			
		
		
}
%>
  
  
  
  
  
  
  
  <input type="hidden" id="idgrp" name="idgrp" value="<%=session.getAttribute("idgroupe") %>">
 <p><input type="submit" value="Ajouter Membres"></p>
  </form>
    <ul class="actions">
      <li><a href="groupe.jsp" class="button">Retour</a></li>
    </ul>
  </section>
</div>


  
</div>
</body>
</html>