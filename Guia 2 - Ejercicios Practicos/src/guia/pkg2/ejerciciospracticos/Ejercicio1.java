/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 El programa deberá después mostrar el resultado de la suma
 */
package guia.pkg2.ejerciciospracticos;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ingreso = new Scanner(System.in);
       int num;
       int num2;
       
       num = ingreso.nextInt();
       num2 = ingreso.nextInt();
       
        System.out.println(num + num2);
    }
    
}
