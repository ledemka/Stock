package org.sid.services;

import java.util.List;

import org.sid.entities.Utilisateur;

public interface UtilisateurService{

	public Utilisateur save(Utilisateur entity);
	
	public Utilisateur updateUtilisateur(Utilisateur entity);
	
	public List<Utilisateur> sellectAll();
	
	public List<Utilisateur> sellectAll(String sortField, String sort);
	
	public Utilisateur getById(Long id);
	
	public void remove(Long id);
	
	public Utilisateur findOne(String paramName,Object paramValue);
	
	public Utilisateur findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
