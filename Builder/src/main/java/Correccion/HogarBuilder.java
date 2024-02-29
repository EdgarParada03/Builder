/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correccion;

/**
 *
 * @author edgar
 */
public abstract class HogarBuilder {
    protected Hogar hogar; 

    public Hogar getHogar() {
        return hogar;
    }
    
    public void crearNuevoHogar(){
        hogar = new Hogar();
    }
    
    public abstract void buildLocalidad();
    public abstract void buildDireccion();
    public abstract void buildCiudad();
    
}
