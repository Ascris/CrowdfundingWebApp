package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import dto.TeamDTO;

@Entity
@Table(name = "Team")
@NamedQueries({@NamedQuery(name = "Team.findByName", query = "from Team t where t.name = :name")})
public class Team implements Serializable {

	private static final long serialVersionUID = 1710234886606599946L;

	@Id
	@Column(name = "teamId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long teamId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;	
	
	@Column(name = "address")
	private String address;	
	
	@Column(name = "mail")
	private String mail;
	
//TODO
	/*
	@ManyToOne
	@JoinColumn(name="customerId")	 
	private Customer customer;
	*/
	
	public Team() {}

	public Team(final String address, final String description, final String mail, final String name) {
		this.name = name;
		this.address = address;
		this.mail = mail;
		this.description = description;
	}

	public Team(final Long teamId,final String address, final String description, final String mail, final String name) {
		this(name, address, mail, description);
		this.teamId = teamId;
	}

	public TeamDTO entity2Bean() {
		return new TeamDTO(this.teamId, this.address, this.description, this.mail,this.name);
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
