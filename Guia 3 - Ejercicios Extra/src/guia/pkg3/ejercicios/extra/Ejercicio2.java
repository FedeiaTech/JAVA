/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.extra;

import java.util.Scanner;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
 * diferente a cada una. A continuación, realizar las instrucciones necesarias 
 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D 
 * y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
 * de cada variable. Utilizar sólo una variable auxiliar.

 * @author iacon
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        System.out.println("Ingrese el valor de cuatro variables");
        
        int a = ingrese.nextInt();
        int b = ingrese.nextInt();
        int c = ingrese.nextInt();
        int d = ingrese.nextInt();
        int aux;
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        System.out.println("Valor de C: " + c);
        System.out.println("Valor de D: " + d);
    }
    
}
