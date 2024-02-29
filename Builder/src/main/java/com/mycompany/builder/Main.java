/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.builder;

/**
 *
 * @author edgar
 * https://www.youtube.com/watch?v=MRoZCgtQX1E&t=359s
 */
public class Main {

    public static void main(String[] args) {
        UsuarioDTO usuario1 = new UsuarioDTO.Builder()
                .setNombre("Juan")
                .setApellidos("Gonzalez")
                .setEmail("Juan@gmail.com")
                .setEstadoCivil("Soltero")
                .build();
    }
}
