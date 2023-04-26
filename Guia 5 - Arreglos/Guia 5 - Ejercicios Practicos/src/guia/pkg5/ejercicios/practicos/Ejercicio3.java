/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.practicos;

import java.util.Random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author iacon
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Random random = new Random();

        int[] contador = new int[6];    //contador de digitos

        System.out.println("Ingrese la cantidad de numeros");
        int n = ingrese.nextInt();

        int[] vector = new int[n];      //vector pedido

        for (int i = 0; i < n; i++) {           //genera numeros para vector
            vector[i] = random.nextInt(10001);
        }

        for (int i = 0; i < n; i++) {           //muestra vector
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {           //recorre vector para verificar digitos
            int digitos = 0;
            int numero = 0;

            while (numero != 0) {            //divide el elemento por 10
                numero /= 10;
                digitos++;
            }
            if (digitos >= 1 && digitos <= 5) {
                contador[digitos]++;
            }
        }

        for (int i = 1; i < contador.length; i++) {
            System.out.printf("Hay %d números de %d dígito(s)", contador[i], i);
        }

    }
}
