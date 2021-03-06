/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2014-07-02 01:55:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Domain.*;
import DAO.ForumBeanManager;
import java.util.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import classes.DatabaseConnection;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("       \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t<title>Profil</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/global.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\t\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<span id=\"usernav\"><a href=\"logout.jsp\">Logout</a> - <a href=\"#\">My Profile<span><img src=\"images/demo/user_avatar_s.jpg\" /></span></a></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<ul id=\"n\" class=\"clearfix\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"#\">Profile</a></li>\r\n");
      out.write("\t\t\t");

Object obj = session.getAttribute("session");
// attribut session ok, test si utilisateur courant la possède
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
		{
      out.write("\r\n");
      out.write("\t\t<li class=\"sel\"><a href=\"creergroupe.jsp\">Nouveau Groupe</a></li>\r\n");
      out.write("\t\t");

		}
		else
		{
			
      out.write("\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"http://localhost:8080/final_pcd/groupe.jsp?name=");
      out.print(session.getAttribute("grp"));
      out.write("&desc=");
      out.print(session.getAttribute("desc"));
      out.write("&idgrp=");
      out.print(session.getAttribute("idgroupe"));
      out.write("&co=");
      out.print(session.getAttribute("iduser"));
      out.write("\">Votre Groupe</a></li>\r\n");
      out.write("\t\t\t");

		}
}

      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"forum_accueil.jsp\">Forum</a></li>\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"upload.jsp\">GL Drive</a></li>\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"jsp/ChatWindow.jsp\">Chat</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"content\" class=\"clearfix\">\r\n");
      out.write("\t\t");
if(Integer.parseInt(session.getAttribute("iduser").toString())==18){ 
      out.write("<section id=\"left\">\r\n");
      out.write("\t\t\t<div id=\"userStats\" class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<div class=\"pic\">\r\n");
      out.write("\t\t\t\t\t><a href=\"#\"><img src=\"images/demo/tof1.png\" width=\"130\" height=\"150\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"data\">\r\n");
      out.write("\t\t\t\t\t<h1>Amine Ben Cheikh Brahim</h1>\r\n");
      out.write("\t\t\t\t\t<h3>Ariana, Tunisie</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h1>About Me:</h1>\r\n");
      out.write("\t\t\t<p>Amine est un élève en 2ème année à l'Ecole Nationale des Sciences de l'informatique ( ENSI ) Spécialité ingénieurie logiciel et systèmes d'information.Il a passé deux ans de préparatoire à l'IPEIT où il a réussi a obtenir son diplome et Mathématiques et Sciences Physique fondamentaux.</p>\r\n");
      out.write("\t\t</section>");
}
		else {
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"left\">\r\n");
      out.write("\t\t\t<div id=\"userStats\" class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<div class=\"pic\">\r\n");
      out.write("\t\t\t\t\t><a href=\"#\"><img src=\"images/demo/user_avatar1.jpg\" width=\"130\" height=\"150\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"data\">\r\n");
      out.write("\t\t\t\t\t<h1>Amine Ben Cheikh</h1>\r\n");
      out.write("\t\t\t\t\t<h3>x , Tunisie</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h1>About Me:</h1>\r\n");
      out.write("\t\t\t<p>Nothing to display.</p>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"right\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"gcontent\">\r\n");
      out.write("\t\t\t\t<div class=\"head\"><h1>Groups List</h1></div>\r\n");
      out.write("\t\t\t\t<div class=\"boxy\">\r\n");
      out.write("\t\t\t\t\t<p>Your groups</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"friendslist clearfix\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

		
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
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"friend\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://localhost:8080/final_pcd/groupe.jsp?name=");
      out.print(groupename);
      out.write("&desc=");
      out.print(descr);
      out.write("&idgrp=");
      out.print(idgroupe);
      out.write("&co=");
      out.print(coor);
      out.write("\"><img src=\"images/demo/friend_avatar_default.jpg\" width=\"30\" height=\"30\" alt=\"Jerry K.\" /></a><span class=\"friendly\"><a href=\"http://localhost:8080/final_pcd/groupe.jsp?name=");
      out.print(groupename);
      out.write("&desc=");
      out.print(descr);
      out.write("&idgrp=");
      out.print(idgroupe);
      out.write("&co=");
      out.print(coor);
      out.write('"');
      out.write('>');
      out.print(groupename );
      out.write("</a></span>\r\n");
      out.write("\t\t\t\t\t</div>");

				}
			}
			    
				//RequestDispatcher rd = request.getRequestDispatcher("/download.jsp");
				//rd.forward(request, response);
			
			   // response.sendRedirect("index2.jsp");
		}
		catch(Exception e){}
		

      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<span><a href=\"#\">See all...</a></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t</div>\r\n");
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
