package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;
import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.Usuario;
import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.dto.UsuarioDto;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    
    @GetMapping("/detalles")
    public UsuarioDto getDetalles() {
        Faker faker = new Faker(Locale.getDefault());
        Usuario usuario = new Usuario(faker.name().firstName(), 
                                    faker.name().lastName(), 
                                    faker.name().lastName(),
                                    faker.internet().emailAddress());
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setUsuario(usuario);
        usuarioDto.setTitulo("Hola Mundo desde un RestController");
        return usuarioDto;
    }

    @GetMapping("/detalles-map")
    public Map<String, Object> getDetallesMap() {
        Map<String, Object> respuesta = new HashMap<>();
        Faker faker = new Faker(Locale.getDefault());
        Usuario usuario = new Usuario(faker.name().firstName(), 
                                    faker.name().lastName(), 
                                    faker.name().lastName(),
                                    faker.internet().emailAddress());
        respuesta.put("titulo", "Hola Mundo desde un RestController");
        respuesta.put("usuario", usuario);
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
