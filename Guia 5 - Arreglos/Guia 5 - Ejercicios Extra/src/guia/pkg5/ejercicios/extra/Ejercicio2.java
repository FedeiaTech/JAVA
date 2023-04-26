/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.extra;

import java.util.Random;
import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia 
 * entre los elementos).
 * 
 * @author iacon
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Ingrese la dimension de los vectores");
        int n = ingrese.nextInt();
        
        int[] vector = new int[n];
        int[] vector2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(4);
            vector2[i] = random.nextInt(4);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " | ");
            System.out.println(vector2[i]);
        }
        
        for (int i = 0; i < n; i++) {
            if (vector[i] != vector2[i]) {
                System.out.println("Detenido en fila " + i);
                break;
            } else if ((vector[i] == vector2[i]) && (i == n-1)) {
                System.out.println("Los vectores son iguales");
            }
        }
    }
    
}
