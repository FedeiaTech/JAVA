/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.extra;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
 * su equivalente: 1 día, 2 horas.
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        int min, hora = 0, dias = 0;
        
        System.out.println("Ingrese la cantidad de minutos");
        min = ingrese.nextInt();
        
      
            dias = min / 1440;
            hora = (min % 1440)/60;
            min = min % 60;
        
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + min);
    }
    
}
