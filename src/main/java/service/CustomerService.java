package service;

import java.util.List;

import dto.CustomerDTO;

/**
 * Ce service fournit des méthodes permettant d'effectuer des traitements sur
 * les données qui lui sont envoyées. Les services font parties de la couche
 * Service.
 * 
 * Afin de faciliter l'injection de dépendance grâce à Spring, on préferera
 * définir une interface de type dont le nom est <nom_de_l'entité>Service et
 * dont l'implémentation sera <nom_de_l'entité>ServiceImpl.
 * 
 * Les services ont un statut particulier car ils manipulent deux types d'objets
 * gérant les données : les objets entité qui référencent des tables en base de
 * données (ici Customer) et des objets DTO qui permettent de faire transiter
 * les données vers la couche de présentation (ici CustomerDTO).
 *
 */
public interface CustomerService {

	/**
	 * Cette méthode permet de récupérer la liste de tous les clients existants
	 * en base de données.
	 * 
	 * @return
	 */
	public List<CustomerDTO> listCustomer();

	public List<CustomerDTO> listCustomerByName(final String name);

	public void deleteCustomer(final Long customerId);

	public CustomerDTO getCustomerById(final Long customerId);

	/**
	 * Cette méthode permet d'enregistrer un client en base de données. Le
	 * client donné en paramètre est converti en objet entité qui sera ensuite
	 * envoyé au DAO correspondant pour qu'il soit persisté en base. Si celui-ci
	 * existait déjà, on ne fait que mettre à jours ses différents champs
	 * 
	 * @param customerDTO
	 */
	public void saveCustomer(final CustomerDTO customer);

	public void saveCustomerWithOrder(final CustomerDTO customer);

	public void deleteOrderById(final Long orderCustomerId);
}