package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    
    @GetMapping("/detalles")
    public Map<String, Object> getDetalles() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("nombre", "Jesús");
        respuesta.put("paterno", "Zúñiga");
        respuesta.put("materno", "Trejo");
        return respuesta;
    }
    
}
