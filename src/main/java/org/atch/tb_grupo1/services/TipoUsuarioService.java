package org.atch.tb_grupo1.services;

import org.atch.tb_grupo1.entities.TipoUsuario;

import java.util.List;

public interface TipoUsuarioService {
    public TipoUsuario guardar(TipoUsuario obj);
    public List<TipoUsuario> listar();
    public TipoUsuario actualizar(TipoUsuario obj);
    public void eliminar(int id);
}
