/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia.pkg2.ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = ingrese.nextLine();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
    
}
