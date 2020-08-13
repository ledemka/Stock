package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fournisseur")
public class Fournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idFournisseur;
	
	private String nom;
	
	private String prenom;
	private String adresse;
	
	private String photo;
	private String mail;
	
	@OneToMany(mappedBy="fournisseur")
	private List<CommandeFournisseur> commandeFournisseur;
	
	public List<CommandeFournisseur> getCommandeFournisseur() {
		return commandeFournisseur;
	}
	public void setCommandeFournisseur(List<CommandeFournisseur> commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}
	public Fournisseur() {
		super();
	}
	public Long getIdFournisseur() {
		return idFournisseur;
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
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
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
