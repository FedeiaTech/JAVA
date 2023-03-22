/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.practicos;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * //// 2 7 6 
 * ////	9 5 1 
 * ////	4 3 8
 *
 * @author iacon
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        //cargar valores
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un valor entre 1 y 9 para (" + i + ", " + j + ")");
                    matriz[i][j] = ingrese.nextInt();
                } while ((matriz[i][j] > 9) || (matriz[i][j] < 1));
            }
        }

        //muestra
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println(" ");
        }

        magica(matriz);
    }

    public static void magica(int[][] matriz) {

        //magic is true ***
        boolean magic = true;

        //valores de diagonal principal para referencia
        int diagp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagp += matriz[i][j];
                    System.out.print(diagp + " ");
                }
            }
        }
        System.out.println("/ Diagonal principal");

        //comprobacion de filas
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
                System.out.print(suma + " ");
            }
            if (suma != diagp) {
                magic = false;
                suma = 0;
            } else {
                suma = 0;
            }
            System.out.println("/ Fila " + i + ": " + magic);
        }

        //comprobacion de columnas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += matriz[j][i];
                System.out.print(suma + " ");
            }
            if (suma != diagp) {
                magic = false;
                suma = 0;
            } else {
                suma = 0;
            }
            System.out.println("/ Columna " + i + ": " + magic);
        }

        //compara la diagonal secundaria
        int jota = 3;
        for (int i = 0; i < 3; i++) {
            jota--;
            suma += matriz[i][jota];
            System.out.print(suma + " ");
        }
        if (suma != diagp) {
            magic = false;
        }
        System.out.println("/ Diagonal sec.: " + magic);

        if (magic) {
            System.out.println("La matriz es magica");
        } else {
                System.out.println("La matriz no es magica");
        }
    }
}
