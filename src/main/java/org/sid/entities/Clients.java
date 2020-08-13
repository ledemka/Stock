package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Clients implements Serializable {

	@Id
	@GeneratedValue
	private Long idClient;

	private String nom;

	private String prenom;
	private String adresse;

	private String photo;
	private String mail;
	@OneToMany(mappedBy = "clients")
	private List<CommandeClients> commandeClients;

	public Clients() {
		super();
	}

	public Long getIdClient() {
		return idClient;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public String getMail() {
		return mail;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
