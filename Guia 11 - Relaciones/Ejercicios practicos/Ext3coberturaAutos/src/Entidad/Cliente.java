/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String domicilio;
    private String telefono;

    public Cliente(String nombre, String apellido, String dni, String email, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    
    public Cliente crearClienteAuto() {
        String nombre = "Carlos";
        String apellido = "Maidana";
        String dni = "14905541";
        String email = "elcarlosm16@arnet.com.ar";
        String domicilio = "H. Hirigoyen 1255";
        String telefono = "342 4985554";

        return new Cliente(nombre,apellido, dni, email, domicilio, telefono);
    }

    public Cliente crearClienteManual() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Nombre");
        String nombre = ingrese.nextLine();

        System.out.println("Apellido");
        String apellido = ingrese.nextLine();

        System.out.println("DNI");
        String dni = ingrese.nextLine();

        System.out.println("E-mail");
        String email = ingrese.nextLine();

        System.out.println("Domicilio");
        String domicilio = ingrese.nextLine();

        System.out.println("Telefono");
        String telefono = ingrese.nextLine();

        return new Cliente(nombre,apellido, dni, email, domicilio, telefono);
    }
}
