package com.zutjmx.curso.springboot.webapp.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.Usuario;
import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.dto.ParametroDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.codigo}")
    private Integer codigo;

    @Value("${config.username}")
    private String username;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.listaDeValores}")
    private List<String> listaDeValores;

    @Value("#{'${config.listaDeValores}'.toUpperCase().split(',')}")
    private List<String> valoresLista;

    @Value("#{'${config.listaDeValores}'.toUpperCase()}")
    private String valorCadena;

    @Value("${mensaje.autor}")
    private String autor;

    @Value("${mensaje.vocalesacento}")
    private String vocalesacento;

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

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        usuario.setNombre(usuario.getNombre().toUpperCase());
        usuario.setPaterno(usuario.getPaterno().toUpperCase());
        usuario.setMaterno(usuario.getMaterno().toUpperCase());
        return usuario;
    }
    
    @GetMapping("/valores")
    public Map<String, Object> valores(@Value("${config.saludo}") String saludo) {
        Map<String, Object> jsonMap = new HashMap<>();
        
        jsonMap.put("codigo", codigo);
        jsonMap.put("username", username);
        jsonMap.put("mensaje", mensaje);
        jsonMap.put("listaDeValores", listaDeValores);
        jsonMap.put("saludo", saludo);
        jsonMap.put("autor", autor);
        jsonMap.put("vocalesacento", vocalesacento);
        jsonMap.put("valoresLista", valoresLista);
        jsonMap.put("valorCadena", valorCadena);

        return jsonMap;
    }
    
}
