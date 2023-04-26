/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 *
 * @author iacon
 */
public class Rectangulo {

    private float base, altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner ingrese = new Scanner(System.in);

        System.out.println("Ingrese el valor de la altura");
        altura = ingrese.nextFloat();
        System.out.println("Ingrese el valor de la base");
        base = ingrese.nextFloat();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || j == base - 1 || i == altura - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                } 
            }
            System.out.println("");
        }
    }
    

    public float superficie() {
        return base * altura;
    }

    public float perimetro() {
        return base * 2 + altura * 2;
    }
}
