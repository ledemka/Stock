package org.sid.services;

import java.util.List;

import org.sid.entities.LigneCommandeClient;

public interface LigneCommandeClientsService{

	public LigneCommandeClient save(LigneCommandeClient entity);
	
	public LigneCommandeClient updateLigneCommandeClient(LigneCommandeClient entity);
	
	public List<LigneCommandeClient> sellectAll();
	
	public List<LigneCommandeClient> sellectAll(String sortField, String sort);
	
	public LigneCommandeClient getById(Long id);
	
	public void remove(Long id);
	
	public LigneCommandeClient findOne(String paramName,Object paramValue);
	
	public LigneCommandeClient findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
