package service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import model.Projet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.ProjetService;
import dao.ProjetDAO;
import dto.ProjetDTO;

@Service
@Transactional
public class ProjetServiceImpl implements ProjetService {

	@Autowired
	private ProjetDAO ProjetDAO;

	public List<ProjetDTO> listProjet() {

		final List<Projet> list = ProjetDAO.listProjet();
		final List<ProjetDTO> listDTO = new ArrayList<ProjetDTO>();
		for (Projet c : list) {
			listDTO.add(c.entity2Bean());
		}
		return listDTO;
	}

	public List<ProjetDTO> listProjetByName(final String name) {
		final List<Projet> list = ProjetDAO.findByName(name);
		final List<ProjetDTO> listBean = new ArrayList<ProjetDTO>();
		for (Projet p : list) {
			listBean.add(p.entity2Bean());
		}
		return listBean;
	}

	public void deleteProjet(final Long projetId) {
		ProjetDAO.removeById(projetId);
	}

	public ProjetDTO getProjetById(final Long projetId) {
		final Projet projet = ProjetDAO.find(projetId);
		if (projet != null) {
			return projet.entity2Bean();
		}
		return null;
	}

	public void saveProjet(final ProjetDTO projet) {
		if (projet != null) {
			final Projet p = projet.DTO2Entity();
			ProjetDAO.save(p);
		}
	}

	public ProjetDAO getProjetDAO() {
		return ProjetDAO;
	}

	public void setProjetDAO(ProjetDAO projetDAO) {
		ProjetDAO = projetDAO;
	}

}