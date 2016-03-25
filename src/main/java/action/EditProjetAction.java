package action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.ProjetService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dto.ProjetDTO;

@Controller
public class EditProjetAction extends ActionSupport {

	private static final long serialVersionUID = 7728872521602025772L;

	private static final String SUCCESS = "success";

	private ProjetDTO projet;

	@Autowired
	private ProjetService projetService;

	public String editProjet() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
				ServletActionContext.HTTP_REQUEST);
		try {
			final String projetIdString = request.getParameter("projetId");
			if (projetIdString != null) {
				final Long projetId = Long.parseLong(projetIdString);
				if (projetId != null) {
					projet = projetService.getProjetById(projetId);

				}
			}
		} catch (final Exception e) {
		}
		if (projet == null) {
			projet = new ProjetDTO();
		}
		return SUCCESS;
	}

	public String saveProjet() throws Exception {
		if (projet.getProjetId() == null) {

			projet.setDate_debut(new Date());
		}
		
		projetService.saveProjet(projet);

		return SUCCESS;
	}

	public ProjetDTO getProjet() {
		return projet;
	}

	public void setProjet(final ProjetDTO projet) {
		this.projet = projet;
	}

	public ProjetService getProjetService() {
		return projetService;
	}

	public void setProjetService(final ProjetService projetService) {
		this.projetService = projetService;
	}
}
