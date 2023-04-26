/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3ext;

import Entidad.Juego;
import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 *
 * @author iacon
 */
public class Ejercicio3Ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego adivinar = new Juego();
        Scanner ingrese = new Scanner(System.in);

        int p1 = 0;
        int p2 = 0;
        String respuesta;
        boolean puntos = false;

        do {
            puntos = adivinar.iniciar_juego(puntos);
            if (!puntos) {
                p2++;
            } else {
                p1++;
            }
            System.out.println("Puntaje jugador 1: " + p1);
            System.out.println("Puntaje jugador 2: " + p2);
            System.out.println("desea continuar? (SI/NO)");
            respuesta = ingrese.next();
        } while (respuesta.equals("SI"));
    }
}
