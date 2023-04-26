/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.extra;

import java.util.Random;
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
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese 5 palabras de 3 a 5 caracteres:");
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.next();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres. Ingrese otra:");
                palabras[i] = sc.next();
            }
        }

        char[][] sopa = new char[20][20];
        
        int filaRandom[] = new int[20];
        int colRandom[] = new int[16];
        
        for (int i = 0; i < filaRandom.length; i++) {     // fila donde se ubicarán las palabras
            filaRandom[i] = rand.nextInt(20);
        }
        for (int i = 0; i < colRandom.length; i++) {     // columna donde se ubicarán las palabras
            colRandom[i] = rand.nextInt(16);
        }
    

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            for (int j = 0; j < palabra.length(); j++) {
//                sopa[filaRandom][colRandom + j] = palabra.charAt(j);
            }
        }

        // Rellenar los espacios no utilizados con números aleatorios
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (rand.nextInt(10) + '0'); // número aleatorio del 0 al 9
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}