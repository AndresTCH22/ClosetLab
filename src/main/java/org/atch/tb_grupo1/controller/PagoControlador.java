package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.PagoDTO;
import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Pago;
import org.atch.tb_grupo1.services.PagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PagoControlador {
    @Autowired
    PagoService service;
    @PostMapping("/pago")
    public PagoDTO guardar(@RequestBody PagoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Pago obj=modelMapper.map(objDTO, Pago.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, PagoDTO.class);
    }

    @GetMapping("/pagos")
    public List<Pago> listar() {
        return service.listar();
    }

    @PutMapping("/pago")
    public PagoDTO actualizar(@RequestBody PagoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Pago obj=modelMapper.map(objDTO, Pago.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, PagoDTO.class);
    }

    @DeleteMapping("/pago/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
