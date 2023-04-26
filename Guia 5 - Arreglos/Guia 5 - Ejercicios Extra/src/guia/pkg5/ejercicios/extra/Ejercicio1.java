/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.extra;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un 
 * vector de tamaño N, con los valores ingresados por el usuario.
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Cuantos numeros va a sumar?");
        int n = ingrese.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero a sumar");
            vector[i] = ingrese.nextInt();
        }
        
        int suma = 0;
        System.out.println("Se sumaran los siguientes numeros:");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " | ");
            suma += vector[i];
        }
        System.out.println("");
            
            System.out.println("R: " + suma);
    }
    
}
