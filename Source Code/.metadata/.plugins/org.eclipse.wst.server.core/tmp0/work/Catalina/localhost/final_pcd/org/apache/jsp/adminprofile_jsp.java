/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2014-05-06 06:32:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t<span id=\"usernav\"><a href=\"#\">Logout</a> - <a href=\"#\">Admin<span><img src=\"images/demo/user_avatar_s.jpg\" /></span></a></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t\t<ul id=\"n\" class=\"clearfix\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"#\">Profile</a></li>\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"groupes.jsp\">groupes</a></li>\r\n");
      out.write("\t\t\t<li class=\"sel\"><a href=\"forum.jsp\">Forum</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"content\" class=\"clearfix\">\r\n");
      out.write("\t\t<section id=\"left\">\r\n");
      out.write("\t\t\t<div id=\"userStats\" class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<div class=\"pic\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/user_avatar1.jpg\" width=\"150\" height=\"150\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"data\">\r\n");
      out.write("\t\t\t\t\t<h1>Johnny Appleseed</h1>\r\n");
      out.write("\t\t\t\t\t<h3>San Francisco, CA</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h1>About Me:</h1>\r\n");
      out.write("\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"right\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"gcontent\">\r\n");
      out.write("\t\t\t\t<div class=\"head\"><h1>Friends List</h1></div>\r\n");
      out.write("\t\t\t\t<div class=\"boxy\">\r\n");
      out.write("\t\t\t\t\t<p>Your friends</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"friendslist clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"friend\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/friend_avatar_default.jpg\" width=\"30\" height=\"30\" alt=\"Jerry K.\" /></a><span class=\"friendly\"><a href=\"#\">Jerry K.</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"friend\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/friend_avatar_default.jpg\" width=\"30\" height=\"30\" alt=\"Katie F.\" /></a><span class=\"friendly\"><a href=\"#\">Katie F.</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"friend\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/friend_avatar_default.jpg\" width=\"30\" height=\"30\" alt=\"Ash K.\" /></a><span class=\"friendly\"><a href=\"#\">Ash K.</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"friend\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/friend_avatar_default.jpg\" width=\"30\" height=\"30\" alt=\"Sponge B.\" /></a><span class=\"friendly\"><a href=\"#\">Sponge B.</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"friend\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/friend_avatar_default.jpg\" width=\"30\" height=\"30\" alt=\"Frank\" /></a><span class=\"friendly\"><a href=\"#\">Frank</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"friend\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/demo/friend_avatar_default.jpg\" width=\"30\" height=\"30\" alt=\"Alexa S.\" /></a><span class=\"friendly\"><a href=\"#\">Alexa S.</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<span><a href=\"groupe.html\">See all...</a></span>\r\n");
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
