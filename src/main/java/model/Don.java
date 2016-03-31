package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import dto.DonDTO;
import dto.OrderCustomerDTO;

@Entity
public class Don {
	@Id
	@Column(name = "donId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long donId;
	
	@Column(name = "customer")
	private String customer;
	
	@Column(name = "projet")
	private String projet;
	
	@Column(name = "don")
	private Double don;

	public Double getDon() {
		return don;
	}
	
	public Don(){}
	
	public Don(Long donId, String customer, String projet, Double don) {
		super();
		this.donId = donId;
		this.customer = customer;
		this.projet = projet;
		this.don = don;
	}



	public void setDon(Double don) {
		this.don = don;
	}

	public Long getDonId() {
		return donId;
	}

	public void setDonId(Long donId) {
		this.donId = donId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProjet() {
		return projet;
	}

	public void setProjet(String projet) {
		this.projet = projet;
	}
	
	public DonDTO entity2Bean() {
		return new DonDTO(this.donId,this.customer,this.projet,this.don);
	}
	
	
	
}
