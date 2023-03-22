/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.practicos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio3eduVersion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese tamano del vector");

        int num = leer.nextInt();

        int vector[] = new int[num];        //vector de numeros
        int vectorAux[] = new int[num];     //vector auxiliar

        int[] cant = new int[num];
        int[] digitos = new int[5];

        int cont = 0;

        for (int i = 0; i < num; i++) {             //asigno numeros random
            vector[i] = random.nextInt(10000);

        }

        for (int i = 0; i < num; i++) {             //asigna a vector aux los valores
            vectorAux[i] = vector[i];               //de vector anterior
            do {
                cont++;                             //contador +1
                vectorAux[i] = (vectorAux[i] / 10);     //cada elem aux /10
            } while (vectorAux[i] / 10 != 0);           //hasta que no se pueda dividir

            cant[i] = cont + 1;
            digitos[cont]++;                //suma +1 al vector contador de digitos
            cont = 0;                               //resetea contador
        }
        
        for (int i = 0; i < num; i++) { 
       
            System.out.print(vector[i] + " / ");        //genera la matriz de numeros
        }
        System.out.println("");
        
        for (int i = 0; i < num; i++) {            //forma la matriz de la cantidad
            System.out.print(cant[i] + " / ");     //de digitos que tiene cada numero
        }
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {           //estadisticas
            System.out.println(digitos[i] + " tienen " + (i + 1) + " digitos");
        }
    }

}
