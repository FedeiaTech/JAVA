/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7extext;

import Persona.Persona;

/**
 *
 * @author iacon
 */
public class Ejercicio7ExtExt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona humano1 = new Persona();
        Persona humano2 = new Persona("Carla", "m", 30, 60, 155);
        Persona humano3 = new Persona("Roberte", "o", 24, 90, 192);
        Persona humano4 = new Persona("Jussepe", "h", 53, 40, 175);
        
        humano1.crearPersona();
        System.out.println(humano1.nombre);
        
        int imc = humano1.calcularIMC();
        System.out.println("IMC: " + imc);
        
        boolean mayor = humano1.esMayorDeEdad();
        System.out.println("Mayor: " + mayor);
        System.out.println("");
        
        System.out.println(humano2.nombre);
        int imc2 = humano2.calcularIMC();
        System.out.println("IMC: " + imc2);
        boolean mayor2 = humano2.esMayorDeEdad();
        System.out.println("Mayor: " + mayor2);
        System.out.println("");
        
        System.out.println(humano3.nombre);
        int imc3 = humano3.calcularIMC();
        System.out.println("IMC: " + imc3);
        boolean mayor3 = humano3.esMayorDeEdad();
        System.out.println("Mayor: " + mayor3);
        System.out.println("");
        
        System.out.println(humano4.nombre);
        int imc4 = humano4.calcularIMC();
        System.out.println("IMC: " + imc4);
        boolean mayor4 = humano4.esMayorDeEdad();
        System.out.println("Mayor: " + mayor4);
        System.out.println("");
    }
    
}
