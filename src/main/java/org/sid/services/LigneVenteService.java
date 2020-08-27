package org.sid.services;

import java.util.List;

import org.sid.entities.LigneVente;

public interface LigneVenteService{

	public LigneVente save(LigneVente entity);
	
	public LigneVente updateLigneVente(LigneVente entity);
	
	public List<LigneVente> sellectAll();
	
	public List<LigneVente> sellectAll(String sortField, String sort);
	
	public LigneVente getById(Long id);
	
	public void remove(Long id);
	
	public LigneVente findOne(String paramName,Object paramValue);
	
	public LigneVente findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
