package org.atch.tb_grupo1.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.MetodoPago;
import org.atch.tb_grupo1.entities.Usuario;

import java.util.Date;

public class PagoDTO {
    private int id;
    private MetodoPago metodoPago;
    private Carrito carrito;
    private Usuario usuario;
    private float montoTotal;
    private Date fechaPago;
}
