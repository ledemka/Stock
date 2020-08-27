package org.sid.dao;

import org.sid.entities.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMvtStockDao extends JpaRepository<MvtStock, Long> {

}
