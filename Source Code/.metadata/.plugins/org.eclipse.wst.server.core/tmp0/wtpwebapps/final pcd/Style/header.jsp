<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="DAO.ForumBeanManager"%>
<%@page import="java.util.*"%>
<%@page import="Domain.*"%>
 <%@ include file="/taglibs.jsp"%> 

<div id="header">

<h2>Bienvenue </h2>
<p>hhh</p>
<a href="accueil.jsp">Accueil</a> | <a href="forum_accueil.jsp">Forum</a> | <%   if(session.getAttribute("user") != null) { %> <a href="discussion.jsp">Discussion</a> <% } %> |<a href="groupe.jsp">Groupe</a> |  <a href="Contact.jsp">Contact</a>
</div>