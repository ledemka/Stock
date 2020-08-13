package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lignecommandeclient")
public class LigneCommandeClient implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneCommandeClient;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeClients")
	private CommandeClients commandeClient;

	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}

	public Article getArticle() {
		return article;
	}

	public CommandeClients getCommandeClient() {
		return commandeClient;
	}

	public void setIdLigneCommandeClient(Long idLigneCommandeClient) {
		this.idLigneCommandeClient = idLigneCommandeClient;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public void setCommandeClient(CommandeClients commandeClient) {
		this.commandeClient = commandeClient;
	}
	
	
}
