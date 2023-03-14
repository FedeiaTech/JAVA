/*
 Implementar un programa que le pida dos números enteros al usuario y determine 
si ambos o alguno de ellos es mayor a 25.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ingrese = new Scanner(System.in);
    System.out.println("Ingrese dos numeros");
    int num1 = ingrese.nextInt();
    int num2 = ingrese.nextInt();
    
    if (  num1 > 25 || num2 > 25 ){ 
        System.out.println("alguno o ambos son mayores a 25");
    }
    else{
    System.out.println("ninguno es mayor a 25");
    }
        
        
    }
    
}
