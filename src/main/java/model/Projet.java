package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import dto.ProjetDTO;

@Entity
@Table(name = "Projet")
@NamedQueries({@NamedQuery(name = "Projet.findByName", query = "from Projet p where p.name = :name")})

public class Projet implements Serializable {

	private static final long serialVersionUID = 1710234886606599946L;

	@Id
	@Column(name = "projetId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projetId;
	
	@Column(name = "name")
	private String name;

	@Column(name = "somme_demande")
	private Float somme_demande;
	
	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "date_fin")
	private Date date_fin;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "path_img")
	private String path_img;	

	@Column(name = "category")
	private String category;
	
	public Projet() {}
	public Projet(Long projetId, String name, Float somme_demande, Date date_debut, Date date_fin, String description,
			String category) {
		super();
		this.projetId = projetId;
		this.name = name;
		this.somme_demande = somme_demande;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.description = description;
		this.category = category;
	}

	public ProjetDTO entity2Bean() {
		return new ProjetDTO(this.projetId, this.name, this.somme_demande, this.date_debut, this.date_fin, this.description, this.category);
	}

	public Long getProjetId() {
		return projetId;
	}

	public void setProjetId(Long projetId) {
		this.projetId = projetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSomme_demande() {
		return somme_demande;
	}

	public void setSomme_demande(Float somme_demande) {
		this.somme_demande = somme_demande;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath_img() {
		return path_img;
	}

	public void setPath_img(String path_img) {
		this.path_img = path_img;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getResume(){
		return description.substring(0, 300)+"...";
	}
	
}
