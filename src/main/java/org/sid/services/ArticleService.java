package org.sid.services;

import java.util.List;

import org.sid.entities.Article;

public interface ArticleService{

	public Article save(Article entity);
	
	public Article updateArticle(Article entity);
	
	public List<Article> sellectAll();
	
	public List<Article> sellectAll(String sortField, String sort);
	
	public Article getById(Long id);
	
	public void remove(Long id);
	
	public Article findOne(String paramName,Object paramValue);
	
	public Article findOne(String[] paramName, Object paramValue);
	
	public int findCountBy(String paramName,String paramValue);
}
