package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="commandeclients")
public class CommandeClients implements Serializable{

	@Id
	@GeneratedValue
	private Long idCommandeClients;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Clients clients;
	
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;

	public Long getIdCommandeClients() {
		return idCommandeClients;
	}

	public String getCode() {
		return code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public Clients getClients() {
		return clients;
	}

	public List<LigneCommandeClient> getLigneCommandeClients() {
		return ligneCommandeClients;
	}

	public void setIdCommandeClients(Long idCommandeClients) {
		this.idCommandeClients = idCommandeClients;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}
	
	
}
