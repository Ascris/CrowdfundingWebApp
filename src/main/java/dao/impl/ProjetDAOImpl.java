package dao.impl;
import java.util.List;

import javax.transaction.Transactional;

import model.Projet;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import dao.ProjetDAO;

@Repository
@Transactional
public class ProjetDAOImpl extends GenericDAOImpl<Projet, Long> implements ProjetDAO {

	public List<Projet> listProjet() {
		return this.findAll();
	}

	@SuppressWarnings("unchecked")
	public List<Projet> findByName(final String name) {
		final Query query = getSession().getNamedQuery("Projet.findByName");
		query.setParameter("name", name);
		return (List<Projet>) query.list();
	}
	
	 @Autowired
     @Override
     public void setSessionFactory(SessionFactory sessionFactory) {
             super.setSessionFactory(sessionFactory);
     }
}
