package org.sid.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable {

	@Id
	@GeneratedValue
	private Long idArticle;

	private String code;

	private String designation;

	private BigDecimal prixUnitaireHT;

	private BigDecimal tauxTva;

	private BigDecimal prixUnitaireTTC;

	private String photo;

	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;

	public Long getIdArticle() {
		return idArticle;
	}

	public String getCode() {
		return code;
	}

	public String getDesignation() {
		return designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
