/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package guia.pkg2.ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int num;
        float raiz;
        
        num = ingreso.nextInt();
        
        raiz = (float) Math.sqrt(num);
        
        System.out.println("El doble es: " + num*2);
        System.out.println("El triple es: " + num*3);
        System.out.println("La raiz es: " + raiz);
    }
    
}
