package com.zutjmx.curso.springboot.webapp.springbootwebapp.models.dto;

import com.zutjmx.curso.springboot.webapp.springbootwebapp.models.Usuario;

public class UsuarioDto {
    private String titulo;
    private String saludo;
    private Usuario usuario;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getSaludo() {
        return saludo;
    }
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
}
