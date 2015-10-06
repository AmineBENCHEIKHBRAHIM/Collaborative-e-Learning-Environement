package Controllers;

import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;
import DAO.ForumBeanManager;
import Domain.Topic;
import Domain.Utilisateur;

public class GestiontopicActionBean extends ForumActionBean {
	
	@Validate(required=true)private String titre_topic;
	@Validate(required=true)private String description;
	private Utilisateur uCourant;
	
	
	public String getTitre_topic() {
		return titre_topic;
	}

	public void setTitre_topic(String titreTopic) {
		titre_topic = titreTopic;
	}
	
	public void setuCourant(Utilisateur uCourant) {
		this.uCourant = uCourant;
	}

	public Utilisateur getuCourant() {
		return uCourant;
	}
	
	public Resolution  ajouterTopic()
	{
		ForumBeanManager fbm = new ForumBeanManager();
		Topic t = new Topic();
		t.setNom(this.titre_topic);
		t.setDescription(this.description);
		System.out.println(this.titre_topic);
		
		Utilisateur u = getContext().getUtilisateur();
		this.uCourant = u;
		System.out.println(uCourant.getPseudo()+"jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		t.setUtilisateur(u);
		t.setNbVues(0);
		fbm.creertopic(t);
		
		return new RedirectResolution("/forum_accueil.jsp");	
	}
	
	
	
	


}
