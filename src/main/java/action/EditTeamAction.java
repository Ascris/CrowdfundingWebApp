package action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.TeamService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dto.TeamDTO;

@Controller
public class EditTeamAction extends ActionSupport {

	private static final long serialVersionUID = 7728872521602025772L;

	private static final String SUCCESS = "success";
	private TeamDTO team;

	@Autowired
	private TeamService teamService;

	public String editTeam() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
				ServletActionContext.HTTP_REQUEST);
		try {
			final String projetIdString = request.getParameter("teamId");
			if (projetIdString != null) {
				final Long teamId = Long.parseLong(projetIdString);
				if (teamId != null) {
					team = teamService.getTeamById(teamId);

				}
			}
		} catch (final Exception e) {
		}
		if (team == null) {
			team = new TeamDTO();
		}
		return SUCCESS;
	}

	public String saveTeam() throws Exception {
	
		teamService.saveTeam(team);

		return SUCCESS;
	}

}
