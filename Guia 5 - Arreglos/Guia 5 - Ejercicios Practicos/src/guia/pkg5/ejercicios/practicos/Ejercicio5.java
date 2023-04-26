/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.practicos;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica. Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa). A AT //// 0 -2 4 0 2 -4 ////	2 0 2 -2 0
 * -2 ////	-4 -2 0 4 2 0
 *
 * @author iacon
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] AT = new int[3][3];
        
        System.out.println("Ingrese valores de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = ingrese.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("Ingrese valores de la matriz antisimetrica");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                AT[i][j] = ingrese.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }

        boolean anti = anti(A, AT);
        if (anti) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

    public static boolean anti(int[][] A, int[][] AT) {

        boolean anti = true;
        int[][] aux = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux[j][i] = -(A[i][j]);
                if (aux[i][j] != AT[i][j]) {
                    anti = false;
                }
            }
        }
        return anti;
    }
}
