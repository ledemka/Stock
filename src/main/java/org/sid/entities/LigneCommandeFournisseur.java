package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ligne_commande_fournisseur")
public class LigneCommandeFournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneCommandeClients;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeClients commandeFournisseur;

	public Long getIdLigneCommandeClients() {
		return idLigneCommandeClients;
	}

	public Article getArticle() {
		return article;
	}

	public CommandeClients getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setIdLigneCommandeClients(Long idLigneCommandeClients) {
		this.idLigneCommandeClients = idLigneCommandeClients;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public void setCommandeFournisseur(CommandeClients commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	
	
}
