// default package
// Generated 11 mai 2010 15:55:17 by Hibernate Tools 3.2.4.GA
package Domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Utilisateur generated by hbm2java
 */
public class UtilisateurConnecter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8470501949406948190L;
	private Integer idUtilisateur;
	private Droit droit;
	private String pseudo;
	private String motDePasse;
	private String mail;
	private String session;
	private Set<Topic> topics = new HashSet<Topic>(0);
	private Set<Message> messages = new HashSet<Message>(0);

	public UtilisateurConnecter() {
	}

	public UtilisateurConnecter(Droit droit, String session) {
		this.droit = droit;
		this.session = session;
	}

	public UtilisateurConnecter(Droit droit, String pseudo, String motDePasse,
			String mail, String session, Set<Topic> topics,
			Set<Message> messages) {
		this.droit = droit;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.mail = mail;
		this.session = session;
		this.topics = topics;
		this.messages = messages;
	}

	public Integer getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Droit getDroit() {
		return this.droit;
	}

	public void setDroit(Droit droit) {
		this.droit = droit;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Set<Topic> getTopics() {
		return this.topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

}