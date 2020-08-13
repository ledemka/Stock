package org.sid.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="mvt_stock")
public class MvtStock implements Serializable{

	public static final int ENTREE = 1;
	public static final int SORTIE = 2;

	
	@Id
	@GeneratedValue
	private Long idMvtStock;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvtStock;
	
	private BigDecimal quantite;
	
	private int typeMvtStock;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	public Long getIdMvtStock() {
		return idMvtStock;
	}

	public Date getDateMvtStock() {
		return dateMvtStock;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public int getTypeMvtStock() {
		return typeMvtStock;
	}

	public Article getArticle() {
		return article;
	}

	public void setIdMvtStock(Long idMvtStock) {
		this.idMvtStock = idMvtStock;
	}

	public void setDateMvtStock(Date dateMvtStock) {
		this.dateMvtStock = dateMvtStock;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public void setTypeMvtStock(int typeMvtStock) {
		this.typeMvtStock = typeMvtStock;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
