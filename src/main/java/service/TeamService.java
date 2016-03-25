package service;

import java.util.List;

import dto.TeamDTO;

public interface TeamService {

	public List<TeamDTO> listTeam();

	public List<TeamDTO> listTeamByName(final String name);

	public void deleteTeam(final Long customerId);

	public TeamDTO getTeamById(final Long customerId);

	public void saveTeam(final TeamDTO team);

}