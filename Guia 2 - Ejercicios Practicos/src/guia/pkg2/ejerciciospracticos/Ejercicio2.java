/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package guia.pkg2.ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = ingrese.next();
        
        System.out.println("Hola " + nombre + "!");
                
    }
    
}
