package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.MarcaDTO;
import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Marca;
import org.atch.tb_grupo1.services.MarcaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MarcaControlador {
    @Autowired
    MarcaService service;

    @PostMapping("/marca")
    public MarcaDTO guardar(@RequestBody MarcaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Marca obj=modelMapper.map(objDTO, Marca.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, MarcaDTO.class);
    }

    @GetMapping("/marcas")
    public List<Marca> listar() {
        return service.listar();
    }

    @PutMapping("/marca")
    public MarcaDTO actualizar(@RequestBody MarcaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Marca obj=modelMapper.map(objDTO, Marca.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, MarcaDTO.class);
    }

    @DeleteMapping("/marca/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
