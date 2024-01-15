package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/detalles")
    public String detalles(Model modelo, Map<String, Object> mapa) {
        modelo.addAttribute("titulo", "Detalles");
        modelo.addAttribute("saludo", "Hola Mundo con SpringBoot y ThymeLeaf");
        modelo.addAttribute("nombre", "Jesús");
        modelo.addAttribute("paterno", "Zúñiga");
        modelo.addAttribute("materno", "Trejo");
        modelo.addAttribute("email", "zutjmx@gmail.com");
        mapa.put("twitter", "@zutjmx");
        return "detalles";
    }
}
