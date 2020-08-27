package org.sid.services;

import java.util.List;

import org.sid.entities.Vente;

public interface VenteService{

	public Vente save(Vente entity);
	
	public Vente updateVente(Vente entity);
	
	public List<Vente> sellectAll();
	
	public List<Vente> sellectAll(String sortField, String sort);
	
	public Vente getById(Long id);
	
	public void remove(Long id);
	
	public Vente findOne(String paramName,Object paramValue);
	
	public Vente findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
