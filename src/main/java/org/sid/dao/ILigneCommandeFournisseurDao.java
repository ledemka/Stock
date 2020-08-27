package org.sid.dao;

import org.sid.entities.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILigneCommandeFournisseurDao extends JpaRepository<LigneCommandeClient, Long> {

}
