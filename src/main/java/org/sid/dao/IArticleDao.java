package org.sid.dao;

import org.sid.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IArticleDao extends JpaRepository<Article, Long> {

	//@Query("SELECT a.code a.designation FROM Article a order by a.code")
	//List<Article> findAll( @Param("sortField") String sortField,@Param("sort") String sort);

}
