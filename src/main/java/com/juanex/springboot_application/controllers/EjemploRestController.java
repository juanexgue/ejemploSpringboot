package com.juanex.springboot_application.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class EjemploRestController {

@RequestMapping(path="/info2", method=RequestMethod.GET)
    public Map<String, Object> info(){
    Map<String, Object> respuesta = new HashMap<>();
    respuesta.put("Titulo", "Servidor en linea");
    respuesta.put("Servidor", "Juanex");
    respuesta.put("Ip", "192.168.1.1");
    return respuesta;
    }

}
