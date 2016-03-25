package dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import model.Team;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

import dao.TeamDAO;

@Repository
@Transactional
public class TeamDAOImpl extends GenericDAOImpl<Team, Long> implements TeamDAO {

	public List<Team> listTeam() {
		return this.findAll();
	}

	@SuppressWarnings("unchecked")
	public List<Team> findByName(final String name) {
		final Query query = getSession().getNamedQuery("Team.findByName");
		query.setParameter("name", name);
		return (List<Team>) query.list();
	}
	
	 @Autowired
     @Override
     public void setSessionFactory(SessionFactory sessionFactory) {
             super.setSessionFactory(sessionFactory);
     }
}