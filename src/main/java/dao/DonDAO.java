package dao;

import java.util.List;

import model.Don;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

public interface DonDAO extends GenericDAO<Don, Long> {
	
	public List<Don> listDon();

	List<Don> findByName(final String name);
}