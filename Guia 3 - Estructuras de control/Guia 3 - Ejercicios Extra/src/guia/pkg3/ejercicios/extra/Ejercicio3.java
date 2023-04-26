/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.extra;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
 * la función equals() de la clase String.

 * @author iacon
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese una letra para determinar si es vocal o consonante");
        String letra = ingrese.nextLine();
        letra = letra.toUpperCase();
        
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println(letra + " es una vocal");
        } else {
            System.out.println(letra + " es una consonante");
        }
    }
    
}
