package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.javafaker.Faker;
import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.Usuario;

@Controller
public class UsuarioController {

    @GetMapping("/detalles")
    public String detalles(Model modelo, Map<String, Object> mapa) {
        Faker faker = new Faker(Locale.getDefault());
        Usuario usuario = new Usuario(faker.name().firstName(), 
                                    faker.name().lastName(), 
                                    faker.name().lastName(), 
                                    faker.internet().emailAddress());
        modelo.addAttribute("titulo", "Detalles");
        modelo.addAttribute("saludo", "Hola Mundo con SpringBoot y ThymeLeaf");
        modelo.addAttribute("usuario", usuario);
        //modelo.addAttribute("paterno", "Zúñiga");
        //modelo.addAttribute("materno", "Trejo");
        //modelo.addAttribute("email", "zutjmx@gmail.com");
        mapa.put("url", faker.internet().url());
        return "detalles";
    }
}
