package DAO;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Domain.Discussion;
import Domain.Droit;
import Domain.Groupe;
import Domain.HibernateUtil;
import Domain.Message;
import Domain.Topic;
import Domain.Utilisateur;
import Domain.UtilisateurConnecter;


public class ForumBeanManager {
	
	public boolean isAdmin(Utilisateur u)
	{
		 String d  = this.getdroitbyuser(u);
		 if (d.compareTo("administrateur")==0){
			 return true;
		 }
		 return false;
	}
	
	
	
	public void ajouteruser(Utilisateur u)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		
		session.save(u);
        session.flush();
         tx.commit();
         session.close();
		
	}
	
	public String getdroitbyuser (Utilisateur u)
	{
		String requete = "FROM Utilisateur Where idUtilisateur ="+u.getIdUtilisateur();
    	
     	Session session = HibernateUtil.getSessionFactory().openSession();
     	Query query = session.createQuery(requete);
        List<Utilisateur> utils = ( List<Utilisateur>) query.list();
        Utilisateur ut = utils.get(0);
        Droit d = ut.getDroit();
        String res = d.getDroit();
        session.close();
    	return res;
		
	}


	public Droit getDroitbystring(String s)
	{
		System.out.println(s+"\n\n\n");
		
		String requete = "FROM Droit Where droit LIKE \'"+s+"\'";
    	
     	Session session = HibernateUtil.getSessionFactory().openSession();
     	Query query = session.createQuery(requete);
        List<Droit> droits = ( List<Droit>) query.list();
        Droit d = droits.get(0);
        session.close();
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    	return d;
		
	}
	


	
	public List<Utilisateur> login(String pseudo, String motdepasse){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Utilisateur> results = new ArrayList<Utilisateur>();
		Query query = session.createQuery("FROM Utilisateur Where pseudo LIKE \'"+pseudo +"\' AND mot_de_passe  LIKE '"+motdepasse+"'");
		results = query.list();
		tx.commit();
		session.close();
		return results;
	}
	

	
	public String  updateSession(Utilisateur util){
		// Création, d'une session aléatoire
		String CaractAlea = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    String SessionUtilisateur = "";
	    for(int i=0;i<55;i++)
	    {
	       int k = (int)Math.floor(Math.random() * 62); 
	       SessionUtilisateur += CaractAlea.charAt(k);
	    }
	    try
	    {
	    	System.out.println("\n\n\n NOUVELLE SESSION : "+SessionUtilisateur+"\n\n");
	    	Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			Query query;
			String hql = "UPDATE Utilisateur SET session = :sess WHERE idUtilisateur = "+util.getIdUtilisateur();
			query = session.createQuery(hql);
			 //Ses paramètres
	        query.setParameter("sess", SessionUtilisateur);
	      //Mise à jour
	        query.executeUpdate();
			tx.commit();
			session.close();
			
			return SessionUtilisateur;
	    }
	    catch(HibernateException he){
	    	return null;
	    }
	}
	
	
	public boolean estMembre(String sess)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Utilisateur> results = new ArrayList<Utilisateur>();
		Query query = session.createQuery("FROM Utilisateur WHERE session = '"+sess+"'");
		results = query.list();
		tx.commit();
		session.close();
		if(results.size() == 1)
			return true;
		else
			return false;
	}
	
	
	public Utilisateur getUtilisateur(String sess)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Utilisateur> results = new ArrayList<Utilisateur>();
		Query query = session.createQuery("FROM Utilisateur WHERE session = '"+sess+"'");
		results = query.list();
		tx.commit();
		session.close();
		if(results.size() == 1)
			return results.get(0);
		else
			return null;
	}
	
	
	
	/**
	 * liste des topics
	 * @return
	 */
	
	public List<Groupe> listerGroupes()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Groupe> results = new ArrayList<Groupe>();
		Query query = session.createQuery("FROM Groupe");
		results = query.list();
		tx.commit();
		session.close();
		return results;
	}
	
	
	
	
	public List<Topic> listerTopics()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Topic> results = new ArrayList<Topic>();
		Query query = session.createQuery("FROM Topic");
		results = query.list();
		tx.commit();
		session.close();
		return results;
	}
	/**
	 * 
	 * @return
	 */
	public List<Utilisateur> listeruser()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Utilisateur> results = new ArrayList<Utilisateur>();
		Query query = session.createQuery("FROM Utilisateur");
		results = query.list();

		return results;
	}
	
	
	public List<Message> recupererParents(Set<Message> Messages)
	{
		List<Message> Parents = new ArrayList<Message>();
		for(Message m : Messages)
		{
			// Récupération des parents
			if(m.getParent() == 0)
			{
				Parents.add(m);
			}
		}
		return Parents;
	}
	
	public List<Message> getReponses(int idParent)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Message> Reponses = new ArrayList<Message>();
		Query query = session.createQuery("FROM Message WHERE Parent = "+idParent);
		Reponses = query.list();
		return Reponses;
	}
	
	
	public boolean checkmaildispo(String s){
		System.out.println(s+"\n\n\n");
		Boolean b;
		String requete = "FROM Utilisateur Where mail LIKE \'"+s+"\'";
    	
     	Session session = HibernateUtil.getSessionFactory().openSession();
     	Query query = session.createQuery(requete);
        List<Utilisateur> utils = ( List<Utilisateur>) query.list();
        if(utils.size()==0){
        	b=false;
        }else{
        	b=true;
        }
        session.close();
    	return b;
		
	}
	
	 public Utilisateur getuseerbyid(int id){
		
			
			String requete = "FROM Utilisateur Where idUtilisateur ="+id;
	    	
	     	Session session = HibernateUtil.getSessionFactory().openSession();
	     	Query query = session.createQuery(requete);
	        List<Utilisateur> utils = ( List<Utilisateur>) query.list();
	        Utilisateur u = utils.get(0);
	        session.close();
	    	return u;
	 }
	 
	 public void deleteuseerbyid(int id){
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();	
			String requete = "FROM Utilisateur Where idUtilisateur ="+id;
	    	System.out.println(requete);
	     	Query query = session.createQuery(requete);
	        List<Utilisateur> utils = ( List<Utilisateur>) query.list();
	        Utilisateur u = utils.get(0);
	        Set<Message> lm = u.getMessages();
	        Set<Topic> lt = u.getTopics();

	        for(Message m : lm){
	        	session.delete(m);
	        }
	        for(Topic t : lt){
	        	session.delete(t);
	        }
	        
	        session.delete(u);
	        session.flush();
	        tx.commit();
	        session.close();
	    	
	 }
	 
	 public void updateuseer(Utilisateur u){
	 Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		   Query query;
		   if(u.getMotDePasse()==null){
		   //La requête
		   String hql = "update Utilisateur set pseudo = :pseu , mail = :m, Droit_idDroit=:did  where idUtilisateur = :id";
		         query = session.createQuery(hql);
		         
		         //Ses paramètres
		         query.setParameter("id", u.getIdUtilisateur());
		         query.setParameter("pseu", u.getPseudo());
		         query.setParameter("m", u.getMail());
		         query.setParameter("did", u.getDroit().getIdDroit());
		         
		         
		         //Mise à jour
		         query.executeUpdate();
		   }else if(u.getMotDePasse()!=null){
			   //La requête
			   String hql = "update Utilisateur set pseudo = :pseu , mot_de_passe= :mdp , mail = :m, Droit_idDroit=:did  where idUtilisateur = :id";
			         query = session.createQuery(hql);
			         
			         //Ses paramètres
			         query.setParameter("id", u.getIdUtilisateur());
			         query.setParameter("pseu", u.getPseudo());
			         query.setParameter("m", u.getMail());
			         query.setParameter("did", u.getDroit().getIdDroit());
			         query.setParameter("mdp",u.getMotDePasse() );
			         
			         //Mise à jour
			         query.executeUpdate();
			   
		   }
		         tx.commit();
		         session.close();
	
	 }
	 
	 public ArrayList<String> listerdroit() {
		 	
		 	ArrayList<String> results = new ArrayList<String>();
		 	Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			List<Droit> result1 = new ArrayList<Droit>();
			Query query = session.createQuery("FROM Droit");
			result1 = query.list();
			int i =0;
			for(Droit d : result1){
				results.add(d.getDroit());
			}
			return results;
		 
	 }

	 
	public void ajouterMessage(Message  m)
	{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();	
			session.save(m);
	        session.flush();
	        tx.commit();
	        session.close();
	}
	
	
	public void modifierMessage(Message  m)
	{
		System.out.println(" id :"+m.getId().getIdMessage()+" Titre : "+m.getTitre()+" Message :"+m.getMessage()+ "Date : "+m.getDate());
		
		
		 Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();	
			   Query query;
			   //La requête
			   String hql = "UPDATE Message SET titre = :tit , message = :mess, date = :da WHERE idMessage = :idMess";
			   query = session.createQuery(hql);
			         
			         //Ses paramètres
			         query.setParameter("idMess", m.getId().getIdMessage());
			         query.setParameter("tit",m.getTitre());
			         query.setParameter("mess", m.getMessage());
			         query.setParameter("da",m.getDate());
			         
			   //Mise à jour du message
			   query.executeUpdate();
			   tx.commit();
	  session.close();
	}
	
	public void supprimerMessage(int idMessage)
	{

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		String requete = "FROM Message Where idMessage ="+idMessage;
    	System.out.println(requete);
     	Query query = session.createQuery(requete);
        List<Message> utils = ( List<Message>) query.list();
        Message m = utils.get(0);
        session.delete(m);
        session.flush();
        tx.commit();
        session.close();
	}
	
	
	public Message getMessage(String whichone)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		// dernier message
		Query query = null;
		if(whichone.compareTo("last") == 0)
		{
			 query = session.createQuery("FROM Message ORDER BY idMessage DESC LIMIT 1");	
		}
		// message id précisé
		else{
			try
			{
				int idMessage = Integer.parseInt(whichone);
				if(idMessage != 0)
					query = session.createQuery("FROM Message WHERE idMessage = "+ idMessage);	
			}
			catch(NumberFormatException nbfe){}
			
		}
		java.util.List results = query.list();

		System.out.println(query);
		//On met le resultat dans le res
		for (int i = 0; i < results.size(); i++) {
			Message f =(Message)results.get(i);
			return f;
		}
        tx.commit();
        session.close();
		return null;
	}
	 
	public Topic getTopic(String whichone)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		// dernier message
		Query query = null;
		if(whichone.compareTo("last") == 0)
		{
			 query = session.createQuery("FROM Topic ORDER BY idTopic DESC LIMIT 1");	
		}
		// message id précisé
		else{
			try
			{
				int idTopic = Integer.parseInt(whichone);
				if(idTopic != 0)
					query = session.createQuery("FROM Topic WHERE idTopic = "+ idTopic);	
			}
			catch(NumberFormatException nbfe){}
			
		}
		java.util.List results = query.list();

		System.out.println(query);
		//On met le resultat dans le res
		for (int i = 0; i < results.size(); i++) {
			Topic f =(Topic)results.get(i);
			return f;
		}
        tx.commit();
        session.close();
		return null;
	}
	
	public void creertopic(Topic t){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		session.save(t);
        session.flush();
         tx.commit();
         session.close();
	}
	
	public void creergroupe(Groupe t){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		session.save(t);
        session.flush();
         tx.commit();
         session.close();
	}
	
	public void supprimerTopic(int idTopic)
	{

		// Suppression des messages attachés au topic
		Topic t = this.getTopic(String.valueOf(idTopic));
		if(t != null)
		{
			Set<Message> messages = t.getMessages();
			if(messages != null)
			{
				Iterator itmess = messages.iterator();
				while(itmess.hasNext())
				{
					int idMess =((Message)itmess.next()).getId().getIdMessage();
					this.supprimerMessage(idMess);
				}
			}
			// Puis suppression du topic
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();	
			String requete = "FROM Topic Where idTopic ="+idTopic;
	    	System.out.println(requete);
	     	Query query = session.createQuery(requete);
	        List<Topic> utils = ( List<Topic>) query.list();
	        Topic t2 = utils.get(0);
	        session.delete(t2);
	        session.flush();
	        tx.commit();
	        session.close();
		}
		else
		{
			// Nothing !
		}
	}
	
	
	public int getNbMessages(int idTopic)
	{
		ArrayList<String> results = new ArrayList<String>();
	 	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Message> result1 = new ArrayList<Message>();
		Query query = session.createQuery("FROM Message WHERE Topic_idTopic = "+idTopic + " AND parent = 0");
		result1 = query.list();
		session.close();
		return result1.size();
	}
	
	
	public int getNbReponses(int idTopic)
	{
		ArrayList<String> results = new ArrayList<String>();
	 	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Message> result1 = new ArrayList<Message>();
		Query query = session.createQuery("FROM Message WHERE Topic_idTopic = "+idTopic + " AND parent != 0");
		result1 = query.list();
		session.close();
		return result1.size();
	}
	
	public Message  getLastPost(int idTopic)
	{
		ArrayList<String> results = new ArrayList<String>();
	 	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Message> result1 = new ArrayList<Message>();
		Query query = session.createQuery("FROM Message WHERE Topic_idTopic = "+idTopic + " ORDER BY idMessage DESC LIMIT 1");
		result1 = query.list();
		session.close();
		if(result1.size() == 1)
		{
			return result1.get(0);
		}
		return null;
	}
	
	
	public int  getNbReponsesMessage(int idMessage)
	{
		ArrayList<String> results = new ArrayList<String>();
	 	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Message> result1 = new ArrayList<Message>();
		Query query = session.createQuery("FROM Message WHERE parent = "+idMessage);
		result1 = query.list();
		session.close();
		return result1.size();
	}
	
	public void ajouterUtilisateurConnecté(UtilisateurConnecter  u)
	{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();	
			session.save(u);
	        session.flush();
	        tx.commit();
	        session.close();
	}
	public List<UtilisateurConnecter> listeruserConnecter()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<UtilisateurConnecter> results = new ArrayList<UtilisateurConnecter>();
		Query query = session.createQuery("FROM UtilisateurConnecter");
		results = query.list();

		return results;
	}
	public void deleteuseerConnecter(UtilisateurConnecter s){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();	
		String requete = "FROM UtilisateurConnecter Where mail ='"+s.getMail()+"'";
    	System.out.println(requete);
     	Query query = session.createQuery(requete);
        List<UtilisateurConnecter> utils = ( List<UtilisateurConnecter>) query.list();
        UtilisateurConnecter u = utils.get(0);
       
       

        session.delete(u);
        session.flush();
        tx.commit();
        session.close();
    	
 }
 
	
	public List<Discussion> listerDiscussion()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Discussion> Discussion = new ArrayList<Discussion>();
		Query query = session.createQuery("FROM Discussion ORDER BY  date DESC ");
		Discussion = query.list();
		return Discussion;
	}
	
	////
	 public UtilisateurConnecter getuseerconnecterbyid(long id){
			
			
			String requete = "FROM UtilisateurConnecter Where idUtilisateur ="+id;
	    	
	     	Session session = HibernateUtil.getSessionFactory().openSession();
	     	Query query = session.createQuery(requete);
	        List<UtilisateurConnecter> utils = ( List<UtilisateurConnecter>) query.list();
	        UtilisateurConnecter u = utils.get(0);
	        session.close();
	    	return u;
	 }
	 public void ajouterDiscussion(Discussion u)
		{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();	
			
			session.save(u);
	        session.flush();
	         tx.commit();
	         session.close();
			
		}
}
