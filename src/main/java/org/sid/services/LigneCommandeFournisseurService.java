package org.sid.services;

import java.util.List;

import org.sid.entities.LigneCommandeFournisseur;

public interface LigneCommandeFournisseurService{

	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);
	
	public LigneCommandeFournisseur updateLigneCommandeFournisseur(LigneCommandeFournisseur entity);
	
	public List<LigneCommandeFournisseur> sellectAll();
	
	public List<LigneCommandeFournisseur> sellectAll(String sortField, String sort);
	
	public LigneCommandeFournisseur getById(Long id);
	
	public void remove(Long id);
	
	public LigneCommandeFournisseur findOne(String paramName,Object paramValue);
	
	public LigneCommandeFournisseur findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
