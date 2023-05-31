/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.alumnos;

import Service.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio3Alumnos {

    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

        AlumnoService servicio = new AlumnoService();
        String opcion = null;

        do {
            servicio.crearLista();
            System.out.println("quiere ingresar otro alumno? s/n");
            opcion = ingrese.next();
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("Ingrese nombre del alumno para calcular su nota final");
        String buscar = ingrese.next();
        servicio.notaFinal(buscar);
    }
}
