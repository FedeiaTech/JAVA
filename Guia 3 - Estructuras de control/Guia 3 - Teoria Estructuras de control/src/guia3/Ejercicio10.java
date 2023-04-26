/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5   *****
3   ***
11  ***********
2   **
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        int num1 = ingrese.nextInt();
        int num2 = ingrese.nextInt();
        int num3 = ingrese.nextInt();
        int num4 = ingrese.nextInt();

        System.out.print(num1);

        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num2);

        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num3);

        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print(num4);

        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}


