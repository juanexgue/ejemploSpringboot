package com.juanex.springboot_application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanex.springboot_application.models.Empleados;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje) {
        var parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    @PostMapping("/solicitud")
    public Empleados creaEmpleado(@RequestBody Empleados empleado1) {
        return empleado1;

    }

    @GetMapping("/valores")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("Usuario:", usuario);
        json.put("Codigo: ", codigo);
        json.put("Mensaje: ", mensaje);
        json.put("Valores: ", valores);
        return json;
    }

}
