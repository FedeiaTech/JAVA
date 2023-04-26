/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1ext;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio1Ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Cancion canto = new Cancion();
        
        System.out.println("Ingrese el titulo");
        canto.titulo = ingrese.next();
        System.out.println("Ingrese el autor");
        canto.autor = ingrese.next();
        
        System.out.println("El titulo es " + canto.titulo);
        System.out.println("El autor es " + canto.autor);
        
    }
    
}
