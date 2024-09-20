package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Prenda;
import org.atch.tb_grupo1.entities.Talla;
import org.atch.tb_grupo1.services.TallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TallaControlador {
    @Autowired
    TallaService service;
    @PostMapping("/talla")
    public Talla guardar(@RequestBody Talla obj) {
        return service.guardar(obj);
    }

    @GetMapping("/talla")
    public List<Talla> listar() {
        return service.listar();
    }

    @PutMapping("/talla")
    public Talla actualizar(@RequestBody Talla obj) {
        return service.actualizar(obj);
    }

    @DeleteMapping("/talla/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
