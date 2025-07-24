package com.juanex.springboot_application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juanex.springboot_application.models.Empleados;


@Controller
public class EjemploController {

@GetMapping("/info")
    public String info(Model model){

    Empleados empleado1 = new Empleados("Juan", "Perez",
     "Micaela", "Developer", 30, 92343424,8);

    model.addAttribute("Titulo","Servidor en linea");
    model.addAttribute("empleado1", empleado1);
        return "detalles_info";
    }

}
