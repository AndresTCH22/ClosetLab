package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.ReseñaProbadorVirtual;
import org.atch.tb_grupo1.services.ReseñaProbadorVirtualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReseñaProbadorVirtualController {
    @Autowired
    ReseñaProbadorVirtualService service;
    @PostMapping("/reseña-probador-virtual")
    public ReseñaProbadorVirtual guardar(@RequestBody ReseñaProbadorVirtual obj) {
        return service.guardar(obj);
    }

    @GetMapping("/reseñas-probador-virtual")
    public List<ReseñaProbadorVirtual> listar() {
        return service.listar();
    }

    @PutMapping("/reseña-probador-virtual")
    public ReseñaProbadorVirtual actualizar(@RequestBody ReseñaProbadorVirtual obj) {
        return service.actualizar(obj);
    }

    @DeleteMapping("/reseña-probador-virtual/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
