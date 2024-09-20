package org.atch.tb_grupo1.services;

import org.atch.tb_grupo1.entities.TipoUsuario;
import org.atch.tb_grupo1.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    public Usuario guardar(Usuario obj);
    public List<Usuario> listar();
    public Usuario actualizar(Usuario obj);
    public void eliminar(int id);
}
