/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.subprogramas;

import java.util.Scanner;

/**
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
 * usuario, validando que el primer número múltiplo del segundo e imprima si
 * el primer número es múltiplo del segundo, sino informe que no lo son.

 * @author iacon
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese dos numeros");
        num1 = ingrese.nextInt();
        num2 = ingrese.nextInt();
        
        EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int num1, int num2) {
   	 if (num1 % num2 == 0) {
             System.out.println("El primer numero ingresado es multiplo del segundo");
         } else {
             System.out.println("El primer numero ingresado NO es multiplo del segundo");
         }
    	
    }
}
