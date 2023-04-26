/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento 
 * salarial de un empleado en función de su edad y salario actual. 
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años 
 * o del 5% si tiene menos de 30 años.
 * @author iacon
 */
public class Empleado {
    public String nombre;
    public int edad;
    public int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento() {
    
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del empleado");
        this.nombre = ingrese.next();
        
        System.out.println("Ingrese la edad del empleado");
        this.edad = ingrese.nextInt();
        
        System.out.println("Ingrese sueldo del empleado");
        this.salario = ingrese.nextInt();
        
        if (edad >= 30) {
            System.out.println("Su edad supera los 30");
            System.out.println("El aumento sera de un 10%: " + (salario *0.1));
            System.out.println("El nuevo salario sera: " + (salario*0.1 + salario));
        } else {
            System.out.println("Su edad NO supera los 30");
            System.out.println("El aumento sera de un 5%: " + (salario *0.05));
            System.out.println("El nuevo salario sera: " + (salario*0.05 + salario));
        }
        
}
}
