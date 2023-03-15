/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package guia.pkg3.ejercicios.practicos;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar.
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = ingrese.nextInt();

        if (num%2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}


