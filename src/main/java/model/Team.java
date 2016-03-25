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

	public Team(final String name, final String adress, final String mail, final String description) {
		this.name = name;
		this.address = adress;
		this.mail = mail;
		this.description = description;
	}

	public Team(final Long teamId,final String name, final String adress, final String mail, final String description) {
		this(name, adress, mail, description);
		this.teamId = teamId;
	}

	public TeamDTO entity2Bean() {
		return new TeamDTO(this.teamId, this.name, this.address, this.mail,this.description);
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

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
