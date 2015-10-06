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
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<title>Profil</title>
	<link rel="stylesheet" type="text/css" href="styles/global.css" />
</head>

<body>	
	<header>
		<div class="wrapper">
			
			<span id="usernav"><a href="logout.jsp">Logout</a> - <a href="#">My Profile<span><img src="images/demo/user_avatar_s.jpg" /></span></a></span>
		</div>
	</header>
	
	<nav>
		<ul id="n" class="clearfix">
			
			<li class="sel"><a href="#">Profile</a></li>
			<%
Object obj = session.getAttribute("session");
// attribut session ok, test si utilisateur courant la poss�de
if(obj != null)
{
	
		ForumBeanManager fbm = new ForumBeanManager();
		Utilisateur u = (Utilisateur) fbm.getUtilisateur(obj.toString());
		int n = u.getIdUtilisateur();
		session.setAttribute("iduser", n);
		Boolean hasgroupe = false;
		System.out.print(n);
		
		Connection conn;
		Statement stmt;
		ResultSet res;

		String query;
		
		DatabaseConnection dbconn;
		
		try
		{
			
			query = "select * from groupe";
			dbconn = new DatabaseConnection();
			conn = dbconn.setConnection();
			res = dbconn.getResult(query, conn);
			
			//response.sendRedirect("index2.jsp");
			while(res.next()){
				int id = res.getInt(2);
				if(id==n) 
					{hasgroupe = true ;
					String grp = res.getString(3);
					String desc = res.getString(4);
					int idgrp = res.getInt(1);
					session.setAttribute("grp", grp);
					session.setAttribute("desc", desc);
					session.setAttribute("idgroupe",idgrp);
					session.setAttribute("iduser", n);
					}
				
			}
			    
				//RequestDispatcher rd = request.getRequestDispatcher("/download.jsp");
				//rd.forward(request, response);
			
			   // response.sendRedirect("index2.jsp");
		}
		catch(Exception e){}
		if(hasgroupe==false)
		{%>
		<li class="sel"><a href="creergroupe.jsp">Nouveau Groupe</a></li>
		<%
		}
		else
		{
			%>
			<li class="sel"><a href="http://localhost:8080/final_pcd/groupe.jsp?name=<%=session.getAttribute("grp")%>&desc=<%=session.getAttribute("desc")%>&idgrp=<%=session.getAttribute("idgroupe")%>&co=<%=session.getAttribute("iduser")%>">Votre Groupe</a></li>
			<%
		}
}
%>
			
			<li class="sel"><a href="forum_accueil.jsp">Forum</a></li>
			<li class="sel"><a href="upload.jsp">GL Drive</a></li>
			<li class="sel"><a href="jsp/ChatWindow.jsp">Chat</a></li>
			
		</ul>
	</nav>
	
	
	<div id="content" class="clearfix">
		<%if(Integer.parseInt(session.getAttribute("iduser").toString())==18){ %><section id="left">
			<div id="userStats" class="clearfix">
				<div class="pic">
					><a href="#"><img src="images/demo/tof1.png" width="130" height="150" /></a>
				</div>
				
				<div class="data">
					<h1>Amine Ben Cheikh Brahim</h1>
					<h3>Ariana, Tunisie</h3>
				
					
					
			</div>
			
			<h1>About Me:</h1>
			<p>Amine est un �l�ve en 2�me ann�e � l'Ecole Nationale des Sciences de l'informatique ( ENSI ) Sp�cialit� ing�nieurie logiciel et syst�mes d'information.Il a pass� deux ans de pr�paratoire � l'IPEIT o� il a r�ussi a obtenir son diplome et Math�matiques et Sciences Physique fondamentaux.</p>
		</section><%}
		else {%>
		
		<section id="left">
			<div id="userStats" class="clearfix">
				<div class="pic">
					><a href="#"><img src="images/demo/user_avatar1.jpg" width="130" height="150" /></a>
				</div>
				
				<div class="data">
					<h1>Amine Ben Cheikh</h1>
					<h3>x , Tunisie</h3>
				
					
					
			</div>
			
			<h1>About Me:</h1>
			<p>Nothing to display.</p>
		</section>
		
		<%} %>
		
		<section id="right">
			
			
			<div class="gcontent">
				<div class="head"><h1>Groups List</h1></div>
				<div class="boxy">
					<p>Your groups</p>
					
					<div class="friendslist clearfix">
					
					
					<%
		
		Connection conn;
		Statement stmt;
		ResultSet res,res2;

		String query;
		
		DatabaseConnection dbconn;
	
		try
		{
			
			query = "select Distinct groupe_no from intgroupemembre where membre_no="+session.getAttribute("iduser");
			dbconn = new DatabaseConnection();
			conn = dbconn.setConnection();
			res = dbconn.getResult(query, conn);
			
			//response.sendRedirect("index2.jsp");
			while(res.next()){
				int id = res.getInt(1);
				System.out.print(id);
				query="select * from groupe where id="+id;
				dbconn = new DatabaseConnection();
				conn = dbconn.setConnection();
				res2 = dbconn.getResult(query, conn);
				while(res2.next()){
					int idgroupe = res2.getInt(1);
					int coor = res2.getInt(2);
					String groupename = res2.getString(3);
					String descr = res2.getString(4);
					System.out.print(groupename);
					%>
					<div class="friend">
					<a href="http://localhost:8080/final_pcd/groupe.jsp?name=<%=groupename%>&desc=<%=descr%>&idgrp=<%=idgroupe%>&co=<%=coor%>"><img src="images/demo/friend_avatar_default.jpg" width="30" height="30" alt="Jerry K." /></a><span class="friendly"><a href="http://localhost:8080/final_pcd/groupe.jsp?name=<%=groupename%>&desc=<%=descr%>&idgrp=<%=idgroupe%>&co=<%=coor%>"><%=groupename %></a></span>
					</div><%
				}
			}
			    
				//RequestDispatcher rd = request.getRequestDispatcher("/download.jsp");
				//rd.forward(request, response);
			
			   // response.sendRedirect("index2.jsp");
		}
		catch(Exception e){}
		
%>
					
					
					
					
					
					
					
						
					</div>
					
					<span><a href="#">See all...</a></span>
				</div>
			</div>
		</section>
	</div>
</body>
</html>