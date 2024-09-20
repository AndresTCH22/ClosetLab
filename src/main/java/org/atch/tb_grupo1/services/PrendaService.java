package org.atch.tb_grupo1.services;

import org.atch.tb_grupo1.entities.Categoria;
import org.atch.tb_grupo1.entities.Pago;
import org.atch.tb_grupo1.entities.Prenda;

import java.util.List;

public interface PrendaService {
    public Prenda guardar(Prenda obj);
    public List<Prenda> listar();
    public Prenda actualizar(Prenda obj);
    public void eliminar(int id);
}
