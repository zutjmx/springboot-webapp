package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @GetMapping("/usuario")
    public Map<String, Object> getUsuario() {
        Map<String, Object> respuesta = new HashMap<>();
        Faker faker = new Faker();
        respuesta.put("useragent", faker.internet().userAgentAny());
        respuesta.put("email", faker.internet().emailAddress());
        respuesta.put("uuid", faker.internet().uuid());
        return respuesta;
    }
    
    @RequestMapping(path = "/gotpersonaje", method=RequestMethod.GET)
    public Map<String, Object> gotPersonaje() {
        Map<String, Object> respuesta = new HashMap<>();
        Faker faker = new Faker();
        respuesta.put("personaje", faker.gameOfThrones().character());
        return respuesta;
    }
    
}
