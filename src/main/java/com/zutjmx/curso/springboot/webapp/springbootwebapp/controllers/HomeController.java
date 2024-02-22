package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"","/","/home"})
    public String inicio() {
        //return "redirect:/listar";
        return "forward:/listar";
    }
    
}
