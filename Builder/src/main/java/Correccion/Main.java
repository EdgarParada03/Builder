/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Correccion;

/**
 *
 * @author edgar
 */
public class Main {
    public static void main(String[] args) {
        EmpresaConstructora empresaConstructora = new EmpresaConstructora();
        HogarBuilder casaBuilder = new Casa();
        HogarBuilder apartamentoBuilder = new Apartamento();
        
        
        empresaConstructora.setHogarBuilder(casaBuilder);
        empresaConstructora.contruirHogar();
        
        Hogar hogar = empresaConstructora.getHogar();
        
        System.out.println(hogar.getClass());
        
    }
}
