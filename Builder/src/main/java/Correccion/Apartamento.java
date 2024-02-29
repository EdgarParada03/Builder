/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correccion;

/**
 *
 * @author edgar
 */
public class Apartamento extends HogarBuilder{

    @Override
    public void buildLocalidad() {
        hogar.setLocalidad("Cedritos");
    }

    @Override
    public void buildDireccion() {
        hogar.setDireccion("Carrera 69, #16-98");
    }

    @Override
    public void buildCiudad() {
        hogar.setCiudad("Bogota");
    }
    
}
