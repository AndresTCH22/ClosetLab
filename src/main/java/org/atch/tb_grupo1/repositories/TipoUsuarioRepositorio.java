package org.atch.tb_grupo1.repositories;

import org.atch.tb_grupo1.entities.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoUsuarioRepositorio  extends JpaRepository<TipoUsuario, Integer> {
}
