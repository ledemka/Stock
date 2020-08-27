package org.sid.services;

import java.util.List;

import org.sid.entities.CommandeFournisseur;

public interface CommandeFournisseurService{

	public CommandeFournisseur save(CommandeFournisseur entity);
	
	public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur entity);
	
	public List<CommandeFournisseur> sellectAll();
	
	public List<CommandeFournisseur> sellectAll(String sortField, String sort);
	
	public CommandeFournisseur getById(Long id);
	
	public void remove(Long id);
	
	public CommandeFournisseur findOne(String paramName,Object paramValue);
	
	public CommandeFournisseur findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
