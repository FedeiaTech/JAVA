/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class PersonaServicio {

    Scanner ingrese = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre de la persona");
        String nombre = ingrese.next();

        System.out.println("Ingrese el sexo de la persona(M/H/O)");
        String sexo = "";
        do {
            sexo = ingrese.next().toUpperCase();
            if (!sexo.equals("M") && !sexo.equals("O") && !sexo.equals("H")) {
                System.out.println("Ingrese correctamente el sexo");
            }
        } while (!sexo.equals("M") && !sexo.equals("O") && !sexo.equals("H"));

        System.out.println("Ingrese edad");
        int edad = ingrese.nextInt();

        System.out.println("Ingrese altura(cm)");
        double altura = ingrese.nextDouble();

        System.out.println("Ingrese peso(kg)");
        double peso = ingrese.nextDouble();

        return new Persona(nombre, sexo, edad, peso, altura);
    }

    public boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int calcularImc(Persona p) {
        double imc = p.getPeso() / (p.getAltura() * 0.02);
        if (imc < 20) {
            return (-1);
        } else if (imc <= 25 && imc >= 20) {
            return 0;
        } else {
            return 1;
        }
    }

    public void mostrarInfo(Persona p) {
        System.out.println("Persona: " + p.getNombre());
        System.out.println("Sexo: " + p.getSexo());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Mayor: " + this.esMayorDeEdad(p));
        System.out.println("IMC: " + this.calcularImc(p));
        System.out.println("");
    }

    public void estadisticas(Persona p1, Persona p2, Persona p3, Persona p4) {
        int bpeso = 0, ideal = 0, speso = 0;

        int vector[] = {this.calcularImc(p1), this.calcularImc(p2), this.calcularImc(p3), this.calcularImc(p4)};
        for (int i = 0; i < vector.length; i++) {
            switch (vector[i]) {
                case (-1):
                    bpeso++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    speso++;
                    break;
            }
        }
        
        boolean vector2[] = {this.esMayorDeEdad(p1), this.esMayorDeEdad(p2), this.esMayorDeEdad(p3), this.esMayorDeEdad(p4)};
        int mayor = 0, menor = 0;

        for (int i = 0; i < vector.length; i++) {
            if (!vector2[i]) {
                menor++;
            } else {
                mayor++;
            }                           
        }
        
        System.out.println("Cantidad de personas con sobrepeso: " + speso);
        System.out.println("Cantidad de personas con peso ideal: " + ideal);
        System.out.println("Cantidad de personas con bajo peso: " + bpeso);
        System.out.println("Porcentaje de personas con sobrepeso: " + (speso*100)/4);
        System.out.println("Porcentaje de personas con peso ideal: " + (ideal*100)/4);
        System.out.println("Porcentaje de personas con bajo peso: " + (bpeso*100)/4);
        System.out.println("Cantidad de mayores: " + mayor);
        System.out.println("Cantidad de menores: " + menor);
        System.out.println("Porcentaje de menores: " + (menor*100)/4);
        System.out.println("Porcentaje de mayores: " + (bpeso*100)/4);
    }
    
}
