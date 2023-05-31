/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4peliculas;

import Servicio.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio4Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio serv = new PeliculaServicio();
        
        String resp = null;
        
        do {          
            
            serv.agregarPeli();
            System.out.println("Desea ingresar otra pelicula? s/n");
            resp = sc.next();
            
        } while (resp.equalsIgnoreCase("s"));
        
        System.out.println("Lista de peliculas");
        serv.mostrarLista();
        
        System.out.println("Peliculas mayores a 1 hora:");
        serv.mostrarDuracion1Hr();
        
        serv.mostrarOrden();
        
    }
    
}
