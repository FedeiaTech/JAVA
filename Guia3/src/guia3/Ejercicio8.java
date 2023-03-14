/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ingrese = new Scanner(System.in);
       
       int nota = -1;
       
        while (nota > 10 || nota < 0){
            System.out.println("Ingrese una nota valida");
            nota = ingrese.nextInt();
        }
        
    }
    
}
