package org.sid.services;

import java.util.List;

import org.sid.entities.CommandeClients;

public interface CommandeClientService{

	public CommandeClients save(CommandeClients entity);
	
	public CommandeClients updateCommandeClients(CommandeClients entity);
	
	public List<CommandeClients> sellectAll();
	
	public List<CommandeClients> sellectAll(String sortField, String sort);
	
	public CommandeClients getById(Long id);
	
	public void remove(Long id);
	
	public CommandeClients findOne(String paramName,Object paramValue);
	
	public CommandeClients findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
