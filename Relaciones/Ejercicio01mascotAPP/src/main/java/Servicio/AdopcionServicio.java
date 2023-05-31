/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class AdopcionServicio {
    public Persona crearPersona() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(ingrese.next());
        System.out.println("Ingrese el apellido");
        persona.setApellido(ingrese.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(ingrese.nextInt());
        System.out.println("Ingrese DNI");
        persona.setDocumento(ingrese.next());
        return persona;
    }
    
    public Perro crearPerro() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro");
        perro.setNombre(ingrese.next());
        System.out.println("Ingrese el apellido");
        perro.setApellido(ingrese.next());
        System.out.println("Ingrese la edad");
        perro.setEdad(ingrese.nextInt());
        System.out.println("Ingrese DNI");
        perro.setDocumento(ingrese.next());
        return perro;
    }
}
