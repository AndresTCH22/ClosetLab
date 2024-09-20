package org.atch.tb_grupo1.repositories;

import org.atch.tb_grupo1.entities.ReseñaPrenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseñaPrendaRepositorio extends JpaRepository<ReseñaPrenda, Integer> {
}
