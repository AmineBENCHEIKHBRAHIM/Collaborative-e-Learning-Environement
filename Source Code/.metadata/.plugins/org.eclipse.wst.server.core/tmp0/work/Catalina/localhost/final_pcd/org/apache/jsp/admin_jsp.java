/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2014-05-06 23:25:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.ForumBeanManager;
import Domain.Utilisateur;
import DAO.ForumBeanManager;
import java.util.*;
import Domain.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/taglibs.jsp", Long.valueOf(1399418393499L));
    _jspx_dependants.put("/verification.jsp", Long.valueOf(1399418393518L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005fbeanclass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005fbeanclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.release();
    _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005fbeanclass.release();
    _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  \r\n");

Object obj = session.getAttribute("session");
// attribut session ok, test si utilisateur courant la possède
if(obj != null)
{
	ForumBeanManager fbm = new ForumBeanManager();
	if(fbm.estMembre(obj.toString()) == false)
	{
		session.invalidate();

      out.write("\r\n");
      out.write("\t\t");
      if (true) {
        _jspx_page_context.forward("./login.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

	}
	// On récupère l'utilisateur courant et on l'attribut  à la session
	else
	{
		Utilisateur uCourant = fbm.getUtilisateur(obj.toString());
		session.setAttribute("user",uCourant);
	}

      out.write("\r\n");
      out.write("\t\r\n");

}
// Pas d'attribut session, redirection vers la page de login
else
{
	session.setAttribute("Erreur","L'accès au forum nécessite une authentification préalable !");

      out.write('\r');
      out.write('\n');
      out.write('	');
      if (true) {
        _jspx_page_context.forward("./login.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}



      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

ForumBeanManager fbm = new ForumBeanManager();
Utilisateur uCourant = (Utilisateur)session.getAttribute("user");
if(fbm.isAdmin(uCourant) == true)
{

      out.write('\r');
      out.write('\n');
      //  stripes:layout-render
      net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_stripes_005flayout_002drender_005f0 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
      _jspx_th_stripes_005flayout_002drender_005f0.setPageContext(_jspx_page_context);
      _jspx_th_stripes_005flayout_002drender_005f0.setParent(null);
      // /admin.jsp(15,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_stripes_005flayout_002drender_005f0.setName("/style.jsp");
      // /admin.jsp(15,0) null
      _jspx_th_stripes_005flayout_002drender_005f0.setDynamicAttribute(null, "title", "CRUDE gestion membres");
      int _jspx_eval_stripes_005flayout_002drender_005f0 = _jspx_th_stripes_005flayout_002drender_005f0.doStartTag();
      if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_stripes_005flayout_002drender_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_stripes_005flayout_002drender_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<h3>Bienvenue sur le module de gestion des membres</h3>\r\n");
          out.write("\r\n");
          //  stripes:layout-component
          net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_stripes_005flayout_002dcomponent_005f0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002drender_005f0);
          // /admin.jsp(19,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_stripes_005flayout_002dcomponent_005f0.setName("contents");
          int _jspx_eval_stripes_005flayout_002dcomponent_005f0 = _jspx_th_stripes_005flayout_002dcomponent_005f0.doStartTag();
          if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_stripes_005flayout_002dcomponent_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_stripes_005flayout_002dcomponent_005f0.doInitBody();
            }
            do {
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<div style=\"float:left:width:18%\"></div>\r\n");
              out.write(" <div style=\"margin-left:20%;\">\r\n");
              out.write(" <h3>Liste des utilisateurs</h3>\r\n");
              out.write("<TABLE class=\"tab\" >\r\n");
              out.write("<tr class=\"tab_titre\">\r\n");
              out.write("<td align=\"center\">id</td>\r\n");
              out.write("<td align=\"center\">role</td>\r\n");
              out.write("<td align=\"center\">pseudo</td>\r\n");
              out.write("<td align=\"center\">mail</td>\r\n");
              out.write("<td align=\"center\">modifier</td>\r\n");
              out.write("<td align=\"center\">supprimer</td>\r\n");
              out.write("</tr>\r\n");

 // On récupère l'ensemble des topics
List<Utilisateur> users =  fbm.listeruser();
 

for(Utilisateur u :users){

              out.write('\r');
              out.write('\n');
              //  stripes:form
              net.sourceforge.stripes.tag.FormTag _jspx_th_stripes_005fform_005f0 = (net.sourceforge.stripes.tag.FormTag) _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005fbeanclass.get(net.sourceforge.stripes.tag.FormTag.class);
              _jspx_th_stripes_005fform_005f0.setPageContext(_jspx_page_context);
              _jspx_th_stripes_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005flayout_002dcomponent_005f0);
              // /admin.jsp(41,0) name = beanclass type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_stripes_005fform_005f0.setBeanclass("Controllers.RedirectActionBean");
              // /admin.jsp(41,0) name = focus type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_stripes_005fform_005f0.setFocus("");
              int[] _jspx_push_body_count_stripes_005fform_005f0 = new int[] { 0 };
              try {
                int _jspx_eval_stripes_005fform_005f0 = _jspx_th_stripes_005fform_005f0.doStartTag();
                if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_stripes_005fform_005f0[0]++;
                    _jspx_th_stripes_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_stripes_005fform_005f0.doInitBody();
                  }
                  do {
                    out.write('\r');
                    out.write('\n');
                    //  stripes:hidden
                    net.sourceforge.stripes.tag.InputHiddenTag _jspx_th_stripes_005fhidden_005f0 = (net.sourceforge.stripes.tag.InputHiddenTag) _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.get(net.sourceforge.stripes.tag.InputHiddenTag.class);
                    _jspx_th_stripes_005fhidden_005f0.setPageContext(_jspx_page_context);
                    _jspx_th_stripes_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
                    // /admin.jsp(42,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_stripes_005fhidden_005f0.setName("iduser");
                    // /admin.jsp(42,0) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_stripes_005fhidden_005f0.setId("q1");
                    // /admin.jsp(42,0) name = value type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                    _jspx_th_stripes_005fhidden_005f0.setValue(u.getIdUtilisateur());
                    int[] _jspx_push_body_count_stripes_005fhidden_005f0 = new int[] { 0 };
                    try {
                      int _jspx_eval_stripes_005fhidden_005f0 = _jspx_th_stripes_005fhidden_005f0.doStartTag();
                      if (_jspx_th_stripes_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        return;
                      }
                    } catch (java.lang.Throwable _jspx_exception) {
                      while (_jspx_push_body_count_stripes_005fhidden_005f0[0]-- > 0)
                        out = _jspx_page_context.popBody();
                      _jspx_th_stripes_005fhidden_005f0.doCatch(_jspx_exception);
                    } finally {
                      _jspx_th_stripes_005fhidden_005f0.doFinally();
                      _005fjspx_005ftagPool_005fstripes_005fhidden_0026_005fvalue_005fname_005fid_005fnobody.reuse(_jspx_th_stripes_005fhidden_005f0);
                    }
                    out.write("\r\n");
                    out.write("\r\n");
                    out.write("\r\n");
                    out.write("<tr>\r\n");
                    out.write("<td>");
                    out.print(u.getIdUtilisateur() );
                    out.write("</td>\r\n");
                    out.write("<td>");
                    out.print(u.getDroit().getDroit() );
                    out.write("</td>\r\n");
                    out.write("<td>");
                    out.print(u.getPseudo());
                    out.write("</td>\r\n");
                    out.write("<td>");
                    out.print(u.getMail() );
                    out.write("</td>\r\n");
                    out.write("<td>");
                    if (_jspx_meth_stripes_005fsubmit_005f0(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
                      return;
                    out.write("</td>\r\n");
	int i=uCourant.getIdUtilisateur();
	int j=u.getIdUtilisateur();
	if ((i)==(j)){ 
                    out.write("\r\n");
                    out.write("<td><i>impossible</i> </td>\r\n");
}else{ 
                    out.write("\r\n");
                    out.write("<td>");
                    if (_jspx_meth_stripes_005fsubmit_005f1(_jspx_th_stripes_005fform_005f0, _jspx_page_context, _jspx_push_body_count_stripes_005fform_005f0))
                      return;
                    out.write("</td>\r\n");
} 
                    out.write("\r\n");
                    out.write("</tr>\r\n");
                    out.write("\r\n");
                    out.write("\r\n");
                    int evalDoAfterBody = _jspx_th_stripes_005fform_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_stripes_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_stripes_005fform_005f0[0]--;
                  }
                }
                if (_jspx_th_stripes_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (java.lang.Throwable _jspx_exception) {
                while (_jspx_push_body_count_stripes_005fform_005f0[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_stripes_005fform_005f0.doCatch(_jspx_exception);
              } finally {
                _jspx_th_stripes_005fform_005f0.doFinally();
                _005fjspx_005ftagPool_005fstripes_005fform_0026_005ffocus_005fbeanclass.reuse(_jspx_th_stripes_005fform_005f0);
              }
              out.write("\r\n");
              out.write("\r\n");
} 
              out.write("\r\n");
              out.write("</TABLE>\r\n");
              out.write("</div>\r\n");
              out.write("\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_stripes_005flayout_002dcomponent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_stripes_005flayout_002dcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_stripes_005flayout_002dcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fstripes_005flayout_002dcomponent_0026_005fname.reuse(_jspx_th_stripes_005flayout_002dcomponent_005f0);
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_stripes_005flayout_002drender_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_stripes_005flayout_002drender_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_stripes_005flayout_002drender_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fstripes_005flayout_002drender_0026_005ftitle_005fname.reuse(_jspx_th_stripes_005flayout_002drender_005f0);
      out.write('\r');
      out.write('\n');

}
else
{

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("/login.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /taglibs.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /taglibs.jsp(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /taglibs.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctx");
    // /taglibs.jsp(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_stripes_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f0 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /admin.jsp(50,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f0.setName("modif");
    // /admin.jsp(50,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f0.setValue("modif");
    int[] _jspx_push_body_count_stripes_005fsubmit_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fsubmit_005f0 = _jspx_th_stripes_005fsubmit_005f0.doStartTag();
      if (_jspx_th_stripes_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fsubmit_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fsubmit_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fsubmit_005f0.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fsubmit_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_stripes_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_stripes_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_stripes_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  stripes:submit
    net.sourceforge.stripes.tag.InputSubmitTag _jspx_th_stripes_005fsubmit_005f1 = (net.sourceforge.stripes.tag.InputSubmitTag) _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.get(net.sourceforge.stripes.tag.InputSubmitTag.class);
    _jspx_th_stripes_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_stripes_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_stripes_005fform_005f0);
    // /admin.jsp(56,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f1.setName("suppr");
    // /admin.jsp(56,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_stripes_005fsubmit_005f1.setValue("suppr");
    int[] _jspx_push_body_count_stripes_005fsubmit_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_stripes_005fsubmit_005f1 = _jspx_th_stripes_005fsubmit_005f1.doStartTag();
      if (_jspx_th_stripes_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_stripes_005fsubmit_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_stripes_005fsubmit_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_stripes_005fsubmit_005f1.doFinally();
      _005fjspx_005ftagPool_005fstripes_005fsubmit_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_stripes_005fsubmit_005f1);
    }
    return false;
  }
}
