package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import dto.CustomerDTO;
import service.CustomerService;

@Controller
public class ConnexionAction {
	
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";
	
	private CustomerDTO customer;
	
	@Autowired
	private CustomerService customerService;
	
	public String connectAction()throws IOException{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
				ServletActionContext.HTTP_REQUEST);
		try {
			/*
			 * On récupère dans la requete le paramètre customerId. S'il existe
			 * un utilisateur pour cet id, alors on doit éditer cet utilisateur.
			 * Sinon, cela signifie que l'on doit en créer un nouveau.
			 */
			final String customerMdp = request.getParameter("customer.mdp");
			final String customerUsername = request.getParameter("customer.username");
			
			customer = customerService.getCustomerByUsernameAndMdp(customerMdp,customerUsername);
			
		} catch (final Exception e) {
		}
		if (customer == null) {
			return ERROR;
		}
		else{
			return SUCCESS;
		}
	}
	
	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(final CustomerDTO customer) {
		this.customer = customer;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(final CustomerService customerService) {
		this.customerService = customerService;
	}
	
	

}
