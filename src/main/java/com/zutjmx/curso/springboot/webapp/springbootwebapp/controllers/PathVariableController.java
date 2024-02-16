package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.dto.ParametroDto;

import java.util.HashMap;
import java.util.Map;

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

    @GetMapping("/mix/{producto}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String producto, @PathVariable Long id) {
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("producto", producto);
        jsonMap.put("id", id);
        return jsonMap;
    }
    
}
