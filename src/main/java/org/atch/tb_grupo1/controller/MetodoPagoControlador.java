package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.MetodoPagoDTO;
import org.atch.tb_grupo1.entities.MetodoPago;
import org.atch.tb_grupo1.repositories.MetodoPagoRepositorio;
import org.atch.tb_grupo1.services.MetodoPagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MetodoPagoControlador {
    @Autowired
    MetodoPagoService service;
    @PostMapping("/metodo-pago")
    public MetodoPagoDTO guardar(@RequestBody MetodoPagoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        MetodoPago obj=modelMapper.map(objDTO, MetodoPago.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, MetodoPagoDTO.class);
    }

    @GetMapping("/metodos-pago")
    public List<MetodoPago> listar() {
        return service.listar();
    }

    @PutMapping("/metodo-pago")
    public MetodoPagoDTO actualizar(@RequestBody MetodoPagoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        MetodoPago obj=modelMapper.map(objDTO, MetodoPago.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, MetodoPagoDTO.class);
    }

    @DeleteMapping("/metodo-pago/{id}" )
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
