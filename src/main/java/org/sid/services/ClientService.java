package org.sid.services;

import java.util.List;

import org.sid.entities.Clients;

public interface ClientService{

	public Clients save(Clients entity);
	
	public Clients updateClients(Clients entity);
	
	public List<Clients> sellectAll();
	
	public List<Clients> sellectAll(String sortField, String sort);
	
	public Clients getById(Long id);
	
	public void remove(Long id);
	
	public Clients findOne(String paramName,Object paramValue);
	
	public Clients findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
