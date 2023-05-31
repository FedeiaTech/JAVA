/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class ServicioMascota {

    private List<Perro> listaPerros = new ArrayList<>();
    private List<Persona> listaAdoptantes = new ArrayList<>();

    
    public Perro crearMascota() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del perro");
        String nombre = ingrese.next();
        System.out.println("Ingrese la raza");
        String raza = ingrese.next();
        System.out.println("ingrese la edad");
        int edad = ingrese.nextInt();
        System.out.println("Ingrese el tama\u00f1o");
        String tam = ingrese.next();

        return new Perro(nombre, raza, edad, tam);
    }

    public void menuPerros() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Cuantos perros desea crear");
        int cantPerros = ingrese.nextInt();

        for (int i = 0; i < cantPerros; i++) {
            System.out.println("Desea personalizar perro " + (i+1) +"? (s/n)");
            String opcion = ingrese.next();
            if (opcion.equalsIgnoreCase("s")) {
                listaPerros.add(this.crearMascota());
            } else {
                listaPerros.add(new Perro("Perro", "Mestizo", 8, "mediano"));
            }
        }
        System.out.println("Lista de perros:");
        this.mostrarPerrosDisponibles();
    }

    public void mostrarPerrosDisponibles() {
        for (Perro perros : listaPerros) {
            System.out.println("Nombre: " + perros.getNombre());
            System.out.println("Raza: " + perros.getRaza());
            System.out.println("Edad: " + perros.getEdad());
            System.out.println("Tamaño: " + perros.getTam());
            System.out.println("-----");
        }
    }

    public void crearPersona() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese los datos del adoptante");
        System.out.println("Nombre");
        String nombre = ingrese.next();
        System.out.println("Apellido");
        String apellido = ingrese.next();
        System.out.println("Ingrese su edad");
        int edad = ingrese.nextInt();
        System.out.println("DNI");
        String dni = ingrese.next();

        System.out.println("Que perro de la lista desea adoptar?");
        this.mostrarPerrosDisponibles();
        System.out.println("--------------");

        boolean decision = false;
        Perro perroAdoptado = new Perro();
        do {
            System.out.println("Escriba el nombre");
            String nombrePerro = ingrese.next();
            for (Perro aux : listaPerros) {
                if (nombrePerro.equalsIgnoreCase(aux.getNombre())) {
                    perroAdoptado.setNombre(aux.getNombre());
                    perroAdoptado.setRaza(aux.getRaza());
                    perroAdoptado.setEdad(aux.getEdad());
                    perroAdoptado.setTam(aux.getTam());
                    listaPerros.remove(aux);
                    decision = true;
                    break;
                }
            }
            if (!decision) {
                System.out.println("el perro no se encuentra en la lista");
            }
        } while (!decision);
        
        this.listaAdoptantes.add( new Persona(nombre, apellido, edad, dni, perroAdoptado));
    }
    
    public void mostrarListaAdoptantes() {
        for (Persona personas : listaAdoptantes) {
            System.out.println("Lista de adoptantes:");
            System.out.println(personas.toString());
            System.out.println("-----");
        }
    }
    
    public void mostrarCantidadPerros() {
        System.out.println("Aun quedan " + listaPerros.size() + " perros para la dopcion :)");
    }
}
