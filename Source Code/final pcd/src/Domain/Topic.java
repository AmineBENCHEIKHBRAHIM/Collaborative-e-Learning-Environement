// default package
// Generated 11 mai 2010 15:55:17 by Hibernate Tools 3.2.4.GA
package Domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Topic generated by hbm2java
 */
public class Topic implements java.io.Serializable {

	private Integer idTopic;
	private Utilisateur utilisateur;
	private String nom;
	private Integer nbVues;
	private String description;
	private Set<Message> messages = new HashSet<Message>(0);

	public Topic() {
	}

	public Topic(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Topic(Utilisateur utilisateur, String nom, Integer nbVues, String description,
			Set<Message> messages) {
		this.utilisateur = utilisateur;
		this.nom = nom;
		this.nbVues = nbVues;
		this.description = description;
		this.messages = messages;
	}

	public Integer getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(Integer idTopic) {
		this.idTopic = idTopic;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbVues() {
		return this.nbVues;
	}

	public void setNbVues(Integer nbVues) {
		this.nbVues = nbVues;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

}
