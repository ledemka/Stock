package org.sid.services;

import java.util.List;

import org.sid.entities.Fournisseur;

public interface FournisseurService{

	public Fournisseur save(Fournisseur entity);
	
	public Fournisseur updateFournisseur(Fournisseur entity);
	
	public List<Fournisseur> sellectAll();
	
	public List<Fournisseur> sellectAll(String sortField, String sort);
	
	public Fournisseur getById(Long id);
	
	public void remove(Long id);
	
	public Fournisseur findOne(String paramName,Object paramValue);
	
	public Fournisseur findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
