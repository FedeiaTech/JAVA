/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Circunferencia.Circunferencia;

/**
 *
 * Declarar una clase llamada Circunferencia que tenga como atributo privado 
 * el radio de tipo real. A continuación, se deben crear los siguientes métodos:
* Método constructor que inicialice el radio pasado como parámetro.
* Métodos get y set para el atributo radio de la clase Circunferencia.
* Método para crearCircunferencia(): que le pide el radio y lo guarda
* en el atributo del objeto.
* Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
* Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 * @author iacon
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia redondo = new Circunferencia();
        
        redondo.crearCircunferencia();
        redondo.area();
        System.out.println(redondo.perimetro());
    }
    
}
