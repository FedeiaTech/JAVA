/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg3.ejercicios.practicos;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
* la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
* y toda secuencia distinta de FDE, que no respete el formato se considera
* incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
* lecturas correctas e incorrectas recibidas. Para resolver el ejercicio 
* deberá investigar cómo se utilizan las siguientes funciones de Java
* Substring(), Length(), equals().

 * @author iacon
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        String valor;
        int suma = 0;
        int sumainc = 0;
        do {
            System.out.println("Ingrese los valores del dispositivo");
            valor = ingrese.nextLine();
            if (valor.length() <= 5 ){
                if (valor.substring(0, 1).equals("X") && valor.substring(valor.length()-1).equals("O")) {
                    suma++;
                } else {
                sumainc++;
                }
            } else {
                sumainc++;
            }
        } while (!valor.equals("&&&&&") );
        
        System.out.println("Corectas :" + suma);
        System.out.println("Incorrectas: " + (sumainc - 1));
    }
   
}
