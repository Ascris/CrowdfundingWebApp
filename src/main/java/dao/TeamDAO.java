package dao;

import java.util.List;

import model.Team;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

public interface TeamDAO extends GenericDAO<Team, Long> {
	
	public List<Team> listTeam();

	List<Team> findByName(final String name);

	//public Customer findByOrder(final Long orderCustomerId);
}
