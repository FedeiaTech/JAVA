/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio02pistola;

import Entidad.Jugador;
import Entidad.Revolver;
import Servicio.RuletaServicio;
import java.util.ArrayList;

/**
 *
 * @author iacon
 */
public class Ejercicio02pistola {

    public static void main(String[] args) {
        RuletaServicio serv = new RuletaServicio();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Revolver revolver = new Revolver();

        System.out.println("Creando Juego");
        serv.llenarJuego(jugadores, revolver);
        System.out.println("");
        System.out.println("Posicion actual " + revolver.getPosActual());
        System.out.println("Posicion agua " + revolver.getPosAgua());
        System.out.println("");

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Posicion actual " + revolver.getPosActual());
            System.out.println("Posicion agua " + revolver.getPosAgua()); 
            boolean mojado = serv.ronda(jugadores.get(i), revolver);
            
            if (serv.disparo(jugadores.get(i), revolver)) {
                System.out.println("El " + jugadores.get(i).getNombre() + " ha caido");
            } else {
                System.out.println("El " + jugadores.get(i).getNombre() + " sigue en pie");
                System.out.println("");
                serv.sigChorro(revolver);
            }

            if (mojado) {
                break;
            }
        }
    }
}
