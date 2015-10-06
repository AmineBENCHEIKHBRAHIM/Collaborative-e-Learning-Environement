<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="DAO.ForumBeanManager"%>
<%@page import="java.util.*"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Domain.*"%>
<%@ include file="/verification.jsp"%>
 <%@ include file="/taglibs.jsp"%>
 <script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>

<!DOCTYPE>
<html>
<head>
<title>Questions</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="styles/layout.css" type="text/css" />
<link rel='stylesheet' type='text/css' href='css/style.css'>
<link rel="stylesheet" type="text/css" href="styles/global.css" />
<script type="text/javascript" src="scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.min.js"></script>
<script type="text/javascript" src="scripts/jquery.cycle.setup.js"></script>

</head>
<body BACKGROUND="images/demo/body_bg444.jpg" style="background-attachment:fixed;">




<%

String idParent = request.getParameter("idParent");
if(idParent == null)
{
%>
<!-- ####################################################################################################### -->

	
		<header>
		<div class="wrapper">
			<span id="usernav"><a href="logout.jsp">Logout</a>  <a href="profile.jsp">Profil</a><a href="groupe.jsp">groupe</a></span>
		</div>
	</header>
	


<%
	String top = request.getParameter("topic");
	if(top != null)
	{
		Topic topic = null;
		ForumBeanManager fbm = new ForumBeanManager();
		int idTopic = Integer.parseInt(top);
		 topic = fbm.getTopic(top);
	
		if(topic != null)
		{
			// Possibilité d'ajout de nouveau message : Formulaire
		%>
		<br>
		<!--<div>
				<h4><a href="#" onclick="messages('ajouterMessage','<%= idTopic  %>')">Ajouter un sujet</a></h4>
				<div id="divNouvMess"></div>
		</div>-->
		
		<br><br>
		 <div id="comments">
	  <br>
	  <h2>Liste de questions</h2>
		 <ul class="commentlist">
		
		<%
			
			Set<Message> messages = topic.getMessages();
			if(messages != null && messages.size() != 0)
			{
				List<Message> Parents  = new ArrayList<Message>();
				Parents = fbm.recupererParents(messages);
				if(Parents != null)
				{
					for(Message parent : Parents)
					{
						MessageId mid = parent.getId();
						
						Date dateEdition = parent.getDate();
						String dateEditionFormatee = "";
						if(dateEdition != null)
						{
							SimpleDateFormat formatDateJour = new SimpleDateFormat("dd/MM/yyyy , kk:mm:ss");
							dateEditionFormatee = formatDateJour.format(dateEdition);
						}
						
						
						Utilisateur uMessage = null; Utilisateur uCourant = null;
					    uMessage = parent.getUtilisateur();
						uCourant = (Utilisateur)session.getAttribute("user");
						
%>
						<li class="comment_odd" id="ligneTopic<%= mid.getIdMessage() %>">
								<div class="author"><img class="avatar" src="images/demo/avatar.gif" width="32" height="32" alt="" /><span class="name">Par <a href="mailto:<%= uMessage.getMail() %>" ><%= uMessage.getPseudo() %> : <a href="#" onclick="messages('afficherReponses',<%= mid.getIdMessage() %>)" ><%= parent.getTitre() %> - paru le <%= dateEditionFormatee %></a></a></span> </div>
								<div class="submitdate"><a href="#">paru le <%= dateEditionFormatee %></a></div>
									<p><%= parent.getMessage() %></p>











						<%= fbm.getNbReponsesMessage(mid.getIdMessage()) %> Réponses !
<%
						
							System.out.println("\n\n Uti. Message : "+uMessage.getIdUtilisateur()+"\n\n\n Uti. Courant : "+uCourant.getIdUtilisateur());
							if( ( (int)uMessage.getIdUtilisateur() == (int)uCourant.getIdUtilisateur() ) || (fbm.isAdmin(uCourant) == true) )
							{
%>
								<a href="#"  onclick="messages('supprimerMessage',<%= mid.getIdMessage() %>)">Supprimer</a>
<%
							}
							else
							{
%>
								<a href="#"  onclick="messages('repondreMessage',<%= mid.getIdMessage() %>)">Répondre</a>
<%					
							}
%>						
							<br/>
							<img src="" alt=" ------- " />
							<div class="listemessFils"  id="ListRepMP<%=mid.getIdMessage()  %>" ></div>
							<div id="RepdivMP<%=mid.getIdMessage()  %>" ></div>
							</li>
					
						
<%
					}
				}
			}
			else
			{
%>
				<h3>Aucun message pour le moment !</h3>
<%
			}
		}
		else
		{
%>
			<h3>Impossible d'afficher le topic <%= topic %>!</h3>
			
		
		
		
<%
		}
		%>
		</ul>
		</div>
		<div id="respond">
		<div>
				<h4><a href="#" onclick="messages('ajouterMessage','<%= idTopic  %>')">Ajouter un sujet</a></h4>
				<div id="divNouvMess"></div>
		</div>
		<%
		
	}
%>
	
	
	
	
	
	
	
	
	
	
	
<%
}
// Affichage des réponses
else
{
	String operation = request.getParameter("operation");
	System.out.println("\n\n\n"+operation);
	if(operation != null)
	{
		if(operation.compareTo("afficherReponses") == 0)
		{
			ForumBeanManager fbm = new ForumBeanManager();
			List<Message> reponses = null;
			try
			{
				int idPar = Integer.parseInt(idParent);
			    reponses = fbm.getReponses(idPar);
			}
			catch(NumberFormatException nbfe)
			{
				nbfe.printStackTrace();
			}
			
			if(reponses != null && reponses.size() > 0)
			{
				for(Message m : reponses)
				{
					
					Date dateEdition = m.getDate();
					String dateEditionFormatee = "";
					if(dateEdition != null)
					{
						SimpleDateFormat formatDateJour = new SimpleDateFormat("dd/MM/yyyy , kk:mm:ss");
						dateEditionFormatee = formatDateJour.format(dateEdition);
					}
					
					Utilisateur uMessage = m.getUtilisateur();
					Utilisateur uCourant = (Utilisateur)session.getAttribute("user");
					System.out.println("\n\n Uti. Message : "+uMessage.getIdUtilisateur()+"\n\n\n Uti. Courant : "+uCourant.getIdUtilisateur());
		%>
					<div   id="divMF<%= m.getId().getIdMessage()  %>">
					<div class="paragraphe_fils">
					<div class="paragraphe_fils_titre">Par <a href="mailto:<%= uMessage.getMail() %>" ><%= uMessage.getPseudo() %> : <%= m.getTitre() %> - paru le <%= dateEditionFormatee %></div>
					<div class="paragraphe_fils_main"><%= m.getMessage() %></div>
		<%
						
							if( ((int)uMessage.getIdUtilisateur() == (int)uCourant.getIdUtilisateur() ) || (fbm.isAdmin(uCourant) == true))
							{
								
								if((int)uMessage.getIdUtilisateur() == (int)uCourant.getIdUtilisateur() )
								{
		%>
									<a href="#"  onclick="messages('modifierReponseMessage',<%= m.getId().getIdMessage() %>)">Modifier</a>
									<%
								}
									%>
								<a href="#"  onclick="messages('supprimerReponseMessage',<%= m.getId().getIdMessage() %>)">Supprimer</a>
		<%
							}
							else
							{
		%>
								<a href="#"  onclick="messages('repondreMessage',<%= idParent %>)">Répondre</a>
		<%					
							}
		%>		
					</div>
					</div>
		<%
				}
			}
			else
			{
		%>
				Aucune réponse pour le moment !
		<%
			}
		}
		else	if(operation.compareTo("repondreMessage") == 0 || operation.compareTo("modifierReponseMessage") == 0 || operation.compareTo("ajouterMessage")==0 )
		{
			Message messAModifier = null;
			if(operation.compareTo("modifierReponseMessage") == 0)
			{
				ForumBeanManager fbm = new ForumBeanManager();
				messAModifier = fbm.getMessage(idParent);
			}
			
%>
			<stripes:form beanclass="Controllers.GestionforumActionBean" focus=""  >
				<stripes:hidden name="parent_message" value="<%= idParent %>" />
				<table>
					<tr>
						<td>Titre</td>
						<td>
						<% String titre_mes = "";  if( messAModifier != null) { titre_mes = messAModifier.getTitre() ;} %>
							<stripes:text name="titre_message" value="<%=  titre_mes %>" size="22" /><stripes:errors field="titre_message"/>
						</td>
					</tr>
					<tr>
						<td>Message</td>
						<td>
							<% String cont_mess = "";  if( messAModifier != null) { cont_mess = messAModifier.getMessage() ;} %>
							<stripes:textarea name="corps_message" value="<%=  cont_mess %>" cols="100%" rows="10"/><stripes:errors field="corps_message"/>
						</td>	
					</tr>
					<tr>
						<td colspan="2">
<%
						if(operation.compareTo("repondreMessage") == 0)
						{
%>
							<stripes:submit name="ajouterReponse" value="Ajouter" />
<%
						}
						// Ici idParent == Message Courant !!! Ne pas se fier au nom de la var
						else if(operation.compareTo("modifierMessage") == 0 || operation.compareTo("modifierReponseMessage") == 0)
						{
%>	
							<stripes:hidden name="idMessageCourant" value="<%= idParent %>" />
							<stripes:submit name="modifierMessage" value="Modifier" />
<%
						}
						else if(operation.compareTo("ajouterMessage") == 0)
						{
%>
							<stripes:hidden name="idTopicCourant" value="<%= idParent %>" />
							<stripes:submit name="ajouterMessage" value="Ajouter" />
<%						
						}
%>		
						</td>
					</tr>
				</table>
			</stripes:form>	
<%		
		}
		else	if(operation.compareTo("supprimerMessage") == 0 || operation.compareTo("supprimerReponseMessage") == 0 )
		{
			ForumBeanManager fbm = new ForumBeanManager();
			fbm.supprimerMessage(Integer.parseInt(idParent));
			
		}
	}
}

%>





</div>
<br>
  <br>
	  </body>
	  </html>