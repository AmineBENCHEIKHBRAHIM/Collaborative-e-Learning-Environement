<%@page import="DAO.ForumBeanManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet" %>
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
    </header>
    <h2>Probl�mes pos�s</h2>
    <br><br>
    <% 
	ResultSet resultat = (java.sql.ResultSet)request.getAttribute("problist");
    int i = 0;
	//response.sendRedirect("index2.jsp");
	while(resultat.next()){
		i++;
		int idprob = resultat.getInt(1);
		int idposeur = resultat.getInt(2);
		ForumBeanManager fbm = new ForumBeanManager();
		String poseur = (String) fbm.getuseerbyid(idposeur).getPseudo();
		String objectif = resultat.getString(4);
		String tache = resultat.getString(5);
		String artefact = resultat.getString(6);
		String contrainte = resultat.getString(7);
		int note = resultat.getInt(8);
		int row = resultat.getRow();
		//request.setAttribute("path", path);
		//request.setAttribute("nomfile", nom);
		
		%>
        <div style="background: none repeat scroll 0% 0% rgba(255, 255, 255, 0.15);border-style: none solid solid;border-width: 0px 1px 1px;border: 1px solid #C2C7CC;
border-color: -moz-use-text-color rgba(255, 255, 255, 0.5) rgba(255, 255, 255, 0.5);color: #FFF;display: inline-block;transition: color 0.25s ease-in-out 0s, border-color 0.25s ease-in-out 0s, background-color 0.25s ease-in-out 0s;
text-decoration: none;
border-radius: 0.35em;
padding: 0.8em 2em;box-sizing: border-box;">
       <a href="repgroupeindiv.jsp?idprob=<%=idprob%>&poseur=<%=poseur%>&o=<%=objectif%>&t=<%=tache%>&a=<%=artefact%>&c=<%=contrainte%>&user=<%=session.getAttribute("iduser")%>&n=<%=note%>&i=<%=i%>">Probl�me <%= i %> :</a> By <%=poseur %> <br>
       <Strong>Domaine :</Strong> G�nie Logiciel <br>
       <strong>Contexte :</strong> Apprentissage Individuel <br>
       <strong>Objectif :</strong> <%= objectif %><br>
       <strong>Tache :</strong> <%= tache %><br>
       <strong>Artefact :</strong> <%= artefact %> <br>
       <strong>Contrainte :</strong> <%= contrainte %><br>
<br>
<%if (note==1)
{		
%>
<img src="images/demo/tick1ff.png" alt="" />
<%}%>

</div>
<br><hr>
        <%} %>
    
    
    
     <form method="post" action="AjoutProbIndiv" name="productForm" style="background: none repeat scroll 0% 0% rgba(255, 255, 255, 0.15);border-style: none solid solid;border-width: 0px 1px 1px;border: 1px solid #C2C7CC;
border-color: -moz-use-text-color rgba(255, 255, 255, 0.5) rgba(255, 255, 255, 0.5);color: #FFF;display: inline-block;transition: color 0.25s ease-in-out 0s, border-color 0.25s ease-in-out 0s, background-color 0.25s ease-in-out 0s;
text-decoration: none;
border-radius: 0.35em;
padding: 0.8em 2em;box-sizing: border-box;">
    <select name="objectif">
        <option value="dropdown">Veuillez selectionner un objectif
        <option value="Analyse">Analyse
        <option value="Conception">Conception
        <option value="Realisation">R�alisation
        <option value="Tests">Tests
    </select>
    <select name="tache">
        <option value="dropdown">Veuillez selectionner une t�che
        <option value="Tache Analyse - Fondamentale">T�che d'Analyse - Fondamentale
        <option value="Tache Analyse - Expression des besoins">T�che d'Analyse - Expression des besoins
        <option value="Tache Analyse - Specification">T�che d'Analyse - Sp�cification
        <option value="Tache de Conception - Fondamentale">T�che de Conception - Fondamentale
        <option value="Tache de Conception - Conception Architecturale">T�che de Conception - Conception Architecturale
        <option value="Tache de Conception - Conception detaillee">T�che de Conception - Conception d�taill�e
        <option value="Tache de R�alisation - Fondamentale">T�che de R�alisation - Fondamentale
        <option value="Tache de R�alisation - Choix du langage">T�che de R�alisation - Choix du langage
        <option value="Tache de Tests - Fondamentale">T�che de Tests - Fondamentale
        <option value="Tache de Tests - Technique du test">T�che de Tests - Technique du test
    </select>
    <select name="artefact">
        <option value="dropdown">Veuillez selectionner un artefact
        <option value="Definition">Definition
        <option value="Technique">Technique
    </select>
    <select name="contrainte">
        <option value="dropdown">Veuillez selectionner une contrainte
        <option value="Reference">R�f�rence
        <option value="Moyen">Moyen
    </select>
    <br>
    <input type="hidden" name="dropdown" id="dropdown">
    <input type="hidden" name="idgrp" id="idgrp" value="<%=request.getAttribute("idgrp")%>">
    <input type="hidden" name="co" id="co" value="<%=request.getAttribute("co")%>">
    <input type="hidden" name="iduser" id="iduser" value="<%=session.getAttribute("iduser")%>">
    <input type="submit" value="Poser probl�me" name="dropdown" id="dropdown" class ="button">
    </form>
    
  </section>
</div>


  
</div>
</body>
</html>