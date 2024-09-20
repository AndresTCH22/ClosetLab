package org.atch.tb_grupo1.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.atch.tb_grupo1.entities.EstadoCarrito;
import org.atch.tb_grupo1.entities.Usuario;

public class CarritoDTO {
    private Integer id;
    private EstadoCarrito estadoCarrito;
    private Usuario usuario;
}
