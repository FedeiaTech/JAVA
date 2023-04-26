/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio6grupoVersion {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String[][] sopa = new String[20][20];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingrese palabras de 3 a 5 caracteres: Nº" + (i + 1));
            palabras[i] = leer.next();
            while (palabras[i].length() > 5 || palabras[i].length() < 3) {
                System.out.println("Fuera de rango, reingrese");
                palabras[i] = leer.next();
            }
        }
        
        int I = 0, J = 0;
                
        for (int i = 0; i < palabras.length; i++) {
            I = (int)(Math.random()*19);
            J = (int)(Math.random()*14);
            if (sopa[I][J]==null) {
                for (int j = 0; j < palabras[i].length(); j++) {
                    sopa[I][j+J] = palabras[i].substring(j, j+1);
                }
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j]==null) {
                    //int caracter = (int)(Math.random()*9);
                    //sopa[i][j] = String.valueOf(caracter);
                    sopa[i][j] = String.valueOf((int)(Math.random()*9));
                }
            }
        }
      
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" [" + sopa[i][j] + "] ");
            }
            System.out.println("");
        }
    }

}
