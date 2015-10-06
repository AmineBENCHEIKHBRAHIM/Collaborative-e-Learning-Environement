<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/verification.jsp"%>
 <%@ include file="/taglibs.jsp"%>

<%@page import="DAO.ForumBeanManager"%>
<%@page import="java.util.*"%>
<%@page import="Domain.*"%>

<%
ForumBeanManager fbm = new ForumBeanManager();
Utilisateur uCourant = (Utilisateur)session.getAttribute("user");
if(fbm.isAdmin(uCourant) == true)
{
%>
<stripes:layout-render name="/style.jsp" title="CRUDE gestion membres">

<h3>Bienvenue sur le module de gestion des membres</h3>

<stripes:layout-component name="contents">


<div style="float:left:width:18%"></div>
 <div style="margin-left:20%;">
 <h3>Liste des utilisateurs</h3>
<TABLE class="tab" >
<tr class="tab_titre">
<td align="center">id</td>
<td align="center">role</td>
<td align="center">pseudo</td>
<td align="center">mail</td>
<td align="center">modifier</td>
<td align="center">supprimer</td>
</tr>
<%
 // On récupère l'ensemble des topics
List<Utilisateur> users =  fbm.listeruser();
 

for(Utilisateur u :users){
%>
<stripes:form beanclass="Controllers.RedirectActionBean" focus="">
<stripes:hidden name="iduser" id="q1" value="<%=u.getIdUtilisateur()%>" />


<tr>
<td><%=u.getIdUtilisateur() %></td>
<td><%=u.getDroit().getDroit() %></td>
<td><%=u.getPseudo()%></td>
<td><%=u.getMail() %></td>
<td><stripes:submit name="modif" value="modif" /></td>
<%	int i=uCourant.getIdUtilisateur();
	int j=u.getIdUtilisateur();
	if ((i)==(j)){ %>
<td><i>impossible</i> </td>
<%}else{ %>
<td><stripes:submit name="suppr" value="suppr" /></td>
<%} %>
</tr>


</stripes:form>

<%} %>
</TABLE>
</div>

	</stripes:layout-component>
	</stripes:layout-render>
<%
}
else
{
%>
<jsp:forward page="/login.jsp" />
<%
}
%>
