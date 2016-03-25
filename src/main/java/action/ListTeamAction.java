package action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.TeamService;

import com.opensymphony.xwork2.ActionSupport;

import dto.TeamDTO;

@Controller
public class ListTeamAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6874495899552728610L;

	private static final String SUCCESS = "success";

	private List<TeamDTO> projetList = new ArrayList<TeamDTO>();
	private TeamDTO projet;
	private Long projetId;

	@Autowired
	private TeamService teamService;

	public String listTeam() {

		projetList = teamService.listTeam();

		return SUCCESS;
	}

	public String deleteProjet() {
		if (projetId != null) {
			teamService.deleteTeam(projetId);
		}
		return SUCCESS;
	}


}
