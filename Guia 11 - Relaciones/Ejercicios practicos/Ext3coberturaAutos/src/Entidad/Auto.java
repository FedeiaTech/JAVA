/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Auto {

    private String marca;
    private String modelo;
    private String anio;
    private String motor;
    private String chasis;
    private String tipo;

    public Auto(String marca, String modelo, String anio, String motor, String chasis, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.chasis = chasis;
        this.tipo = tipo;
    }

    public Auto() {
    }

    
    public Auto crearAutoAuto() {
        String marca = "Folsfaguem";
        String modelo = "Sedan";
        String anio = "2018";
        String motor = "klm19gd4995srtf";
        String chasis = "lmt65h7ytvb95f";
        String tipo = "Auto";
        
        return new Auto(marca, modelo, anio, motor, chasis, tipo);
    }
    
    public Auto crearAutoManual() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Marca");
        String marca = ingrese.nextLine();
        
        System.out.println("Modelo");
        String modelo = ingrese.nextLine();
        
        System.out.println("Año");
        String anio = ingrese.nextLine();
        
        System.out.println("Numero de motor");
        String motor = ingrese.nextLine();
        
        System.out.println("Numero de chasis");
        String chasis = ingrese.nextLine();
        
        System.out.println("Tipo");
        String tipo = ingrese.nextLine();
        
        return new Auto(marca, modelo, anio, motor, chasis, tipo);
    }
}
