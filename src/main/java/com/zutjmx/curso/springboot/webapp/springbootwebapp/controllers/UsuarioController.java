package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.javafaker.Faker;
import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.Usuario;
import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.dto.UsuarioDto;

@Controller
public class UsuarioController {

    @GetMapping("/detalles")
    public UsuarioDto detalles() {
        Faker faker = new Faker(Locale.getDefault());
        Usuario usuario = new Usuario(faker.name().firstName(), 
                                    faker.name().lastName(), 
                                    faker.name().lastName(), 
                                    faker.internet().emailAddress());
        usuario.setUrl(faker.internet().url());
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setUsuario(usuario);
        usuarioDto.setTitulo("Detalles");
        usuarioDto.setSaludo("Hola Mundo con SpringBoot y ThymeLeaf");
        return usuarioDto;
    }

    @GetMapping("/detalles-modelo-map")
    public String detallesModeloMap(Model modelo, Map<String, Object> mapa) {
        Faker faker = new Faker(Locale.getDefault());
        Usuario usuario = new Usuario(faker.name().firstName(), 
                                    faker.name().lastName(), 
                                    faker.name().lastName(), 
                                    faker.internet().emailAddress());
        modelo.addAttribute("titulo", "Detalles");
        modelo.addAttribute("saludo", "Hola Mundo con SpringBoot y ThymeLeaf");
        modelo.addAttribute("usuario", usuario);
        mapa.put("url", faker.internet().url());
        return "detalles-modelo-map";
    }

}
