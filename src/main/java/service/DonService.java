package service;

import java.util.List;

import dto.DonDTO;

public interface DonService {

	public List<DonDTO> listDon();

	public List<DonDTO> listDonByName(final String name);

	public void deleteDon(final Long projetId);

	public DonDTO getDonById(final Long projetId);

	public void saveDon(final DonDTO projet);
}