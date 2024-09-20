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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dni;

    @ManyToOne()
    @JoinColumn(name = "tipo_usuario_id")
    private TipoUsuario tipoUsuario;

    private String nombre;

    private String correo;

    private String contra;

    private String telefono;

}