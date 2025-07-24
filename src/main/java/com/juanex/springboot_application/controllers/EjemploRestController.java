package com.juanex.springboot_application.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanex.springboot_application.dto.ClaseDTO;
import com.juanex.springboot_application.models.Empleados;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @RequestMapping(path = "/info2", method = RequestMethod.GET)

    public ClaseDTO info() {

        var usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("juanex");

        return usuario1;
    }

}
