package service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import model.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.TeamService;
import dao.TeamDAO;
import dto.TeamDTO;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamDAO teamDAO;

	public List<TeamDTO> listTeam() {

		final List<Team> list = teamDAO.listTeam();
		final List<TeamDTO> listDTO = new ArrayList<TeamDTO>();
		for (Team c : list) {
			listDTO.add(c.entity2Bean());
		}
		return listDTO;
	}

	public List<TeamDTO> listTeamByName(final String name) {
		final List<Team> list = teamDAO.findByName(name);
		final List<TeamDTO> listBean = new ArrayList<TeamDTO>();
		for (Team c : list) {
			listBean.add(c.entity2Bean());
		}
		return listBean;
	}

	public void deleteTeam(final Long teamId) {
		final Team team = teamDAO.find(teamId);
		teamDAO.removeById(teamId);
	}

	public TeamDTO getTeamById(final Long teamId) {
		final Team team = teamDAO.find(teamId);
		if (team != null) {
			return team.entity2Bean();
		}
		return null;
	}

	public void saveTeam(final TeamDTO team) {
		if (team != null) {
			final Team c = team.DTO2Entity();
			teamDAO.save(c);
		}
	}

	public TeamDAO getTeamDAO() {
		return teamDAO;
	}

	public void setTeamDAO(TeamDAO teamDAO) {
		this.teamDAO = teamDAO;
	}
	

}