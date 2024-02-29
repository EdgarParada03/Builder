/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correccion;

/**
 *
 * @author edgar
 */
public class Casa extends HogarBuilder{

    @Override
    public void buildLocalidad() {
        hogar.setLocalidad("Usaquen");
    }

    @Override
    public void buildDireccion() {
        hogar.setDireccion("Carrera 45, #32-11");
    }

    @Override
    public void buildCiudad() {
        hogar.setCiudad("Bogota");
    }
    
}
