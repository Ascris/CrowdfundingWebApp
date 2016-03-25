package service;

import java.util.List;

import dto.ProjetDTO;

public interface ProjetService {

	public List<ProjetDTO> listProjet();

	public List<ProjetDTO> listProjetByName(final String name);

	public void deleteProjet(final Long projetId);

	public ProjetDTO getProjetById(final Long projetId);

	public void saveProjet(final ProjetDTO projet);
}