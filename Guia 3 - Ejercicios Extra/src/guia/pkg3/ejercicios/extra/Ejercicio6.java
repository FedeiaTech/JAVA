/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.extra;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas 
 * que se encuentran por debajo de 1.60 mts. y el promedio de estaturas 
 * en general.
 * @author iacon
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de personas");
        int n = ingrese.nextInt();
        float alt;
        float prombajo = 0;
        float promgral = 0;
        int prom = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el valor de altura de la persona " + i);
            alt = ingrese.nextFloat();
            if (alt < 1.6) {
                prombajo = prombajo + alt;
                prom++;
            }
            promgral = (promgral + alt);
            System.out.println(promgral);
        }
        promgral=promgral/n;
        double promg = Math.round(promgral*100);
        prombajo = (Math.round(prombajo/prom*100)/100);
        System.out.println("El promedio general de alturas es " + promg);
        System.out.println("El promedio general de alturas menores a 1.60 es " + prombajo);
    }
    
}
