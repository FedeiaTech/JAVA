/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Persona {
    public String nombre, sexo;
    public int edad;
    public double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona() {
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese nombre");
        this.nombre = ingrese.next();
        
        System.out.println("Ingrese edad");
        this.edad = ingrese.nextInt();
        
        System.out.println("Seleccione el sexo (M/H/O)");
        do {
            this.sexo = ingrese.next().toUpperCase();
            if (!sexo.equals("M") && !sexo.equals("O") && !sexo.equals("H")) {
                System.out.println("Sexo incorrecto");
            } 
        } while (!sexo.equals("M") && !sexo.equals("O") && !sexo.equals("H"));
        
        System.out.println("Ingrese altura (cm)");
        this.altura = ingrese.nextDouble();
        
        System.out.println("Ingrese el peso (kg)");
        this.peso = ingrese.nextDouble();
    }
    
    public int calcularIMC() {
        double imc;
        
        imc = peso / Math.pow((altura/100), 2);
        
        if (imc > 25) {
            System.out.println("Esta en sobrepeso");
            return 1;
        } else if (imc <= 25 && imc >= 20) {
            System.out.println("Esta en su peso ideal");
            return 0;
    } else {
            System.out.println("Esta por debajo del peso ideal");
            return -1;
        }
    }
    
    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
