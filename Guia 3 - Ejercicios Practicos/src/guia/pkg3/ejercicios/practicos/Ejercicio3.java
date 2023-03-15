/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
package guia.pkg3.ejercicios.practicos;

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
        int longitud;
        
        do {
            System.out.print("Introduce una frase o palabra de 8 caracteres: ");
            frase = ingrese.nextLine();
               longitud = frase.length();
            if (longitud == 8) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        } while (longitud != 8);
    }
}

