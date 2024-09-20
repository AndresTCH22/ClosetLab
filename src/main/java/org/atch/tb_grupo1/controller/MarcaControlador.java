package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Marca;
import org.atch.tb_grupo1.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarcaControlador {
    @Autowired
    MarcaService service;

    @PostMapping("/marca")
    public Marca guardar(@RequestBody Marca marca) {
        return service.guardar(marca);
    }

    @GetMapping("/marca")
    public List<Marca> listar() {
        return service.listar();
    }

    @PutMapping("/marca")
    public Marca actualizar(@RequestBody Marca marca) {
        return service.actualizar(marca);
    }

    @DeleteMapping("/marca/{id}")
    public void eliminar(@RequestBody int id) {
        service.eliminar(id);
    }
}
