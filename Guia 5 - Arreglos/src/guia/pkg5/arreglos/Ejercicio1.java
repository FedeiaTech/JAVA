/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.arreglos;

import java.util.Scanner;

/**
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus 
 * nombres más adelante.
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        String[] equipo = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un nombre");
            equipo[i] = ingrese.next();
        }
        
        for (int i = 0; i < 5; i++) {
               System.out.println("[" + equipo[i] + "]");
        }
    }
    
}
