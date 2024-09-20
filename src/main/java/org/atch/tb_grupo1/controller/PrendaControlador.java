package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.PrendaDTO;
import org.atch.tb_grupo1.entities.Pago;
import org.atch.tb_grupo1.entities.Prenda;
import org.atch.tb_grupo1.services.PrendaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PrendaControlador {
    @Autowired
    PrendaService service;
    @PostMapping("/prenda")
    public PrendaDTO guardar(@RequestBody PrendaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Prenda obj=modelMapper.map(objDTO, Prenda.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, PrendaDTO.class);
    }

    @GetMapping("/prenda")
    public List<Prenda> listar() {
        return service.listar();
    }

    @PutMapping("/prenda")
    public PrendaDTO actualizar(@RequestBody PrendaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Prenda obj=modelMapper.map(objDTO, Prenda.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, PrendaDTO.class);
    }

    @DeleteMapping("/prenda/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
