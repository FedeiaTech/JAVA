/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class NIFService {

    Scanner ingrese = new Scanner(System.in);

    public NIF crearNif() {
        
        //se declara la variable con todos los caracteres
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        //se declara el vector frase con el largo de la frase
        char[] frase = new char[caracteres.length()];
        //se declara e inicializa letra
        char letra = ' ';

        //variable dni
        System.out.println("Ingrese el DNI");
        long dni = ingrese.nextLong();
        long pos = dni % 23;
        
        //llenado del vector con los caracteres de la variable
        for (int i = 0; i < frase.length; i++) {
            frase[i] = caracteres.charAt(i);
            if (i == pos) {
                letra = (frase[i]);
            }
        }
        
        return new NIF(dni, letra);
    }
    
    public void mostrar(NIF p) {
        System.out.println("Digito verificador");
        System.out.println(p.getDni() + "-" + p.getLetra());
    }
}
