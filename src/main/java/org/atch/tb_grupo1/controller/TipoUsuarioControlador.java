package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.TipoUsuarioDTO;
import org.atch.tb_grupo1.entities.TipoUsuario;
import org.atch.tb_grupo1.services.TipoUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoUsuarioControlador {
    @Autowired
    private TipoUsuarioService service;

    @PostMapping("/tipo-usuario")
    public TipoUsuarioDTO guardar(@RequestBody TipoUsuarioDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        TipoUsuario obj=modelMapper.map(objDTO, TipoUsuario.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, TipoUsuarioDTO.class);
    }

    @GetMapping("tipos-usuario")
    public List<TipoUsuario> listar() {
        return service.listar();
    }

    @PutMapping("/tipo-usuario")
    public TipoUsuarioDTO actualizar(@RequestBody TipoUsuarioDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        TipoUsuario obj=modelMapper.map(objDTO, TipoUsuario.class);
        obj=service.actualizar(obj);
        return modelMapper.map(obj, TipoUsuarioDTO.class);
    }

    @DeleteMapping("/tipo-usuario/{id}")
    public void eliminar(@RequestBody int id) {
        service.eliminar(id);
    }
}
