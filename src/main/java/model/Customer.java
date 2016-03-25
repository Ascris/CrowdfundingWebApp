package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import dto.CustomerDTO;
import dto.OrderCustomerDTO;

/**
 * Cette classe est une entité référençant la table Customer (cf
 * database/customer.sql) se trouvant en base de données. Grâce au mapping
 * d'Hibernate, les différents attributs sont reconnus comme correspondant aux
 * colonnes associées.
 * 
 * Une instance non enregistrée en base de donnée sera donc une instance de cet
 * objet qui n'a pas d'équivalence en base de données.
 * 
 * De plus, on fournit en début de classe des requêtes nommées, qui pourront
 * être appelée dans le DAO grâce à la méthode createNamedQuery(nomRequete).
 * L'avantage de définir les requêtes de cette façon est qu'elles sont
 * précompilées lors du lancement du serveur, alors qu'une requête "en dur" dans
 * le code ne sera compilée que lors de son execution. Ainsi, si une
 * modification de la structure rend incorrect une requête, on le saura
 * immédiatement !
 *
 */
@Entity
@Table(name = "Customer")
@NamedQueries({
		@NamedQuery(name = "Customer.findByName", query = "from Customer c where c.name = :name"),
		@NamedQuery(name = "Customer.findByAdress", query = "from Customer c where c.address = :address"),
		@NamedQuery(name = "Customer.findByUsernameAndMdp", query = "from Customer c where c.mdp = :mdp and c.username = :username"),
		@NamedQuery(name = "Customer.findByNameAndAddress", query = "from Customer c where c.address = :address and c.name = :name"),
		@NamedQuery(name = "Customer.findByOrderCustomerId", query = "select c from Customer c join c.orderCustomers as o where o is not empty and o.orderCustomerId = :orderCustomerId")})
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1710234886606599946L;

	/*
	 * customerId est ici noté comme étant une clef primaire grâce à @Id, qui
	 * correspond à la colonne customerId grâce à @Column et finalement, qu'elle
	 * est générée grâce à @GeneratedValue.
	 * 
	 * L'annotation @Column est facultative si le nom de l'attribut correspond
	 * au nom de la colonne. Dans notre cas, toutes les annotations @Column
	 * auront donc pu être supprimées.
	 */
	@Id
	@Column(name = "customerId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "mdp")
	private String mdp;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "pathImg")
	private String pathImg;

	/*
	 * Ici, on indique un lien de type one-to-many entre Customer et
	 * OrderCustomer. Grâce à cascade, on indique qu'il faut persister en
	 * cascade (ainsi, lorsqu'on sauvegarde un client, si une de ces commandes à
	 * été modifiée, celle-ci est sauvegardée en même temps.
	 */
	@OneToMany(mappedBy = "customer", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<OrderCustomer> orderCustomers;

	public Customer() {

	}

	public Customer(final String name, final String address, final Date createdDate,
			final String username, final String prenom, final String mdp, final String mail) {
		this.name = name;
		this.address = address;
		this.createdDate = createdDate;
		this.prenom = prenom;
		this.mdp = mdp;
		this.mail = mail;
		this.username = username;
	}

	public Customer(final Long customerId, final String name, final String address,
			final Date createdDate, final String username, final String prenom, final String mdp, final String mail) {
		this(name, address, createdDate, username, prenom, mdp, mail);
		this.customerId = customerId;
	}

	public Customer(final Long customerId, final String name, final String address,
			final Date createdDate, final String username, final String prenom, final String mdp, final String mail,
			final List<OrderCustomer> orderCustomers) {
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

	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPathImg() {
		return pathImg;
	}

	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}

	public List<OrderCustomer> getOrderCustomers() {
		return orderCustomers;
	}

	public void setOrderCustomers(List<OrderCustomer> orderCustomers) {
		this.orderCustomers = orderCustomers;
	}

	public CustomerDTO entity2Bean() {
		return new CustomerDTO(this.customerId, this.name, this.address, this.createdDate,
				this.username, this.prenom, this.mdp, this.mail);
	}

	public CustomerDTO entity2BeanWithOrder() {
		final List<OrderCustomerDTO> orderCustomersDTO = new ArrayList<OrderCustomerDTO>();
		if (orderCustomers != null && orderCustomers.size() > 0) {
			for (final OrderCustomer orderCustomer : orderCustomers) {
				orderCustomersDTO.add(new OrderCustomerDTO(orderCustomer.getOrderCustomerId(),
						orderCustomer.getOrderDate()));
			}
		}
		return new CustomerDTO(this.customerId, this.name, this.address, this.createdDate,
				this.username, this.prenom, this.mdp, this.mail, orderCustomersDTO);
	}
}
