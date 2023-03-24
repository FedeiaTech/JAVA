/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.extra;

import java.util.Random;
import java.util.Scanner;

/**
 * Crear una función que rellene un vector con números aleatorios, pasándole un 
 * arreglo por parámetro. Después haremos otra función o procedimiento que 
 * imprima el vector.
 * @author iacon
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int m = ingrese.nextInt();
        
        int[] vector = relleno(m);
            
        imprimir(vector, m);
    }
    
    public static int[] relleno(int m) {
        Random random = new Random();
    
        int[] vector = new int[m];
        
        for (int i = 0; i < m; i++) {
            vector[i] = random.nextInt(10);
        }
    
        return vector;
    }
    
    public static void imprimir(int[] vector, int m) {
        
        for (int i = 0; i < m; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
