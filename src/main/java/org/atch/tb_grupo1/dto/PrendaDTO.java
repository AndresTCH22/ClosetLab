package org.atch.tb_grupo1.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.atch.tb_grupo1.entities.Categoria;
import org.atch.tb_grupo1.entities.Marca;
import org.atch.tb_grupo1.entities.Talla;
import org.atch.tb_grupo1.entities.TipoPrenda;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrendaDTO {
    private Integer id;
    private String nombre;
    private String descipcion;
    private Marca marca;
    private Talla talla;
    private Categoria categoria;
    private TipoPrenda tipo;
    private int cantidadEnStock;
}
