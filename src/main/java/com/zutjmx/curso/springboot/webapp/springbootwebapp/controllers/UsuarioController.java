package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

    @GetMapping("/listar")
    public String listar(ModelMap modelMap) {
        List<Usuario> usuarios = new ArrayList<>();
        Faker faker = new Faker(Locale.getDefault());
        int indice = faker.number().numberBetween(10, 20);
        //int indice = 0;
        for (int i = 0; i < indice; i++) {
            Usuario usuario = new Usuario(
                faker.name().firstName(), 
                faker.name().lastName(), 
                faker.name().lastName(), 
                faker.internet().emailAddress()
                );
            usuarios.add(usuario);
        }
        modelMap.addAttribute("titulo", "Listado de Usuarios");
        modelMap.addAttribute("usuarios", usuarios);
        return "listar";
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
