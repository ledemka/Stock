package org.sid.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {

	@Id
	@GeneratedValue
	private Long idCategorie;

	private String code;

	private String designation;

	@OneToMany(mappedBy = "categorie")
	private List<Article> articles;

	public Long getIdCategorie() {
		return idCategorie;
	}

	public String getCode() {
		return code;
	}

	public String getDesignation() {
		return designation;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
