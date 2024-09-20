package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.TipoUsuario;
import org.atch.tb_grupo1.services.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoUsuarioControlador {
    @Autowired
    private TipoUsuarioService service;

    @PostMapping("/tipo-usuario")
    public TipoUsuario GuardarTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        return service.guardar(tipoUsuario);
    }

    @GetMapping("tipos-usuario")
    public List<TipoUsuario> BuscarTipoUsuario() {
        return service.listar();
    }

    @PutMapping("/tipo-usuario")
    public TipoUsuario ActualizarTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        return service.actualizar(tipoUsuario);
    }

    @DeleteMapping("/tipo-usuario/{id}")
    public void eliminarTipoUsuario(@RequestBody int id) {
        service.eliminar(id);
    }
}
