package org.atch.tb_grupo1.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.atch.tb_grupo1.entities.TipoUsuario;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private int id;
    private String dni;
    private TipoUsuario tipoUsuario;
    private String nombre;
    private String correo;
    private String contra;
    private String telefono;
}
