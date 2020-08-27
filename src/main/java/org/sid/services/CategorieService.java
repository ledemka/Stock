package org.sid.services;

import java.util.List;

import org.sid.entities.Categorie;

public interface CategorieService{

	public Categorie save(Categorie entity);
	
	public Categorie updateCategorie(Categorie entity);
	
	public List<Categorie> sellectAll();
	
	public List<Categorie> sellectAll(String sortField, String sort);
	
	public Categorie getById(Long id);
	
	public void remove(Long id);
	
	public Categorie findOne(String paramName,Object paramValue);
	
	public Categorie findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
