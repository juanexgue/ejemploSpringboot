package com.juanex.springboot_application.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.juanex.springboot_application.models.Empleados;

@Controller
public class EjemploController {

    @GetMapping("/info")
    public String info(Model model) {

        Empleados empleado1 = new Empleados("Juan", "Perez",
                "Micaela", "Developer", 30, 92343424, 8);

        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("empleado1", empleado1);
        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> listaEmpleados() {
        return Arrays.asList(
                new Empleados("Juan", "Perez", "Av. Micaela",
                        "Developer", 36, 892344, 8));

    }

    @ModelAttribute("Empleados2")
    public List<Empleados> listaEmpleados2() {
        return Arrays.asList(
                new Empleados("Juan 2", "Perez", "Av. Micaela",
                        "Developer", 36, 892344, 8));

    }

}
