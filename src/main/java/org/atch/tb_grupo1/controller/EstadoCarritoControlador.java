package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Categoria;
import org.atch.tb_grupo1.entities.EstadoCarrito;
import org.atch.tb_grupo1.services.EstadoCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstadoCarritoControlador {
    @Autowired
    EstadoCarritoService service;
    @PostMapping("/estado-carrito")
    public EstadoCarrito guardar(@RequestBody EstadoCarrito estadoCarrito) {
        return service.guardar(estadoCarrito);
    }

    @GetMapping("/estado-carrito")
    public List<EstadoCarrito> listar() {
        return service.listar();
    }

    @PutMapping("/estado-carrito")
    public EstadoCarrito actualizar(@RequestBody EstadoCarrito estadoCarrito) {
        return service.actualizar(estadoCarrito);
    }
    @DeleteMapping("/estado-carrito/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
