/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
 * "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un 
 * objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el 
 * área del rectángulo.
 * @author iacon
 */
public class Rectangulo {
    public int lado1, lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area() {
        
        double area = lado1 * lado2;
        
        System.out.println("el area es " + area);
    }
}
