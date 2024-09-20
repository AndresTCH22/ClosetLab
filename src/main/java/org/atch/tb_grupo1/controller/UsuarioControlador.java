package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.dto.UsuarioDTO;
import org.atch.tb_grupo1.entities.TipoUsuario;
import org.atch.tb_grupo1.entities.Usuario;
import org.atch.tb_grupo1.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioControlador {
    @Autowired
    UsuarioService service;

    @PostMapping("/usuario")
    public UsuarioDTO guardar(@RequestBody UsuarioDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario obj=modelMapper.map(objDTO, Usuario.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, UsuarioDTO.class);
    }

    @GetMapping("usuarios")
    public List<Usuario> listar() {
        return service.listar();
    }

    @PutMapping("/usuario")
    public UsuarioDTO actualizar(@RequestBody UsuarioDTO objDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Usuario obj=modelMapper.map(objDTO, Usuario.class);
        obj=service.guardar(obj);
        return modelMapper.map(obj, UsuarioDTO.class);
    }

    @DeleteMapping("/usuario/{id}")
    public void eliminar(@PathVariable int  id) {
        service.eliminar(id);
    }
}
