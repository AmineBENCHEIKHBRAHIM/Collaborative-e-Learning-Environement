package Controllers;
import java.util.regex.Pattern;

import cryptage.MD5Password;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;
import DAO.ForumBeanManager;
import Domain.Droit;
import Domain.Utilisateur;


public class RedirectActionBean extends ForumActionBean{
	private int iduser;
	private String pseudo;
	private String mail;
	private String erreur;
	

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public int getIduser() {
		return iduser;
	}
	
	public Resolution modif() {
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		ForumBeanManager fbm = new ForumBeanManager();
		Utilisateur u = fbm.getuseerbyid(this.iduser);
		this.setMail(u.getMail());
		this.setPseudo(u.getPseudo());
		
        	return new RedirectResolution("/modifuser.jsp").flash(this);	
        }
	public Resolution suppr() {
		ForumBeanManager fbm = new ForumBeanManager();

		fbm.deleteuseerbyid(this.iduser);
		
        	return new RedirectResolution("/admin.jsp");	
        }	

	public void setErreur(String erreur) {
		this.erreur = erreur;
	}

	public String getErreur() {
		return erreur;
	}
	
}
