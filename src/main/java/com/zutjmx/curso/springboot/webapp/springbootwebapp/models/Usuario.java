package com.zutjmx.curso.springboot.webapp.springbootwebapp.models;

public class Usuario {
    private String nombre;
    private String paterno;
    private String materno;
    private String email;

    public Usuario(String nombre, String paterno, String materno, String email) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
