package action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.ProjetService;

import com.opensymphony.xwork2.ActionSupport;

import dto.ProjetDTO;

@Controller
public class ListProjetAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6874495899552728610L;

	private static final String SUCCESS = "success";

	private List<ProjetDTO> projetList = new ArrayList<ProjetDTO>();
	private ProjetDTO projet;
	private Long projetId;

	@Autowired
	private ProjetService projetService;

	public String listProjet() {

		projetList = projetService.listProjet();

		return SUCCESS;
	}

	public String deleteProjet() {
		if (projetId != null) {
			projetService.deleteProjet(projetId);
		}
		return SUCCESS;
	}
// TODO
	/*
	public String addCustomer() {
		if (customerId != null) {
			for (final CustomerDTO customer : customerList) {
				if (customer.getCustomerId() == customerId) {
					final OrderCustomerDTO orderCustomer = new OrderCustomerDTO();
					orderCustomer.setOrderDate(new Date());
					customer.getOrderCustomers().add(orderCustomer);
					customerService.saveCustomerWithOrder(customer);
					break;
				}
			}
		}
		return SUCCESS;
	}*/

	public List<ProjetDTO> getProjetList() {
		return projetList;
	}

	public void setProjetList(List<ProjetDTO> projetList) {
		this.projetList = projetList;
	}

	public ProjetDTO getProjet() {
		return projet;
	}

	public void setProjet(ProjetDTO projet) {
		this.projet = projet;
	}

	public Long getProjetId() {
		return projetId;
	}

	public void setProjetId(Long projetId) {
		this.projetId = projetId;
	}

	public ProjetService getProjetService() {
		return projetService;
	}

	public void setProjetService(ProjetService projetService) {
		this.projetService = projetService;
	}

}
