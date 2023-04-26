/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia() {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese el radio");
        radio = ingrese.nextDouble();
    }
    
    public void area() {
        double area = Math.pow(radio,2)*Math.PI;
        System.out.println(area);
    }
    
    public double perimetro() {
        double perimetro = radio * Math.PI *2;
        return perimetro;
    }
}
