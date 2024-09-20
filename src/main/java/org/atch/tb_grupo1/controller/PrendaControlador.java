package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Pago;
import org.atch.tb_grupo1.entities.Prenda;
import org.atch.tb_grupo1.services.PrendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrendaControlador {
    @Autowired
    PrendaService service;
    @PostMapping("/prenda")
    public Prenda guardar(@RequestBody Prenda obj) {
        return service.guardar(obj);
    }

    @GetMapping("/prenda")
    public List<Prenda> listar() {
        return service.listar();
    }

    @PutMapping("/prenda")
    public Prenda actualizar(@RequestBody Prenda obj) {
        return service.actualizar(obj);
    }

    @DeleteMapping("/prenda/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
