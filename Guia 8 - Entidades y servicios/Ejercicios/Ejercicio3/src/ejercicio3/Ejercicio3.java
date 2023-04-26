/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidades.Persona;
import Services.PersonaServicio;

/**
 *
 * @author iacon
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio sp = new PersonaServicio();
        
        Persona p1 = new Persona("Carla", "M", 30, 60, 155);
        Persona p2 = new Persona("Andres", "H", 50, 90, 176);
        Persona p3 = new Persona("Maria", "M", 17, 53, 154);
        Persona p4 = sp.crearPersona();
        
        sp.mostrarInfo(p1);
        sp.mostrarInfo(p2);
        sp.mostrarInfo(p3);
        sp.mostrarInfo(p4);
        
       sp.estadisticas(p1, p2, p3, p4);
        
    }
    
}
