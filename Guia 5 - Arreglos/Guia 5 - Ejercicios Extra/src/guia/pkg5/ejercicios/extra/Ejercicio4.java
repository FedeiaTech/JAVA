/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.extra;

import java.util.Random;
import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro 
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad 
 * de aprobados y desaprobados. Durante el período de cursado cada alumno 
 * obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
 * Las ponderaciones de cada nota son:
 * 
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
 * Al final del programa los profesores necesitan obtener por pantalla la 
 * cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban 
 * los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 * @author iacon
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Random random = new Random();
        
        double[] notas = new double[10];      //notas de los 10 alumnos
        
        for (int i = 0; i < 10; i++) {
            float tp1 = random.nextInt(10);
            float tp2 = random.nextInt(10);
            float int1 = random.nextInt(10);
            float int2 = random.nextInt(10);

            notas[i] = (tp1*0.1 + tp2*0.15 + int1*0.25 + int2*0.5);
            
            System.out.println("Alumno " + i + ":");
            System.out.println("Promedio " + notas[i]);            
        }
        int ap = 0;
        int desap = 0;
        
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 7) {
                ap++;
            } else {
                desap++;
            }
        }
        
        System.out.println("Cantidad de aprobados: " + ap);
        System.out.println("Cantidad de desaprobados: " + desap);
    }
    
}
