package org.sid.dao;

import org.sid.entities.CommandeClients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandeClientsDao extends JpaRepository<CommandeClients, Long> {

}
