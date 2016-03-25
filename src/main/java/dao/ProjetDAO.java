package dao;

import java.util.List;

import model.Projet;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

public interface ProjetDAO extends GenericDAO<Projet, Long> {
	
	public List<Projet> listProjet();

	List<Projet> findByName(final String name);
}