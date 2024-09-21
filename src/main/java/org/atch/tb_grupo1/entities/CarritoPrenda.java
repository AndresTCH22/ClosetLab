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
    private CarritoPrendaIdss id;

}