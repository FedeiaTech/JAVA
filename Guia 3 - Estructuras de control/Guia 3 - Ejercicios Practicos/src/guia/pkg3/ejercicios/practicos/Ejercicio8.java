/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.practicos;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
 * lo siguiente:
* * * *
*     *
*     *
* * * *

 * @author iacon
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del cuadrado");
        int num = ingrese.nextInt();
        
        for (int i=0; i < num; i++) {
            for (int j=0; j < num; j++) {
                if (((j == 0) || (j == num-1)) || ((i == 0) || (i == num-1))) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
