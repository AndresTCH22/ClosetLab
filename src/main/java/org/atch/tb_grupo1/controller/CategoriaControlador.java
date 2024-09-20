package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.CategoriaDTO;
import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.entities.Categoria;
import org.atch.tb_grupo1.services.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaControlador {
    @Autowired
    CategoriaService service;
    @PostMapping("/categoria")
    public CategoriaDTO guardar(@RequestBody CategoriaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Categoria obj=modelMapper.map(objDTO, Categoria.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, CategoriaDTO.class);
    }

    @GetMapping("/categorias")
    public List<Categoria> listar() {
        return service.listar();
    }

    @PutMapping("/categoria")
    public CategoriaDTO actualizar(@RequestBody CategoriaDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Categoria obj=modelMapper.map(objDTO, Categoria.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, CategoriaDTO.class);
    }
    @DeleteMapping("/categoria/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}
