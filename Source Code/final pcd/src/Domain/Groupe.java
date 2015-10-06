package Domain;



public class Groupe implements java.io.Serializable {

	private Integer idGroupe;
	private Utilisateur coordinateur;
	private String nom;
	private Integer nbMembres;
	private String description;

	public Groupe() {
	}

	

	public Groupe(Utilisateur utilisateur, String nom, Integer nbMembres, String description) {
		this.coordinateur = utilisateur;
		this.nom = nom;
		this.nbMembres = nbMembres;
		this.description = description;
	}

	public Integer getIdGroupe() {
		return this.idGroupe;
	}

	public void setIdGroupe(Integer idGroupe) {
		this.idGroupe = idGroupe;
	}

	public Utilisateur getCoordinateur() {
		return this.coordinateur;
	}

	public void setCoordinateur(Utilisateur utilisateur) {
		this.coordinateur = utilisateur;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getnbMembres() {
		return this.nbMembres;
	}

	public void setNbMembres(Integer nbVues) {
		this.nbMembres = nbVues;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}

