package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.TipoUsuario;
import org.atch.tb_grupo1.services.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarritoControlador {
    @Autowired
    CarritoService service;
    @PostMapping("/carrito")
    public Carrito guardar(@RequestBody Carrito carrito) {
        return service.guardar(carrito);
    }

    @GetMapping("/carrito")
    public List<Carrito> listar() {
        return service.listar();
    }

    @PutMapping("/carrito")
    public Carrito actualizar(@RequestBody Carrito carrito) {
        return service.actualizar(carrito);
    }

    @DeleteMapping("/carrito/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
