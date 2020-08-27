package org.sid.dao;

import org.sid.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFournisseurDao extends JpaRepository<Fournisseur, Long> {

}
