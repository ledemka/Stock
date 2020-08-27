package org.sid.services;

import java.util.List;

import org.sid.entities.MvtStock;

public interface MvtStockVenteService{

	public MvtStock save(MvtStock entity);
	
	public MvtStock updateMvtStock(MvtStock entity);
	
	public List<MvtStock> sellectAll();
	
	public List<MvtStock> sellectAll(String sortField, String sort);
	
	public MvtStock getById(Long id);
	
	public void remove(Long id);
	
	public MvtStock findOne(String paramName,Object paramValue);
	
	public MvtStock findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
