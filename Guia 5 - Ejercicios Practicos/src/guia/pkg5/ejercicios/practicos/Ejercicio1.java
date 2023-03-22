/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.practicos;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int [100];
        int largo = vector.length;
        
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
        
        for (int i = largo-1; i >= 0; i--) {
            
            System.out.println(vector[i]);
        }
    }
    
}
