package dao.impl;
import java.util.List;

import javax.transaction.Transactional;

import model.Don;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import dao.DonDAO;

@Repository
@Transactional
public class DonDAOImpl extends GenericDAOImpl<Don, Long> implements DonDAO {

	public List<Don> listDon() {
		return this.findAll();
	}

	@SuppressWarnings("unchecked")
	public List<Don> findByName(final String name) {
		final Query query = getSession().getNamedQuery("Don.findByName");
		query.setParameter("name", name);
		return (List<Don>) query.list();
	}
	
	 @Autowired
     @Override
     public void setSessionFactory(SessionFactory sessionFactory) {
             super.setSessionFactory(sessionFactory);
     }
}
