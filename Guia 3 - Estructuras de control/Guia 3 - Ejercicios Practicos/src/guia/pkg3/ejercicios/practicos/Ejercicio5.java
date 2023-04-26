/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.practicos;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma de 
 * los números introducidos supere el límite inicial.
 * @author iacon
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        int lim, num, suma = 0;
         System.out.println("Ingrese un valor para el limite");
         lim = ingrese.nextInt();
        do {
            System.out.println("Ingrese un valor hasta llegar al limite");
            num = ingrese.nextInt();
            suma = suma + num;
        } while (suma < lim);
        
        System.out.println("Limite superado");
    }
    
}
