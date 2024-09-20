package org.atch.tb_grupo1.dto;

import jakarta.persistence.*;
import org.atch.tb_grupo1.entities.TipoUsuario;

public class UsuarioDTO {
    private int id;
    private String dni;
    private TipoUsuario tipoUsuario;
    private String nombre;
    private String correo;
    private String contra;
    private String telefono;
}
