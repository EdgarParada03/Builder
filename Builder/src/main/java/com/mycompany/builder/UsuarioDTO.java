/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author edgar
 */
public class UsuarioDTO {
    private final String nombre;
    private final String apellidos;
    private final String email;
    private final String estadoCivil;

    public UsuarioDTO(String nombre, String apellidos, String email, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.estadoCivil = estadoCivil;
    }
    
    public UsuarioDTO(Builder builder){
        this.nombre = builder.nombre;
        this.apellidos = builder.apellidos;
        this.email = builder.email;
        this.estadoCivil = builder.estadoCivil;

    }
    
    public static class Builder{
        private  String nombre;
        private  String apellidos;
        private  String email;
        private  String estadoCivil;

        public UsuarioDTO.Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UsuarioDTO.Builder setApellidos(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }

        public UsuarioDTO.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UsuarioDTO.Builder setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }
        
        public UsuarioDTO build(){
            if (nombre == null) {
                nombre = " ";
            }
            //Aqui pueden ir nuestras validaciones 
            return new UsuarioDTO(this);
        }
        
    }
    
}
