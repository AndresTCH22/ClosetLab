package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.TipoUsuario;
import org.atch.tb_grupo1.entities.Usuario;
import org.atch.tb_grupo1.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioControlador {
    @Autowired
    UsuarioService service;

    @PostMapping("/usuario")
    public Usuario GuardarTipoUsuario(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

    @GetMapping("usuarios")
    public List<Usuario> BuscarTipoUsuario() {
        return service.listar();
    }

    @PutMapping("/usuario")
    public Usuario ActualizarTipoUsuario(@RequestBody Usuario usuario) {
         return  service.actualizar(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void eliminarTipoUsuario(@PathVariable int  id) {
        service.eliminar(id);
    }
}
