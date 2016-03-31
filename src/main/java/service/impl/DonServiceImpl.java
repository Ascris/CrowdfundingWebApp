package service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import model.Don;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.DonService;
import dao.DonDAO;
import dto.DonDTO;

@Service
@Transactional
public class DonServiceImpl implements DonService {

	@Autowired
	private DonDAO DonDAO;

	public List<DonDTO> listDon() {

		final List<Don> list = DonDAO.listDon();
		final List<DonDTO> listDTO = new ArrayList<DonDTO>();
		for (Don c : list) {
			listDTO.add(c.entity2Bean());
		}
		return listDTO;
	}

	public List<DonDTO> listDonByName(final String name) {
		final List<Don> list = DonDAO.findByName(name);
		final List<DonDTO> listBean = new ArrayList<DonDTO>();
		for (Don p : list) {
			listBean.add(p.entity2Bean());
		}
		return listBean;
	}

	public void deleteDon(final Long projetId) {
		DonDAO.removeById(projetId);
	}

	public DonDTO getDonById(final Long projetId) {
		final Don projet = DonDAO.find(projetId);
		if (projet != null) {
			return projet.entity2Bean();
		}
		return null;
	}

	public void saveDon(final DonDTO projet) {
		if (projet != null) {
			final Don p = projet.DTO2Entity();
			DonDAO.save(p);
		}
	}

	public DonDAO getDonDAO() {
		return DonDAO;
	}

	public void setDonDAO(DonDAO projetDAO) {
		DonDAO = projetDAO;
	}

}