package Controllers;
import Domain.*;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class ForumActionBeanContext extends ActionBeanContext{

	//affecte une nouvelle session à l'utilisateur
	public void setSession(String session)
	{
		getRequest().getSession().setAttribute("session", session);
	}
    
	//retourne la session de l'utilisateur
	public String  getSession()
	{
		return (String) getRequest().getSession().getAttribute("session");
	}

	//retourne l'utilisateur actuellement connecte
	public Utilisateur  getUtilisateur()
	{
		return (Utilisateur) getRequest().getSession().getAttribute("user");
	}

	//affecte l'utilisateur a la session
	public void setUtilisateur(Utilisateur utilisateurCourant)
	{
		getRequest().getSession().setAttribute("user", utilisateurCourant);
	}
	
	
    public Resolution getSourcePageResolution()
    {
    	if(getSourcePage().equals("/Style/header.jsp"))
    		return new ForwardResolution("/Accueil.jsp");
    	else
    		return new ForwardResolution(getSourcePage());
    }
	
}