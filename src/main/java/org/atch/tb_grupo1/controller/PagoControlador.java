package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Pago;
import org.atch.tb_grupo1.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PagoControlador {
    @Autowired
    PagoService service;
    @PostMapping("/pago")
    public Pago guardar(@RequestBody Pago obj) {
        return service.guardar(obj);
    }

    @GetMapping("/pago")
    public List<Pago> listar() {
        return service.listar();
    }

    @PutMapping("/pago")
    public Pago actualizar(@RequestBody Pago obj) {
        return service.actualizar(obj);
    }

    @DeleteMapping("/pago/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
