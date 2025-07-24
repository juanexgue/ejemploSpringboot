package com.juanex.springboot_application.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanex.springboot_application.models.Empleados;

import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/api")
public class EjemploRestController {

@RequestMapping(path="/info2", method=RequestMethod.GET)


    public Map<String, Object> info(){

    Empleados empleado1 = new Empleados("Juan", "Perez",
     "Micaela", "Developer", 30, 92343424,8);

    Map<String, Object> respuesta = new HashMap<>();
    respuesta.put("Empleado", empleado1);

    return respuesta;
    }

}
