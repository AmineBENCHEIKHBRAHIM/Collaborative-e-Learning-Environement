<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ include file="/taglibs.jsp"%>
<%@page import="DAO.*" %>
<%@page import="Domain.*" %>

<%
Object obj = session.getAttribute("session");
// attribut session ok, test si utilisateur courant la possède
if(obj != null)
{
	
		session.invalidate();
%>
		<jsp:forward page="./accueil.jsp" />
<%
	
%>
	
<%
}
// Pas d'attribut session, redirection vers la page de login
%>