/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package guia.pkg3.ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ingrese = new Scanner(System.in);
       String frase;
       
        System.out.println("Ingrese una frase");
        frase = ingrese.nextLine();
        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("Correcto");
            
        } else {
                    System.out.println("Incorrecto");
                    }
    }
    
}
