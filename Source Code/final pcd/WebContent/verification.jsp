 <%@ include file="/taglibs.jsp"%>
 <%@page import="DAO.ForumBeanManager"%>
  <%@page import="Domain.Utilisateur"%>
<%
Object obj = session.getAttribute("session");
// attribut session ok, test si utilisateur courant la possède
if(obj != null)
{
	ForumBeanManager fbm = new ForumBeanManager();
	if(fbm.estMembre(obj.toString()) == false)
	{
		session.invalidate();
%>
		<jsp:forward page="./login.jsp" />
<%
	}
	// On récupère l'utilisateur courant et on l'attribut  à la session
	else
	{
		Utilisateur uCourant = fbm.getUtilisateur(obj.toString());
		session.setAttribute("user",uCourant);
	}
%>
	
<%
}
// Pas d'attribut session, redirection vers la page de login
else
{
	session.setAttribute("Erreur","L'accès au forum nécessite une authentification préalable !");
%>
	<jsp:forward page="./login.jsp" />
<%
}


%>