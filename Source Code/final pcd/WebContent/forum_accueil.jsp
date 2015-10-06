<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="DAO.ForumBeanManager"%>
<%@page import="java.util.*"%>
<%@page import="Domain.*"%>
 <%@ include file="/taglibs.jsp"%>
<%@ include file="/verification.jsp"%>
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>


<!DOCTYPE>
<html>
<head>
<title>forum</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="styles/global.css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.min.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.setup.js"></script>

</head>

<body BACKGROUND="images/demo/body_bg444.jpg" style="background-attachment:fixed;">
<%
String operation = request.getParameter("operation");
ForumBeanManager fbm = new ForumBeanManager();
Utilisateur u = (Utilisateur)session.getAttribute("user");

if(operation == null)
{
%>
	

<!-- ####################################################################################################### -->
	
	<header>
		<div class="wrapper">
			<span id="usernav"><a href="logout.jsp">Logout</a>  <a href="profile.jsp">Profil</a><a href="groupe.jsp">groupe</a></span>
		 </div>
	</header>
		
	<div>
	
<h4>Bienvenue sur le forum <%=u.getPseudo()%></h4>
<%
	if (fbm.isAdmin(u) == true){
	%>
	
	<h4>Votre menu Administrateur :</h4>
	
	<a href="admin.jsp"><h4>Gérer les membres</h4></a>
	<br/>
	<%} %>
	<c:choose>
				<c:when test="${Controllers != null}">
					<c:set var="Utilisateur" value="${Controllers.uCourant}" scope="page"/>
				 	<c:choose>	
		     			 <c:when test="${empty Controllers.uCourant}" >
		     		    	<h3>Le titre ne peut rester vide !</h3>
		     			 </c:when>
		     		</c:choose>
	     		 </c:when>
	</c:choose>
	
	<!--  Div d'ajout de topic  -->
	<!-- <div id="divAjoutTopic"></div>-->
</div>	
	<br><br>
      <div id="comments">
	 
      
       <!--  Affichage des topics dispo -->
<%
	 // On récupère l'ensemble des topics
	List<Topic> topics =  fbm.listerTopics();
	
	 if(topics.size() == 0)
	 {
	%>
			<h3>Aucun topic existant !</h3>
	<%
	 }
	 else
	 {
	 %>
	<div>
	 
	 
	 		<%
			if(fbm.isAdmin(u) == true)
			{
	%>
	 		<!-- supprimer -->
	 		
	 		<%
			}
	 		%>
	 <h2>Sujets</h2>
	 <ul class="commentlist">
		 
		   <%
		 for(Topic t : topics)
		 {
			%>
          <li class="comment_odd" id="ligneTopic<%= t.getIdTopic()  %>">
            <div class="author"><img class="avatar" src="images/demo/avatar.gif" width="32" height="32" alt="" /><span class="name"><a href="./topic.jsp?topic=<%=t.getIdTopic()%>"><%= t.getNom() %></a></span> </div>
            <div class="submitdate"><a href="#">August 4, 2009 at 8:35 am</a></div>
            <p><%= fbm.getNbMessages(t.getIdTopic()) %> questions , 
				<%= fbm.getNbReponses(t.getIdTopic()) %> réponses.</p>
			<p><%=t.getDescription() %></p>
			<%
			if(fbm.isAdmin(u) == true)
			{
	%>
				<a href="#" onclick="topics('supprimerTopic',<%= t.getIdTopic() %>)">Supprimer</a>
	<%
			}
	%>	
          </li>
     
		
	<%
		 }
	 %>
</ul>
	</div>
	 <%
	 }
%>
    
     
   
     </div>

<div id="respond">
<% if(fbm.isAdmin(u) == true)
{
%>
		<stripes:form beanclass="Controllers.GestiontopicActionBean" focus=""  >
		 <h2>Proposez un sujet</h2>
          <p>
          <stripes:text name="titre_topic" value="" size="22" /><stripes:errors field="titre_topic"/>
            <label for="name"><small>Nom</small></label>
          </p>
          
          <p>
          
           <stripes:text name="description" value="" size="22" /><stripes:errors field="description"/>
            <label for="description"><small>description</small></label>
          </p>
          
          
         <!--  <stripes:textarea name="description" value="" cols="100%" rows="10" /><stripes:errors field="description"/>
            <label for="name" style="display:none;"><small>Sujet</small></label>
          </p> -->
          <p>
           <stripes:submit name="ajouterTopic" value="Ajouter" />
            &nbsp;
            <input name="reset" type="reset" id="reset" tabindex="5" value="Reset Sujet" />
          </p>
		  
        </stripes:form>
        <%
}
     %>
<%
}
else
{
	
%>
	
		
<%	
	
	if(operation.compareTo("supprimerTopic") == 0)
	{
		String idTopic = request.getParameter("idTopic");
		System.out.println("\n\nTEST\n\n");
		if(idTopic != null)
		{
			int idTo = 0;
			try
			{
				idTo =Integer.parseInt(idTopic);
			}
			catch(NumberFormatException nfe)
			{
				// + affichage erreurs etc.
				nfe.printStackTrace();
			}
			
			if(idTo != 0)
			{
				fbm.supprimerTopic(idTo);
%>
<%
			}
		}

	}
	 
}
%>

  </div>
  <br>
  <br>
	  </body>
	  </html>