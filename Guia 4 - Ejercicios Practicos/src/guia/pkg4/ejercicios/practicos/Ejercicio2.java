/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.ejercicios.practicos;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima 
 * los datos de las personas ingresadas por teclado e indique si son mayores 
 * o menores de edad. Después de cada persona, el programa debe preguntarle al 
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 * @author iacon
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        String respuesta;
        do {
            String nombre = "";
            int edad = 0;
            respuesta = datos(nombre, edad);
            
        } while (!respuesta.equalsIgnoreCase("no"));
        
    }
    
    public static String datos(String nombre, int edad) {
        Scanner ingrese = new Scanner(System.in);
        String respuesta;
        System.out.println("Ingrese un nombre");
        nombre = ingrese.next();
        System.out.println("Ingrese edad");
        edad = ingrese.nextInt();
        if (edad < 18) {
            System.out.println("El personaje no es mayor de edad");
        } else {
            System.out.println("La persona es mayor");
        }
        System.out.println("Desea continuar ingresando datos");
        respuesta = ingrese.next();
            return respuesta;
        
    }
}
