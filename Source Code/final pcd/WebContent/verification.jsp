 <%@ include file="/taglibs.jsp"%>
 <%@page import="DAO.ForumBeanManager"%>
  <%@page import="Domain.Utilisateur"%>
<%
Object obj = session.getAttribute("session");
// attribut session ok, test si utilisateur courant la poss�de
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
	// On r�cup�re l'utilisateur courant et on l'attribut  � la session
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
	session.setAttribute("Erreur","L'acc�s au forum n�cessite une authentification pr�alable !");
%>
	<jsp:forward page="./login.jsp" />
<%
}


%>