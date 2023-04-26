/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.practicos;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio5MeliVersion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerNum = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizAT = new int[3][3];
        int i, j;
        boolean esAntisimetrica = false;

        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.println("Ingrese el valor a cargar");
                matrizA[i][j] = leerNum.nextInt();
                matrizAT[i][j] = matrizA[i][j];
            }
        }
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("Matriz traspuesta");
        System.out.println("");
        for (j = 0; j < matrizAT.length; j++) {
            for (i = 0; i < matrizAT.length; i++) {
                System.out.print("[" + matrizAT[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println(" ");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == -matrizAT[j][i]) {
                    esAntisimetrica = true;
                    break;
                }
            }
        }
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }
    }
}