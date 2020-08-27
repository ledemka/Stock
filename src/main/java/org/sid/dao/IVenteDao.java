package org.sid.dao;

import org.sid.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVenteDao extends JpaRepository<Vente, Long> {

}
