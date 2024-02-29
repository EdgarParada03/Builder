/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correccion;

/**
 *
 * @author edgar
 * Esta es la clase producto
 */
public class Hogar {
    private String localidad;
    private String direccion;
    private String ciudad;

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Hogar{" + "localidad=" + localidad + ", direccion=" + direccion + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
