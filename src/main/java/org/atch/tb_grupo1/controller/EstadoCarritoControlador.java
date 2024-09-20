package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.EstadoCarritoDTO;
import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Categoria;
import org.atch.tb_grupo1.entities.EstadoCarrito;
import org.atch.tb_grupo1.services.EstadoCarritoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstadoCarritoControlador {
    @Autowired
    EstadoCarritoService service;
    @PostMapping("/estado-carrito")
    public EstadoCarritoDTO guardar(@RequestBody EstadoCarritoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        EstadoCarrito obj=modelMapper.map(objDTO, EstadoCarrito.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, EstadoCarritoDTO.class);
    }

    @GetMapping("/estados-carrito")
    public List<EstadoCarrito> listar() {
        return service.listar();
    }

    @PutMapping("/estado-carrito")
    public EstadoCarritoDTO actualizar(@RequestBody EstadoCarritoDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        EstadoCarrito obj=modelMapper.map(objDTO, EstadoCarrito.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, EstadoCarritoDTO.class);
    }
    @DeleteMapping("/estado-carrito/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
