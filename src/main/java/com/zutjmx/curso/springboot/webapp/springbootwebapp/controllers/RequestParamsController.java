package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;
import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.dto.ParametroDto;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parametros")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParametroDto foo(@RequestParam(required = false, defaultValue = "Hola Mundo", name = "mensaje") String mensaje) {
        Faker faker = new Faker(Locale.getDefault());
        String respuesta = faker.lebowski().quote();
        ParametroDto parametroDto = new ParametroDto();

        if (mensaje == null || mensaje.isEmpty()) {
            parametroDto.setMensaje(respuesta);
        } else {
            parametroDto.setMensaje(mensaje);
        }

        return parametroDto;
    }

    @GetMapping("/bar")
    public ParametroDto bar(@RequestParam String texto, @RequestParam Integer codigo) {
        ParametroDto parametroDto = new ParametroDto();
        parametroDto.setCodigo(codigo);
        parametroDto.setMensaje(texto);
        return parametroDto;
    }

    @GetMapping("/request")
    public ParametroDto request(HttpServletRequest request) {
        Integer codigo = 0;

        try {
            codigo = Integer.parseInt(request.getParameter("codigo"));
        } catch (Exception e) {
            ParametroDto parametroDtoError = new ParametroDto();
            parametroDtoError.setCodigo(codigo);
            parametroDtoError.setMensaje("Ocurrió un error al intentar convertir el código a un valor númerico.");
            return parametroDtoError;
        }

        ParametroDto parametroDto = new ParametroDto();
        parametroDto.setCodigo(codigo);
        parametroDto.setMensaje(request.getParameter("mensaje"));
        return parametroDto;
    }
    
        
}
