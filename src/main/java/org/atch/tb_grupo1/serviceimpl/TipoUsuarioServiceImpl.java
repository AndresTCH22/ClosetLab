package org.atch.tb_grupo1.serviceimpl;

import org.atch.tb_grupo1.entities.TipoUsuario;
import org.atch.tb_grupo1.repositories.TipoUsuarioRepositorio;
import org.atch.tb_grupo1.services.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioServiceImpl  implements TipoUsuarioService {
    @Autowired TipoUsuarioRepositorio repositorio;
    @Override
    public TipoUsuario guardar(TipoUsuario obj) {
        return repositorio.save(obj);
    }

    @Override
    public List<TipoUsuario> listar() {
        return repositorio.findAll();
    }

    @Override
    public TipoUsuario actualizar(TipoUsuario obj) {
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
