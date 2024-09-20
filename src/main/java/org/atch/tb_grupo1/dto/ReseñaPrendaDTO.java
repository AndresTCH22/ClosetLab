package org.atch.tb_grupo1.dto;

import jakarta.persistence.*;
import org.atch.tb_grupo1.entities.Prenda;
import org.atch.tb_grupo1.entities.Usuario;

public class ReseñaPrendaDTO {
    private int id;
    private Prenda prenda;
    private Usuario usuario;
    private String comentario;
    private int calificacion;
}
