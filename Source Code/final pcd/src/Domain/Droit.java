// default package
// Generated 11 mai 2010 15:55:17 by Hibernate Tools 3.2.4.GA
package Domain;
import java.util.HashSet;
import java.util.Set;

/**
 * Droit generated by hbm2java
 */
public class Droit implements java.io.Serializable {

	private Integer idDroit;
	private String droit;
	private Set<Utilisateur> utilisateurs = new HashSet<Utilisateur>(0);

	public Droit() {
	}

	public Droit(String droit, Set<Utilisateur> utilisateurs) {
		this.droit = droit;
		this.utilisateurs = utilisateurs;
	}

	public Integer getIdDroit() {
		return this.idDroit;
	}

	public void setIdDroit(Integer idDroit) {
		this.idDroit = idDroit;
	}

	public String getDroit() {
		return this.droit;
	}

	public void setDroit(String droit) {
		this.droit = droit;
	}

	public Set<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}