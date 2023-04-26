/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

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
public class Juego {

    public int num1, num2;

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean iniciar_juego(boolean puntos) {
        Scanner ingrese = new Scanner(System.in);

        int intentos;
        boolean punto = false;
        
        System.out.println("ADIVINE EL NUMERO");
        System.out.println("JUGADOR 1: Ingrese el valor a adivinar");
        this.num1 = ingrese.nextInt();
        System.out.println("JUGADOR 1: Ingrese la cantidad de intentos");
        intentos = ingrese.nextInt();

        System.out.println("JUGADOR 2: Intente adivinar el numero");
        this.num2 = ingrese.nextInt();

        do {
            intentos--;
            if (this.num2 > this.num1) {
                System.out.println("El numero es menor");                
                System.out.println("Le quedan " + intentos + " intentos");
                
            } else if (this.num2 < this.num1) {
                System.out.println("El numero es mayor");                
                System.out.println("Le quedan " + intentos + " intentos");
            } else {
                break;
            }
            if (intentos > 0) {
                System.out.println("Intente de nuevo");
                this.num2 = ingrese.nextInt();
            }
        } while (intentos > 0);
        
        if (this.num2 == this.num1) {
            System.out.println("Fin del juego");
            System.out.println("Ganador: JUGADOR 2");
            return punto = false;
        } else {
            System.out.println("Fin del juego");
            System.out.println("Ganador: JUGADOR 1");
            return punto = true;
        }
    }

}
