package org.atch.tb_grupo1.controller;

import org.atch.tb_grupo1.entities.Carrito;
import org.atch.tb_grupo1.services.CarritoPrendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarritoPrendaControlador {

    @Autowired
    CarritoPrendaService carritoPrendaService;

}
