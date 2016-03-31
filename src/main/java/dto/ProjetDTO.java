package dto;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Projet;

public class ProjetDTO implements Serializable {

	private static final long serialVersionUID = 6876955142634710433L;

	private Long projetId;

	private String name;

	private Float somme_demande;
	
	private Date date_debut;
	
	private Date date_fin;
	
	private String description;
	
	private String path_img;

	private String category;

	public ProjetDTO() {}

	public ProjetDTO(final Long projetId, final String name, final Float somme_demande,
			final Date date_debut, final Date date_fin, final String description) {
		this.projetId = projetId;
		this.name = name;
		this.somme_demande = somme_demande;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.description = description;
	}

	public Projet DTO2Entity() {
		return new Projet(this.projetId, this.name, this.somme_demande, this.date_debut, this.date_fin, this.description);
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
	
	public String getFormatDate_debut() {
		final DateFormat df = new SimpleDateFormat("d/M/y");
		return df.format(date_debut);
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}
	
	public String getFormatDate_fin() {
		final DateFormat df = new SimpleDateFormat("d/M/y");
		return df.format(date_fin);
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

}