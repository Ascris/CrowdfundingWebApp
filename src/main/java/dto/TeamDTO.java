package dto;

import java.io.Serializable;

import model.Team;

public class TeamDTO implements Serializable {

	private static final long serialVersionUID = 6876955142634710433L;

	private Long teamId;

	private String name;

	private String address;
	
	private String description;
	
	private String mail;

	//private List<OrderCustomerDTO> orderCustomers;

	public TeamDTO() {
	}

	public TeamDTO(final Long teamId, final String name, final String address, final String description, final String mail) {
		this.teamId = teamId;
		this.name = name;
		this.address = address;
		this.description = description;
		this.mail = mail;
	}

	public Team DTO2Entity() {
		return new Team(this.teamId, this.name, this.address, this.description, this.mail);
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
}