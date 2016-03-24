package action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.CustomerService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dto.CustomerDTO;

/**
 * Cette classe fournit les différentes actions disponibles pour la page
 * editCustomer.jsp
 * 
 * Ainsi, cette classe correspond au controlleur de la couche présentation.
 * 
 * !!ATTENTION!! Les méthodes des classes Action ne peuvent appeler que des
 * méthodes de la couche Service ! Il est formellement interdit d'appeler une
 * méthode d'un DAO dans la couche présentation !!
 *
 */
@Controller
public class EditCustomerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7728872521602025772L;

	private static final String SUCCESS = "success";

	private CustomerDTO customer;

	/*
	 * Cette annotation permet à Spring d'injecter une dépendance à cette
	 * classe. Spring se chargera alors d'initialiser CustomerService, puis
	 * d'utiliser setCustomerService() afin de l'injecter dans cette classe.
	 * Ceci n'est néanmoins possible que si la classe CustomerService est
	 * effectivement détecté comme étant un bean par Spring, ce qui est possible
	 * en utilisant l'annotation @Service
	 */
	@Autowired
	private CustomerService customerService;

	public String editCustomer() {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
				ServletActionContext.HTTP_REQUEST);
		try {
			/*
			 * On récupère dans la requete le paramètre customerId. S'il existe
			 * un utilisateur pour cet id, alors on doit éditer cet utilisateur.
			 * Sinon, cela signifie que l'on doit en créer un nouveau.
			 */
			final String customerIdString = request.getParameter("customerId");
			if (customerIdString != null) {
				final Long customerId = Long.parseLong(customerIdString);
				if (customerId != null) {
					customer = customerService.getCustomerById(customerId);

				}
			}
		} catch (final Exception e) {
		}
		if (customer == null) {
			customer = new CustomerDTO();
		}
		return SUCCESS;
	}

	/**
	 * Cette méthode est une action (définie dans struts.xml) qui permet de
	 * sauvegarder le client courrant. Cette action étant appelé lors de la
	 * validation du formulaire de la page customer.jsp, l'instance de customer
	 * contiendra les données du formulaire
	 * 
	 * @return
	 * @throws Exception
	 */
	public String saveCustomer() throws Exception {
		if (customer.getCustomerId() == null) {
			/*
			 * Si l'utilisateur ne possède pas d'id, cela signifie qu'il
			 * n'existe pas encore en base de donnée, on doit donc lui affecter
			 * la date de création
			 */
			customer.setCreatedDate(new Date());
		}
		/*
		 * On envoie le customer à la couche service afin qu'il soit enregistré
		 */
		customerService.saveCustomer(customer);

		/*
		 * On suppose ici que le traitement est réussi, on renvoie donc
		 * "success". Si on voulait faire intervenir une gestion d'erreur plus
		 * poussée, il suffirait de créer de nouveau message puis de définir le
		 * comportement attendu dans le struts.xml. On pourrait par exemple
		 * créer une page error.jsp
		 */
		return SUCCESS;
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
