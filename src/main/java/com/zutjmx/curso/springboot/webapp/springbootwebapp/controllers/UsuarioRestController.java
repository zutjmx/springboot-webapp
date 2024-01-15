package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UsuarioRestController {
    
    @GetMapping("/getdetalles")
    public Map<String, Object> getDetalles() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("nombre", "Jesús");
        respuesta.put("paterno", "Zúñiga");
        respuesta.put("materno", "Trejo");
        return respuesta;
    }
    
}
