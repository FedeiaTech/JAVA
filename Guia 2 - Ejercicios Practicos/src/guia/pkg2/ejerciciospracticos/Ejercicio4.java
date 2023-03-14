/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
 La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia.pkg2.ejerciciospracticos;

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
       Scanner ingreso = new Scanner(System.in);
       int grados;
       float far;
       
       System.out.println("Ingrese temperatura en grados");
       grados = ingreso.nextInt();
       far = 32 + (9 * grados / 5);
       
       System.out.println("Son " + far + " grados Fahrenheit");
    }
    
}
