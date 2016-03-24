package dto;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Customer;
import model.OrderCustomer;

/**
 * CustomerDTO est un objet DTO (Data Transfer Object) qui permet de faire
 * transiter les données d'une couche à une autre, ici de la couche service à la
 * couche présentation. Cette classe est donc le reflet de l'objet entité
 * {@link Customer}.
 * 
 * Ce genre de classe est appelé POJO (Plain Old Java Object). Utiliser ces DTO
 * permet d'obtenir des objets n'implémentant plus certaines interfaces ou
 * frameworks.
 * 
 * Dans notre cas, l'utilisation d'un DTO nous permet de remonter des données
 * dans la couche de Présentation sans qu'elles ne soient liées à la couche de	
 * Persistance et donc à Hibernate (on ne trouve par exemple plus aucune
 * annotation liées comme @Entity, @Column, etc.)
 *
 */
public class CustomerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6876955142634710433L;

	private Long customerId;

	private String name;

	private String address;

	private Date createdDate;
	
	private String username;

	private String prenom;
	
	private String mdp;
	
	private String mail;
	
	private String pathImg;

	private List<OrderCustomerDTO> orderCustomers;

	public CustomerDTO() {
	}

	public CustomerDTO(final Long customerId, final String name, final String address,
			final Date createdDate, final String username, final String prenom, final String mdp,
			final String mail) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.createdDate = createdDate;
		this.username = username;
		this.prenom = prenom;
		this.mdp = mdp;
		this.mail = mail;
	}

	public CustomerDTO(final Long customerId, final String name, final String address,
			final Date createdDate, final String username, final String prenom, final String mdp,
			final String mail, final List<OrderCustomerDTO> orderCustomers) {
		this(customerId, name, address, createdDate, username, prenom, mdp, mail);
		this.orderCustomers = orderCustomers;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(final Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public String getFormatCreatedDate() {
		final DateFormat df = new SimpleDateFormat("d/M/y");
		return df.format(createdDate);
	}

	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<OrderCustomerDTO> getOrderCustomers() {
		return orderCustomers;
	}

	public void setOrderCustomers(List<OrderCustomerDTO> orderCustomers) {
		this.orderCustomers = orderCustomers;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPathImg() {
		return pathImg;
	}

	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}

	/**
	 * Cette méthode permet de convertir un dto en entité. Cette méthode sera
	 * donc souvent appelé lorsqu'une donnée se trouvant dans la couche
	 * Présentation doit atteindre la couche Persistance.
	 * 
	 * @return
	 */
	public Customer DTO2Entity() {
		return new Customer(this.customerId, this.name, this.address, this.createdDate,
				this.username, this.prenom, this.mdp, this.mail);
	}

	public Customer DTO2EntityWithOrder() {
		final List<OrderCustomer> orderCustomersEntity = new ArrayList<OrderCustomer>();
		if (orderCustomers != null && orderCustomers.size() > 0) {
			for (final OrderCustomerDTO orderCustomer : orderCustomers) {
				orderCustomersEntity.add(new OrderCustomer(orderCustomer.getOrderCustomerId(),
						orderCustomer.getOrderDate()));
			}
		}
		return new Customer(this.customerId, this.name, this.address, this.createdDate,
				this.username, this.prenom, this.mdp, this.mail, orderCustomersEntity);
	}
}
