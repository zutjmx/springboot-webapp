package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.dto.ParametroDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{mensaje}")
    public ParametroDto baz(@PathVariable(name = "mensaje") String mensaje) {
        ParametroDto parametroDto = new ParametroDto();
        parametroDto.setMensaje(mensaje);
        return parametroDto;
    }
    
}
