package Controllers;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;
import DAO.ForumBeanManager;
import Domain.Message;
import Domain.MessageId;
import Domain.Topic;
import Domain.Utilisateur;

public class GestionforumActionBean extends ForumActionBean {

	private String titre_message;
	private String corps_message;
	private String parent_message;
	private String idMessageCourant;
	private String erreur;

	private String idTopicCourant;


	public String getIdTopicCourant() {
		return idTopicCourant;
	}

	public void setIdTopicCourant(String idTopicCourant) {
		this.idTopicCourant = idTopicCourant;
	}



	public String getIdMessageCourant() {
		return idMessageCourant;
	}

	public void setIdMessageCourant(String idMessageCourant) {
		this.idMessageCourant = idMessageCourant;
	}

	public String getParent_message() {
		return parent_message;
	}

	public void setParent_message(String parentMessage) {
		parent_message = parentMessage;
	}

	public String getTitre_message() {
		return titre_message;
	}
	
	public void setTitre_message(String titreMessage) {
		titre_message = titreMessage;
	}
	
	public String getCorps_message() {
		return corps_message;
	}
	
	public void setCorps_message(String corpsMessage) {
		corps_message = corpsMessage;
	}
	
	
	public Resolution  ajouterReponse()
	{
		ForumBeanManager fbm = new ForumBeanManager();
		/* Récupération du topic courant  et association à MessageID */
		
		Message Parent = fbm.getMessage(this.parent_message); // Je cherche le topic courant : J'ai l'id du message parent. Je récupère le message parent
		MessageId MessageIDParent = Parent.getId(); // Puis je passe par le messageId
		Topic tCourant = MessageIDParent.getTopic(); // Pour récupérer le topic courant !!
		
		if(this.titre_message == null || this.corps_message == null)
		{ System.out.println("\n\nuiuuuuuuiuiuiuiuiuuiuiuiuiuiui");
			this.erreur = "Vous devez renseigner titre et description !";
		}
		else
		{
		
		Message m = new Message();
		
		
		/* Création de l'id du message pour association hibernate HQL */
		
		MessageId mId = new MessageId();
		Message lastMessageInBDD = fbm.getMessage("last");
		// 0 Si aucun message n'existe pour le topic en bdd
		if(lastMessageInBDD != null)
		{
			System.out.println("\n\n\n\n\nId dernier message  :"+lastMessageInBDD.getId().getIdMessage());
			mId.setIdMessage(lastMessageInBDD.getId().getIdMessage()+1);
		}
		else
		{
			// Premier message ajouté pour le topic
			mId.setIdMessage(1);
		}
		
	
		
		mId.setTopic(tCourant);
		
		/* Création du message */
		
		m.setId(mId); // Association de l'id récemment créé au message
		m.setTitre(this.titre_message);
		m.setMessage(this.corps_message);
		m.setParent(Integer.parseInt(this.parent_message));
		
		java.sql.Date sDate = new java.sql.Date(System.currentTimeMillis());
		m.setDate(sDate);
		
		// Association du message à lutilisateur courant ?
		Utilisateur uCourant  = getContext().getUtilisateur();
		m.setUtilisateur(uCourant);
		
		// Ajout / Sauvegarde BDD
		fbm.ajouterMessage(m);
		}
		return new RedirectResolution("/topic.jsp?topic="+tCourant.getIdTopic()).flash(this);	
	}
	
	
	public Resolution  modifierMessage()
	{
		// Modif en bff via fbm
		ForumBeanManager fbm = new ForumBeanManager();
		Message mCourant =fbm.getMessage(this.idMessageCourant);
		
		if(this.titre_message == null || this.corps_message == null)
		{ 
			System.out.println("\n\nuiuuuuuuiuiuiuiuiuuiuiuiuiuiui");
			this.erreur = "Vous devez renseigner titre et description !";
		}
		else
		{
			//MessageId mid = new MessageId();
			//mid.setIdMessage(Integer.parseInt(this.idMessageCourant));
			
			mCourant.setTitre(this.titre_message);
			mCourant.setMessage(this.corps_message);
			java.sql.Date sDate2 = new java.sql.Date(System.currentTimeMillis());
			mCourant.setDate(sDate2);
			
		
			fbm.modifierMessage(mCourant);
		}
		
		return new RedirectResolution("/topic.jsp?topic="+mCourant.getId().getTopic().getIdTopic());	
	}
	


	public Resolution  ajouterMessage()
	{
		if(this.titre_message == null || this.corps_message == null)
		{ 
			System.out.println("\n\nuiuuuuuuiuiuiuiuiuuiuiuiuiuiui");
			this.erreur = "Vous devez renseigner titre et description !";
		}
		else
		{
		
		ForumBeanManager fbm = new ForumBeanManager();
		// Nvo mess a ajouter
		Message m = new Message();
		MessageId mid = new MessageId();
		// Récupération du dernier message ajouté pr avoir dernier id, et association au messageID
		Message mlast = fbm.getMessage("last");
		MessageId midlast = null;
		if(mlast != null)
		{
			midlast = mlast.getId();
		}
		if(midlast != null)
		{
			mid.setIdMessage(midlast.getIdMessage()+1);
		}
		else
		{
			mid.setIdMessage(1);
		}
		// Récupération du topic courant et assoc
		Topic tCourant = fbm.getTopic(this.idTopicCourant);
		mid.setTopic(tCourant);
		
		m.setUtilisateur(getContext().getUtilisateur());
		m.setId(mid); //id
		m.setTitre(this.titre_message); //titre message
		m.setMessage(this.corps_message); // corps
		java.sql.Date sDate = new java.sql.Date(System.currentTimeMillis());
		m.setDate(sDate); // date

		// AJOUT
		fbm.ajouterMessage(m);
		}
		
		return new RedirectResolution("/topic.jsp?topic="+this.idTopicCourant);	
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

	public String getErreur() {
		return erreur;
	}
	



}
