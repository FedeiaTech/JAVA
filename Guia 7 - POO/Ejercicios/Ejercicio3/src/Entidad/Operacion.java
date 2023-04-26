package Entidad;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * * Crear una clase llamada Operacion que tenga como atributos privados numero1 
 * y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los 
* guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero,
* si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario
* el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera 
* a pasar una división por cero, el método devuelve 0 y se le informa al usuario
* el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
* 
 * @author iacon
 */
public class Operacion {
    private float num1, num2;

    public Operacion() {
    }

    public Operacion(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion() {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese primer valor");
        num1 = ingrese.nextFloat();
        System.out.println("Ingrese el segundo valor");
        num2 = ingrese.nextFloat();
    }
    
    public float sumar() {
        float suma = num1 + num2;
        return suma;
    }
    
    public float restar() {
        return num1 - num2;
    }
    
    public float multiplicar() {
        if (num1 != 0 || num2 != 0) {
        float multi = num1 * num2;
        return multi;
        } else {
            System.out.println("Una de las variables vale 0");
            return 0;
        }
    }
    
    public float dividir() {
        if (num1 != 0 || num2 != 0) {
        float div = num1 / num2;
        return div;
        } else {
            System.out.println("Una de las variables vale 0");
            return 0;
        }
    }
    
}
