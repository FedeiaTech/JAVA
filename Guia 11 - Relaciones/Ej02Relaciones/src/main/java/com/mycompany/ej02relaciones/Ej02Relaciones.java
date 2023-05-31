/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej02relaciones;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ej02Relaciones {
    
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Cuantos jugadores desea crear?");
        int cant = ingrese.nextInt();
        
        
        List<Jugador> jugadores = new ArrayList<>();
        
        for (int i = 0; i < cant; i++) {
            Jugador jugador = new Jugador("Carlos", "Mendez", 20, 1);
            
            jugadores.add(jugador);
        }
        
        Equipo eq = new Equipo();
        
        eq.setEquipo(jugadores);
                
        for (Jugador aux : eq.getEquipo()) {
            System.out.println(aux.toString());
        }
        
        eq.;
        
        
        
    }
}
