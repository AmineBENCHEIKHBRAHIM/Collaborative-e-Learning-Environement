/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2014-07-02 04:09:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.ForumBeanManager;
import Domain.*;
import DAO.ForumBeanManager;
import java.util.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import classes.DatabaseConnection;

public final class repgroupeindiv_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Telephasic</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,600\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--[if lte IE 8]>\r\n");
      out.write("<script src=\"js/html5shiv.js\">\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.dropotron.js\"></script>\r\n");
      out.write("<script src=\"js/skel.min.js\"></script>\r\n");
      out.write("<script src=\"js/skel-panels.min.js\"></script>\r\n");
      out.write("<script src=\"js/init.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style-n1.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/stylerate.css\"  type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"homepage\">\r\n");
      out.write("<div id=\"header-wrapper\">\r\n");
      out.write("  <div id=\"header\" class=\"container\">\r\n");
      out.write("   <h1 id=\"logo\"><a href=\"profile.jsp\">PROFILE</a></h1>\r\n");
      out.write("    <nav id=\"nav\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li> <a href=\"\">Dropdown</a>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"#\">choix 1</a></li>\r\n");
      out.write("            <li><a href=\"#\">choix 2</a></li>\r\n");
      out.write("            <li><a href=\"#\">choix 3</a></li>\r\n");
      out.write("            <li> <span>choix 4</span>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"#\">Lorem ipsum dolor</a></li>\r\n");
      out.write("                <li><a href=\"#\">Phasellus consequat</a></li>\r\n");
      out.write("                <li><a href=\"#\">Magna phasellus</a></li>\r\n");
      out.write("                <li><a href=\"#\">Etiam dolore nisl</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"#\">choix 5</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"forum_accueil.jsp\">Forum</a></li>\r\n");
      out.write("        <li class=\"break\"><a href=\"upload.jsp\">GL DRIVE</a></li>\r\n");
      out.write("        <li><a href=\"chat.jsp\">LIVE CHAT</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("  <section id=\"hero\" class=\"container\">\r\n");
      out.write("    <header>\r\n");
      out.write("    </header>\r\n");
      out.write("    ");

    String n = request.getParameter("n");
    int nn=Integer.parseInt(n);
    System.out.print(n);
    
      out.write("\r\n");
      out.write("    <h2>Problème ");
      out.print(Integer.parseInt(request.getParameter("i")) );
      out.write(' ');
if (nn==1)
{		

      out.write("\r\n");
      out.write("<img src=\"images/demo/tick1ff.png\" alt=\"\" />\r\n");
}
      out.write("</h2>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    ");
 
    int idprob = Integer.parseInt(request.getParameter("idprob"));
    String objectif = request.getParameter("o");
    String tache = request.getParameter("t");
    String artefact = request.getParameter("a");
    String contrainte = request.getParameter("c");
    String poseur = request.getParameter("poseur");
    int j = Integer.parseInt(request.getParameter("i"));
    
      out.write("\r\n");
      out.write("    <div style=\"background: none repeat scroll 0% 0% rgba(255, 255, 255, 0.15);border-style: none solid solid;border-width: 0px 1px 1px;border: 1px solid #C2C7CC;\r\n");
      out.write("\t\t\t\t\tborder-color: -moz-use-text-color rgba(255, 255, 255, 0.5) rgba(255, 255, 255, 0.5);color: #FFF;display: inline-block;transition: color 0.25s ease-in-out 0s, border-color 0.25s ease-in-out 0s, background-color 0.25s ease-in-out 0s;\r\n");
      out.write("\t\t\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\t\t\tborder-radius: 0.35em;\r\n");
      out.write("\t\t\t\t\tpadding: 0.8em 2em;box-sizing: border-box;\">\r\n");
      out.write("\t\t\t\t\t       Problème ");
      out.print( idprob );
      out.write(" :</a> By ");
      out.print(poseur );
      out.write(" <br>\r\n");
      out.write("\t\t\t\t\t       <strong>Domaine :</strong> Génie logiciel<br>\r\n");
      out.write("\t\t\t\t\t       <strong>Contexte :</strong> Apprentissage individuel<br>\r\n");
      out.write("\t\t\t\t\t       <strong>Objectif :</strong> ");
      out.print( objectif );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t       <strong>Tache :</strong> ");
      out.print( tache );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t       <strong>Artefact :</strong> ");
      out.print( artefact );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t       <strong>Contrainte :</strong> ");
      out.print( contrainte );
      out.write(" <br>\r\n");
      out.write("\t\t\t\t\t      \r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");

    Connection conn;
	Statement stmt;
	ResultSet res;

	String query;
	
	DatabaseConnection dbconn;
	
	try
	{
		
		query = "select * from repprobindiv where idprob="+idprob;
		dbconn = new DatabaseConnection();
		conn = dbconn.setConnection();
		res = dbconn.getResult(query, conn);
		int i=0;
		//response.sendRedirect("index2.jsp");
		while(res.next()){
			i++;
			int idrep = res.getInt(1);
			String ii = Integer.toString(i);
			int idrepondeur = res.getInt(3);
			ForumBeanManager fbm = new ForumBeanManager();
			String repondeur = fbm.getuseerbyid(idrepondeur).getPseudo();
			String argument = res.getString(4);
			String suggestion = res.getString(5);
			String moyen = res.getString(6);
			String directive = res.getString(7);
			int note = res.getInt(8);
			
			
      out.write("<div style=\"background: none repeat scroll 0% 0% rgba(255, 255, 255, 0.15);border-style: none solid solid;border-width: 0px 1px 1px;border: 1px solid #C2C7CC;\r\n");
      out.write("\t\t\t\t\tborder-color: -moz-use-text-color rgba(255, 255, 255, 0.5) rgba(255, 255, 255, 0.5);color: #FFF;display: inline-block;transition: color 0.25s ease-in-out 0s, border-color 0.25s ease-in-out 0s, background-color 0.25s ease-in-out 0s;\r\n");
      out.write("\t\t\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t\t\t\tborder-radius: 0.35em;\r\n");
      out.write("\t\t\t\t\tpadding: 0.8em 2em;box-sizing: border-box;\">\r\n");
      out.write("\t\t\t\t\t       Reponse ");
      out.print( i );
      out.write(" :</a> By ");
      out.print(repondeur );
      out.write(" <br>\r\n");
      out.write("\t\t\t\t\t       <strong>Argument :</strong> ");
      out.print( argument );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t       <strong>Suggestion :</strong> ");
      out.print( suggestion );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t       <strong>Moyen :</strong> ");
      out.print( moyen );
      out.write(" <br>\r\n");
      out.write("\t\t\t\t\t       <strong>Directive :</strong> ");
      out.print( directive );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
if (note==1)
{		

      out.write("\r\n");
      out.write("<img src=\"images/demo/tick1ff.png\" alt=\"\" />\r\n");
}
else {
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"SolveProbIndiv\">\r\n");
      out.write("<input type=\"submit\" value=\"Accepter la réponse\" name=\"dropdown\" id=\"dropdown\" class =\"button\">\r\n");
      out.write("<input type=\"hidden\" name=\"idrep\" value=\"");
      out.print(idrep );
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"idprob\" value=\"");
      out.print(idprob );
      out.write("\">\r\n");
      out.write("</form>\r\n");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br><br>");

		
	}
	}
		    
			//RequestDispatcher rd = request.getRequestDispatcher("/download.jsp");
			//rd.forward(request, response);
		
		   // response.sendRedirect("index2.jsp");
	
	catch(Exception e){}
	
    
    
    
    
    
    
    
    
    
    
    
    
    
	
      out.write("\r\n");
      out.write("    \r\n");
      out.write("     <form method=\"post\" action=\"AjoutRepIndiv\" name=\"productForm\" style=\"background: none repeat scroll 0% 0% rgba(255, 255, 255, 0.15);border-style: none solid solid;border-width: 0px 1px 1px;border: 1px solid #C2C7CC;\r\n");
      out.write("border-color: -moz-use-text-color rgba(255, 255, 255, 0.5) rgba(255, 255, 255, 0.5);color: #FFF;display: inline-block;transition: color 0.25s ease-in-out 0s, border-color 0.25s ease-in-out 0s, background-color 0.25s ease-in-out 0s;\r\n");
      out.write("text-decoration: none;\r\n");
      out.write("border-radius: 0.35em;\r\n");
      out.write("padding: 0.8em 2em;box-sizing: border-box;\">\r\n");
      out.write("    <select name=\"suggestion\">\r\n");
      out.write("        <option value=\"dropdown\">Veuillez selectionner une suggestion\r\n");
      out.write("        <option value=\"Definition\">Définition\r\n");
      out.write("        <option value=\"Technique\">Technique\r\n");
      out.write("    </select>\r\n");
      out.write("   \r\n");
      out.write("    <select name=\"directive\">\r\n");
      out.write("        <option value=\"dropdown\">Veuillez selectionner une directive\r\n");
      out.write("        <option value=\"Definition\">Définition\r\n");
      out.write("        <option value=\"Language UML\">Language UML\r\n");
      out.write("        <option value=\"Communication directe\">Communication directe\r\n");
      out.write("        <option value=\"Developpement incremental\">Développement incrémental\r\n");
      out.write("        <option value=\"Etude du existant\">Etude de l'existant\r\n");
      out.write("        <option value=\"Approche fonctionnelle\">Approche fonctionnelle\r\n");
      out.write("        <option value=\"Approche orientee objets\">Approche orientée objets\r\n");
      out.write("        <option value=\"Style architectural\">Style architectural\r\n");
      out.write("        <option value=\"Architecture UML\">Architecture UML\r\n");
      out.write("        <option value=\"Vue Statique\">Vue Statique\r\n");
      out.write("        <option value=\"Vue Dynamique\">Vue Dynamique\r\n");
      out.write("        <option value=\"Test Statique\">Test Statique\r\n");
      out.write("        <option value=\"Test Dynamique\">Test Dynamique\r\n");
      out.write("    </select>\r\n");
      out.write("    \r\n");
      out.write("    <select name=\"moyen\">\r\n");
      out.write("        <option value=\"dropdown\">Veuillez selectionner un moyen\r\n");
      out.write("        <option value=\"Documents de reference\">Documents de référence\r\n");
      out.write("        <option value=\"Diagramme Uses-Cases\">Diagramme Uses-Cases\r\n");
      out.write("        <option value=\"Observation\">Observation\r\n");
      out.write("        <option value=\"Questionnaire\">Questionnaire\r\n");
      out.write("        <option value=\"Interviews\">Interviews\r\n");
      out.write("        <option value=\"Prototypes\">Prototypes\r\n");
      out.write("        <option value=\"Comparaison\">Comparaison\r\n");
      out.write("        <option value=\"Diagramme de flux de donnees\">Diagramme de flux de données\r\n");
      out.write("        <option value=\"Diagrammes Etats-Transitions\">Diagrammes Etats-Transitions\r\n");
      out.write("        <option value=\"Modeles entites-relations\">Modèles entités-relations\r\n");
      out.write("        <option value=\"Diagramme Uses-Cases\">Diagramme Uses-Cases\r\n");
      out.write("        <option value=\"Diagramme de sequence\">Diagramme de séquence\r\n");
      out.write("        <option value=\"Diagramme Activites\">Diagramme Activités\r\n");
      out.write("        <option value=\"Architecture Pipeline\">Architecture Pipeline\r\n");
      out.write("        <option value=\"Referentiels de donnees\">Référentiels de données\r\n");
      out.write("        <option value=\"Architecture Client-Serveur\">Architecture Client-Serveur\r\n");
      out.write("        <option value=\"Architecture en couches\">Architecture en couches\r\n");
      out.write("        <option value=\"Architecture MVC\">Architecture MVC\r\n");
      out.write("        <option value=\"Architecture orientee services\">Architecture orientée services\r\n");
      out.write("        <option value=\"Les patrons de conception\">Les patrons de conception\r\n");
      out.write("        <option value=\"Diagramme de paquets\">Diagramme de paquets\r\n");
      out.write("        <option value=\"Diagramme de composants\">Diagramme de composants\r\n");
      out.write("        <option value=\"Diagramme de deploiement \">Diagramme de déploiement \r\n");
      out.write("        <option value=\"Diagramme combine\">Diagramme combiné\r\n");
      out.write("        <option value=\"Diagramme de classes\">Diagramme de classes\r\n");
      out.write("        <option value=\"Diagramme de structure composite\">Diagramme de structure composite\r\n");
      out.write("        <option value=\"Diagramme de sequence\">Diagramme de séquence\r\n");
      out.write("        <option value=\"Diagramme Etats-transitions\">Diagramme Etats-transitions\r\n");
      out.write("        <option value=\"Revue de code\">Revue de code\r\n");
      out.write("        <option value=\"Verifications formelle\">Vérifications formelle\r\n");
      out.write("        <option value=\"Test par classes equivalence\">Test par classes d'équivalence\r\n");
      out.write("        <option value=\"Tests aux limites\">Tests aux limites\r\n");
      out.write("        <option value=\"Tests combinatoires\">Tests combinatoires\r\n");
      out.write("        <option value=\"Graphe de controle\">Graphe de contrôle\r\n");
      out.write("    </select>\r\n");
      out.write("    \r\n");
      out.write("     <select name=\"argument\">\r\n");
      out.write("        <option value=\"dropdown\">Veuillez selectionner un argument\r\n");
      out.write("        <option value=\"Sommerville, 2007\">Sommerville, 2007\r\n");
      out.write("        <option value=\"Abran et al, 2004\">Abran et al, 2004\r\n");
      out.write("        <option value=\"Wongthongtham et al., 2009\">Wongthongtham et al, 2009\r\n");
      out.write("        <option value=\"Cours GL1 II2 ENSI\">Cours GL1 II2 ENSI\r\n");
      out.write("    </select>\r\n");
      out.write("    <br>\r\n");
      out.write("    <input type=\"hidden\" name=\"dropdown\" id=\"dropdown\">\r\n");
      out.write("    <input type=\"hidden\" name=\"idgrp\" id=\"idgrp\" value=\"");
      out.print(request.getParameter("idgrp"));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" name=\"co\" id=\"co\" value=\"");
      out.print(request.getParameter("co"));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" name=\"iduser\" id=\"iduser\" value=\"");
      out.print(request.getParameter("user"));
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" name=\"idprob\" id=\"idprob\" value=\"");
      out.print(idprob );
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" name=\"i\" id=\"i\" value=\"");
      out.print(j );
      out.write("\">\r\n");
      out.write("    <input type=\"submit\" value=\"Répondre\" name=\"dropdown\" id=\"dropdown\" class =\"button\">\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("  </section>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
