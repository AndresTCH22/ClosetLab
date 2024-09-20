package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.CarritoDTO;
import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.services.CarritoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarritoControlador {
    @Autowired
    CarritoService service;
    @PostMapping("/carrito")
    public CarritoDTO guardar(@RequestBody CarritoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Carrito obj=modelMapper.map(objDTO, Carrito.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, CarritoDTO.class);
    }

    @GetMapping("/carrito")
    public List<Carrito> listar() {
        return service.listar();
    }

    @PutMapping("/carrito")
    public CarritoDTO actualizar(@RequestBody CarritoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Carrito obj=modelMapper.map(objDTO, Carrito.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, CarritoDTO.class);
    }

    @DeleteMapping("/carrito/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
