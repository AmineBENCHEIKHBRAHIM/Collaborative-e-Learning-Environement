package Domain;

import org.hibernate.Session;
import org.hibernate.Transaction;
 
 
public class App
{
	public App(){
		
	}
    public  void gogo( )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        Transaction tx = session.beginTransaction();
        
        Utilisateur u = new Utilisateur();
        u.setIdUtilisateur(9);
        u.setPseudo("oikoijio");
        Droit d = new Droit();
        d.setIdDroit(1);
        u.setDroit(d);
        u.setSession("jiihiu");
        session.save(u);
        
        tx.commit();
        session.close();
  }
}