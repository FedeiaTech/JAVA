/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author iacon
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Fede","Iacono",33,true);
        
        System.out.println(persona1.nombre);
        
        persona1.setNombre("Jorge");
        
        System.out.println(persona1.getNombre());
        
        String varNombre = persona1.getNombre();
        System.out.println(varNombre);
    }
    
}
