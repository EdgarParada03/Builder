/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author edgar
 */
public class Builder {

    private String nombre;
    private String apellidos;
    private String email;
    private String estadoCivil;

    public Builder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Builder setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }
}
