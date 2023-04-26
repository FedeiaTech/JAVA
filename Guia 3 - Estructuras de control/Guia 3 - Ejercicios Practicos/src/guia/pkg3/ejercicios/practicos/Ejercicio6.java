/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.practicos;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 * @author iacon
 */
public class Ejercicio6 {
//
//    /**
//     * @param args the command line arguments
//     */

    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros");
        int num1 = ingrese.nextInt();
        int num2 = ingrese.nextInt();
        int menu;
        String salir = "N";

        do {
            System.out.println("MENU:");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            menu = ingrese.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("La suma de ambos numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta entre ambos numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de ambos numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El cociente entre numeros es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Desea Continuar (S/N)");
                    salir = ingrese.next();
                    break;
                default:
                    break;
            }
            
            
        } while (salir == "N");

    }

}
