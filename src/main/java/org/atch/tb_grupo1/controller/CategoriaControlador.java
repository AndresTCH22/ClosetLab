package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Categoria;
import org.atch.tb_grupo1.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaControlador {
    @Autowired
    CategoriaService service;
    @PostMapping("/categoria")
    public Categoria guardar(@RequestBody Categoria categoria) {
        return service.guardar(categoria);
    }

    @GetMapping("/categoria")
    public List<Categoria> listar() {
        return service.listar();
    }

    @PutMapping("/categoria")
    public Categoria actualizar(@RequestBody Categoria categoria) {
        return  service.actualizar(categoria);
    }
    @DeleteMapping("/categoria/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
