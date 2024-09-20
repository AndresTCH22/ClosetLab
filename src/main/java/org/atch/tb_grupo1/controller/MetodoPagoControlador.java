package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.MetodoPago;
import org.atch.tb_grupo1.repositories.MetodoPagoRepositorio;
import org.atch.tb_grupo1.services.MetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MetodoPagoControlador {
    @Autowired
    MetodoPagoService service;
    @PostMapping("/metodo-pago")
    public MetodoPago guardar(@RequestBody MetodoPago obj) {
        return service.guardar(obj);
    }

    @GetMapping("/metodos-pago")
    public List<MetodoPago> listar() {
        return service.listar();
    }

    @PutMapping("/metodo-pago")
    public MetodoPago actualizar(@RequestBody MetodoPago obj) {
        return service.actualizar(obj);
    }

    @DeleteMapping("/metodo-pago/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
