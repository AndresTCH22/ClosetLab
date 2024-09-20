package org.atch.tb_grupo1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CarritoPrenda {
    @EmbeddedId
    private CarritoPrendaId id;

    @MapsId("carritoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "carrito_id", nullable = false)
    private Carrito carrito;

    @MapsId("prendaId")
    @ManyToOne()
    @JoinColumn(name = "prenda_id")
    private Prenda prenda;

    private int cantidad;

}