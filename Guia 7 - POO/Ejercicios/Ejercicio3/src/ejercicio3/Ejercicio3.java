/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidad.Operacion;

/**
 *
 * @author iacon
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion calculo = new Operacion();
        
        calculo.crearOperacion();
        System.out.println(calculo.sumar());
        System.out.println(calculo.restar());
        System.out.println(calculo.multiplicar());
        System.out.println(calculo.dividir());
        
    }
    
}
