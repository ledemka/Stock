package org.sid.dao;

import org.sid.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientsDao extends JpaRepository<Clients, Long> {

}
