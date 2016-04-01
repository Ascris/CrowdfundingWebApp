package action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.DonService;
import service.ProjetService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dto.DonDTO;

@Controller
public class EditDonAction extends ActionSupport {

	private static final long serialVersionUID = 7728872521602025772L;

	private static final String SUCCESS = "success";

	private DonDTO don;

	@Autowired
	private DonService donService;
	
	@Autowired
	private ProjetService projetService;

	public String editDon() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
				ServletActionContext.HTTP_REQUEST);
		try {
			final String donIdString = request.getParameter("donId");
			if (donIdString != null) {
				final Long donId = Long.parseLong(donIdString);
				if (donId != null) {
					don = donService.getDonById(donId);
				}
			}
		} catch (final Exception e) {
			don = new DonDTO();
		}
		
		try {
			final String projetIdString = request.getParameter("projetId");
			if (projetIdString != null) {
				final Long projetId = Long.parseLong(projetIdString);
				if (projetId != null) {
					don.setProjet(projetService.getProjetById(projetId).getProjetId().toString());
				}
			}
		} catch (final Exception e) {
		}
		don.setCustomer(Double.toString(MySessionAction.getUser().getCustomerId()));
		return SUCCESS;
	}

	@SuppressWarnings("deprecation")
	public String saveDon() throws Exception {
		don.setCustomer(Double.toString(MySessionAction.getUser().getCustomerId()));
		donService.saveDon(don);

		return SUCCESS;
	}

	public DonDTO getDon() {
		return don;
	}

	public void setDon(final DonDTO don) {
		this.don = don;
	}

	public DonService getDonService() {
		return donService;
	}

	public void setDonService(final DonService donService) {
		this.donService = donService;
	}
}
