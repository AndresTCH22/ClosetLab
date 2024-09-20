package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.ReseñaPrendaDTO;
import org.atch.tb_grupo1.entities.ReseñaPrenda;
import org.atch.tb_grupo1.services.ReseñaPrendaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReseñaPrendaControlador {
    @Autowired
    ReseñaPrendaService service;
    @PostMapping("/reseña-prenda")
    public ReseñaPrendaDTO guardar(@RequestBody ReseñaPrendaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        ReseñaPrenda obj=modelMapper.map(objDTO, ReseñaPrenda.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, ReseñaPrendaDTO.class);
    }

    @GetMapping("/reseñas-prenda")
    public List<ReseñaPrenda> listar() {
        return service.listar();
    }

    @PutMapping("/reseña-prenda")
    public ReseñaPrendaDTO actualizar(@RequestBody ReseñaPrendaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        ReseñaPrenda obj=modelMapper.map(objDTO, ReseñaPrenda.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, ReseñaPrendaDTO.class);
    }

    @DeleteMapping("/reseña-prenda/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
