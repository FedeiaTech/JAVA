/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
 * números y los ingresa en los atributos del objeto. Después, a través de otro 
 * método calcular y devolver la distancia que existe entre los dos puntos que 
 * existen en la clase Puntos. Para conocer como calcular la distancia entre 
 * dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 * @author iacon
 */
public class Puntos {
    public double x1, x2, y1, y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
    
    public void crearPuntos() {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.print("x1: ");
        this.x1 = ingrese.nextDouble();
        System.out.print("y1: ");
        this.y1 = ingrese.nextDouble();
        
        System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.print("x2: ");
        this.x2 = ingrese.nextDouble();
        System.out.print("y2: ");
        this.y2 = ingrese.nextDouble();
    }
    
    public void calcular() {
        double resultado = Math.sqrt(Math.pow(this.x2 - this.x1,2) + Math.pow(this.y2 - this.y1,2));
        System.out.println("La distancia es " + resultado);
    }
}
