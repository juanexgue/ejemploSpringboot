package com.juanex.springboot_application.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EjemploRestController {

@GetMapping("/info2")
    public Map<String, Object> info(){
    Map<String, Object> respuesta = new HashMap<>();
    respuesta.put("Titulo", "Servidor en linea");
    return respuesta;
    }

}
