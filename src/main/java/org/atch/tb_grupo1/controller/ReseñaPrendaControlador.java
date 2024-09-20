package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.ReseñaPrenda;
import org.atch.tb_grupo1.services.ReseñaPrendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReseñaPrendaControlador {
    @Autowired
    ReseñaPrendaService service;
    @PostMapping("/reseña-prenda")
    public ReseñaPrenda guardar(@RequestBody ReseñaPrenda obj) {
        return service.guardar(obj);
    }

    @GetMapping("/reseñas-prenda")
    public List<ReseñaPrenda> listar() {
        return service.listar();
    }

    @PutMapping("/reseña-prenda")
    public ReseñaPrenda actualizar(@RequestBody ReseñaPrenda obj) {
        return service.actualizar(obj);
    }

    @DeleteMapping("/reseña-prenda/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
