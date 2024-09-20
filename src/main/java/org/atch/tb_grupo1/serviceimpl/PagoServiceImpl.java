package org.atch.tb_grupo1.serviceimpl;

import org.atch.tb_grupo1.entities.Pago;
import org.atch.tb_grupo1.repositories.PagoRepositorio;
import org.atch.tb_grupo1.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServiceImpl implements PagoService {
    @Autowired
    PagoRepositorio repositorio;
    @Override
    public Pago guardar(Pago obj) {
        return repositorio.save(obj);
    }

    @Override
    public List<Pago> listar() {
        return repositorio.findAll();
    }

    @Override
    public Pago actualizar(Pago obj) {
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
