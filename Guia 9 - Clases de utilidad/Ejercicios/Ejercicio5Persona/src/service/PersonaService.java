/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class PersonaService {

    Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre");
        String nombre = ingrese.next();

        System.out.println("Ingrese año de nacimiento");
        int anio = ingrese.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = ingrese.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia = ingrese.nextInt();

        Date fechaNac = new Date(anio, mes, dia);

        return new Persona(nombre, fechaNac);
    }

    public int calcularEdad(Persona p) {
        Date fecha = new Date();

        int edad = 1900 + fecha.getYear()- p.getFechaNac().getYear() ;
        System.out.println("La edad de " + p.getNombre() + " es: " + edad);
        return edad;
    }

    public boolean menorQue(Persona p, int edad) {
        
        if (edad < calcularEdad(p)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarPersona(Persona p){
        Date fecha = new Date();
        
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + (p.getFechaNac().getDay() -1) + "/" + p.getFechaNac().getMonth() + "/" + p.getFechaNac().getYear());
        System.out.println("Fecha actual: " + fecha);
        System.out.println("Ingrese una edad para comparar");
        int edad = ingrese.nextInt();
        System.out.println("Es mayor que edad comparada: " + menorQue(p, edad));
    }
}
