package org.atch.tb_grupo1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CarritoPrendaId implements Serializable {
    private static final long serialVersionUID = 5182719147527660272L;
    @Column(name = "carrito_id", nullable = false)
    private Integer carritoId;

    @Column(name = "prenda_id", nullable = false)
    private Integer prendaId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CarritoPrendaId entity = (CarritoPrendaId) o;
        return Objects.equals(this.prendaId, entity.prendaId) &&
                Objects.equals(this.carritoId, entity.carritoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prendaId, carritoId);
    }

}