package org.atch.tb_grupo1.services;

import org.atch.tb_grupo1.entities.MetodoPago;
import org.atch.tb_grupo1.entities.Pago;

import java.util.List;

public interface PagoService {
    public Pago guardar(Pago obj);
    public List<Pago> listar();
    public Pago actualizar(Pago obj);
    public void eliminar(int id);
}
