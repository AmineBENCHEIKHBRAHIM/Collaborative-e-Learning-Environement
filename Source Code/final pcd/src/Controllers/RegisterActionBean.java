package Controllers;
import DAO.*;
import Domain.*;

import java.util.ArrayList;
import java.util.regex.Pattern;

import cryptage.MD5Password;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;


public class RegisterActionBean extends ForumActionBean{
	

	@Validate(required=true)private String pseudo;
	@Validate(required=true)private String pass;
	@Validate(required=true)private String mail;
	private String resultat;
	private String erreur;
	private Utilisateur uCourant;

	
	
	
    public void setuCourant(Utilisateur uCourant) {
		this.uCourant = uCourant;
	}




	public Utilisateur getuCourant() {
		return uCourant;
	}




	public void setErreur(String erreur) {
		this.erreur = erreur;
	}




	public String getErreur() {
		return erreur;
	}




	public String getPseudo() {
		return pseudo;
	}




	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}




	public String getPass() {
		return pass;
	}




	public void setPass(String pass) {
		this.pass = pass;
	}




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}




	public String getResultat() {
		return resultat;
	}


	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public Resolution create() {
		
		String pseu = this.pseudo;
		 // Encodage du mot de passe
		MD5Password md5 = new MD5Password();
		String mdp = md5.getEncodedPassword(this.pass);
    	String email = this.mail;
    	System.out.println(pseudo + " - "+pass+" - " + mail);
    	Boolean e = Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", email);
    	System.out.println(e+"ppppppppppp\n\n\n");
    	if(e==false){
    		this.erreur="l'e-mail n'est pas valide";
    		return new RedirectResolution("/register.jsp").flash(this);	
    		
    	}
    	
    	ForumBeanManager fbm = new ForumBeanManager();
    	Boolean b = fbm.checkmaildispo(email);

    	if((b==false) && (mdp.compareTo("")!=0) && (pseu.compareTo("")!=0) && (e==true)){
    	Utilisateur user = new Utilisateur();
    	user.setMail(email);
    	
   	    
    	user.setMotDePasse(mdp);
    	user.setPseudo(pseu);
    	user.setSession("xxxxxxxxxxxxxxxxxxxxxxxx");
    	
    	Droit d = fbm.getDroitbystring("Membre");
    	user.setDroit(d);
    	fbm.ajouteruser(user);
    	return new RedirectResolution("/accueil.jsp").flash(this);
    	}else if(b==true){

    	this.erreur = "l'e-mail existe deja veuillez vérifier celui-ci";
    	return new RedirectResolution("/register.jsp").flash(this);	
    	}else if((mdp.compareTo("")==0)){
        	this.erreur = "veuillez rentrer un mot de passe";
        	return new RedirectResolution("/accueil.jsp").flash(this);	
        }
    	else if(pseu.compareTo("")!=0){
            this.erreur = "veuillez rentrer un pseudo";
           return new RedirectResolution("/accueil.jsp").flash(this);	
       }
    	else{
        	return new RedirectResolution("/accueil.jsp").flash(this);	
        }
    	
    	

    }

}
