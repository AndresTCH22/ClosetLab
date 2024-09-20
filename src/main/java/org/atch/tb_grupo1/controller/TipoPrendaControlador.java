package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.TipoPrenda;
import org.atch.tb_grupo1.services.TipoPrendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoPrendaControlador {
    @Autowired
    TipoPrendaService service;
    @PostMapping("/tipo-prenda")
    public TipoPrenda guardar(@RequestBody TipoPrenda obj) {
        return  service.guardar(obj);
    }

    @GetMapping("/tipos-prenda")
    public List<TipoPrenda> listar() {
        return service.listar();
    }

    @PutMapping("/tipo-prenda")
    public TipoPrenda actualizar(@RequestBody TipoPrenda obj) {
        return service.actualizar(obj);
    }

    @DeleteMapping("/tipo-prenda")
    public void eliminar(@RequestBody int id) {
        service.eliminar(id);
    }
}
