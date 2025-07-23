package com.juanex.springboot_application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

@GetMapping("/info")
    public String info(Model model){
    model.addAttribute("Titulo","Servidor en linea");
    model.addAttribute("Servidor", "Juanexgue");
        return "detalles_info";
    }

}
