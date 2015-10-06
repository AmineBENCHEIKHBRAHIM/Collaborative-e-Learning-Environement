package Controllers;
import java.util.regex.Pattern;

import cryptage.MD5Password;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;
import DAO.ForumBeanManager;
import Domain.Droit;
import Domain.Utilisateur;


public class ModifActionBean extends ForumActionBean{
	
	private int iduser;
	@Validate(required=true)private String pseudo;
	@Validate(required=true)private String mail;
	private String erreur;
	@Validate(required=true)private String droits;
	private String mdp1;
	private String mdp2;
	
	public String getMdp1() {
		return mdp1;
	}

	public void setMdp1(String mdp1) {
		this.mdp1 = mdp1;
	}

	public String getMdp2() {
		return mdp2;
	}

	public void setMdp2(String mdp2) {
		this.mdp2 = mdp2;
	}

	public String getErreur() {
		return erreur;
	}

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDroits() {
		return droits;
	}

	public void setDroits(String droits) {
		this.droits = droits;
	}

	public String getMail() {
		return mail;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public int getIduser() {
		return iduser;
	}
	
	


	public Resolution edit() {
		if((this.mdp1==null) || (this.mdp2==null)){
    		this.erreur="Veuillez vérifier vos mots de passe";
    		this.mdp1="";
    		this.mdp2="";
    	}
		System.out.println(this.droits+this.iduser+this.mail+this.pseudo);
		ForumBeanManager fbm = new ForumBeanManager();
		String email = this.mail;
		Boolean b;
		Utilisateur utr = fbm.getuseerbyid(this.iduser);
		if(utr.getMail().compareTo(this.mail)!=0){
		b = fbm.checkmaildispo(email);
		}else{
			b=false;
			}
    	Boolean e = Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$", email);
    	if(e==false){
    		this.erreur="l'e-mail n'est pas valide";
    		return new RedirectResolution("/modifuser.jsp").flash(this);	
    		
    	}else if(this.mdp1.compareTo(this.mdp2)!=0){
    		this.erreur="Veuillez vérifier vos mots de passe";
    		return new RedirectResolution("/modifuser.jsp").flash(this);
    	}else if(b==true){

        	this.erreur = "l'e-mail existe deja veuillez vérifier celui-ci";
        	return new RedirectResolution("/modifuser.jsp").flash(this);	
        	}

		
    	if((b==false) && (this.mail.compareTo("")!=0) && (this.pseudo.compareTo("")!=0)&& (this.mdp1.compareTo(this.mdp2)==0)){
		Utilisateur u = new Utilisateur();
		Droit d = fbm.getDroitbystring(this.droits);
		u.setIdUtilisateur(this.iduser);
		u.setDroit(d);
		u.setMail(this.mail);
		
		
		if((this.mdp1.compareTo("")!=0)){
			MD5Password md5 = new MD5Password();
			 String encodedPassword = md5.getEncodedPassword(this.mdp1);
			 u.setMotDePasse(encodedPassword);
		}
		
		u.setPseudo(this.pseudo);
		fbm.updateuseer(u);
		
        	return new RedirectResolution("/admin.jsp");
    	}else if(this.pseudo.compareTo("")==0){
            this.erreur = "veuillez rentrer un pseudo";
            return new RedirectResolution("/modifuser.jsp").flash(this);
        
    	}else{
    		System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee\n\n");
    		return new RedirectResolution("/modifuser.jsp").flash(this);
    	}
    	
	}
  
	
	

}
