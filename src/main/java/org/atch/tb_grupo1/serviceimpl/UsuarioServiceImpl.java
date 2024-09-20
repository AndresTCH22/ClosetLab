package org.atch.tb_grupo1.serviceimpl;

import org.atch.tb_grupo1.entities.Usuario;
import org.atch.tb_grupo1.repositories.UsuarioRepositorio;
import org.atch.tb_grupo1.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired UsuarioRepositorio repositorio;
    @Override
    public Usuario guardar(Usuario obj) {
        return repositorio.save(obj);
    }

    @Override
    public List<Usuario> listar() {
        return repositorio.findAll();
    }

    @Override
    public Usuario actualizar(Usuario obj) {
        if(repositorio.existsById(obj.getId())){
            return repositorio.save(obj);
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        if(repositorio.existsById(id)){
            repositorio.deleteById(id);
        }
    }
}
