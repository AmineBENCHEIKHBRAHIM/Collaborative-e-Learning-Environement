// default package
// Generated 11 mai 2010 15:55:17 by Hibernate Tools 3.2.4.GA
package Domain;

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class UtilisateurConnecter.
 * @see .UtilisateurConnecter
 * @author Hibernate Tools
 */
public class UtilisateurConnecterHome {

	private static final Log log = LogFactory.getLog(UtilisateurConnecterHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(UtilisateurConnecter transientInstance) {
		log.debug("persisting UtilisateurConnecter instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(UtilisateurConnecter instance) {
		log.debug("attaching dirty UtilisateurConnecter instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UtilisateurConnecter instance) {
		log.debug("attaching clean UtilisateurConnecter instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(UtilisateurConnecter persistentInstance) {
		log.debug("deleting UtilisateurConnecter instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UtilisateurConnecter merge(UtilisateurConnecter detachedInstance) {
		log.debug("merging UtilisateurConnecter instance");
		try {
			UtilisateurConnecter result = (UtilisateurConnecter) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UtilisateurConnecter findById(java.lang.Integer id) {
		log.debug("getting UtilisateurConnecter instance with id: " + id);
		try {
			UtilisateurConnecter instance = (UtilisateurConnecter) sessionFactory
					.getCurrentSession().get("UtilisateurConnecter", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<UtilisateurConnecter> findByExample(UtilisateurConnecter instance) {
		log.debug("finding UtilisateurConnecter instance by example");
		try {
			List<UtilisateurConnecter> results = (List<UtilisateurConnecter>) sessionFactory
					.getCurrentSession().createCriteria("UtilisateurConnecter").add(
							create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
