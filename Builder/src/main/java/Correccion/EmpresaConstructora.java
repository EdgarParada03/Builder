/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correccion;

/**
 *
 * @author edgar
 */
public class EmpresaConstructora {
    private HogarBuilder hogarBuilder;

    public void setHogarBuilder(HogarBuilder hb){
        hogarBuilder = hb;
    }
    
    public Hogar getHogar(){
        return hogarBuilder.getHogar();
    }
    
    public void contruirHogar(){
        hogarBuilder.crearNuevoHogar();
        hogarBuilder.buildLocalidad();
        hogarBuilder.buildDireccion();
        hogarBuilder.buildCiudad();
    }
     
}
