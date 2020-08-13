package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="vente")
public class Vente implements Serializable{

	@Id
	@GeneratedValue
	private Long idVente;
	
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;
	
	@OneToMany(mappedBy="vente")
	List<LigneVente> ligneVentes;

	public Long getIdVente() {
		return idVente;
	}

	public String getCode() {
		return code;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
	
}
