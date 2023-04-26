/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1ex;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ej1Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", 
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
    
        String mesSecreto = meses[(int) (Math.random() * 12)];
        System.out.println(mesSecreto);
        String mesUsuario = "";
        do {
            System.out.println("Adivine el mes secreto");
            mesUsuario = ingrese.next();

        } while (!mesUsuario.equalsIgnoreCase(mesSecreto));

        if (mesUsuario.equalsIgnoreCase(mesSecreto)) {
            System.out.println("¡Has acertado!");
        }
    }
}
