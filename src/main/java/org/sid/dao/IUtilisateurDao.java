package org.sid.dao;

import org.sid.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
