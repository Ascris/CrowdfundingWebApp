package dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import model.Customer;
import model.Don;

public class DonDTO {
	private Long donId;
	
	private String customer;
	
	private String projet;
	
	private Double don;
	
	
	public DonDTO(){}
	
	public DonDTO(Long donId, String customer, String projet, Double don) {
		super();
		this.donId = donId;
		this.customer = customer;
		this.projet = projet;
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

	public Double getDon() {
		return don;
	}

	public void setDon(Double don) {
		this.don = don;
	}
	
	public Don DTO2Entity() {
		return new Don(this.donId,this.customer,this.projet,this.don);
	}
	
	
}
