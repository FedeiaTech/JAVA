/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class CursoService {
    Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = ingrese.next();
        
        System.out.println("Ingrese el turno");
        String turno = ingrese.next();
        
        System.out.println("Ingrese cantidad de alumnos del curso");
        int cant = ingrese.nextInt();
        String[] alumnos = new String[cant];
        cargarAlumnos(alumnos);
        
        System.out.println("Ingrese la cantidad horas de clase por dia");
        int cantidadHoras = ingrese.nextInt();
        
        System.out.println("Ingrese la cantidad de dias por semana");
        int vecesSemana = ingrese.nextInt();
        
        System.out.println("Ingrese el precio por hora");
        int precioPorHora = ingrese.nextInt();
        
        return new Curso(nombreCurso, turno, alumnos, cantidadHoras, vecesSemana, precioPorHora);
    }

    public void cargarAlumnos(String[] alumnos) {
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nombre del alumno: " + (i + 1));
            alumnos[i] = ingrese.next();
        }
        
    }
    
    public void calcularGananciaSemanal(Curso curso1){
        
        System.out.println("La ganancia semanal es: " + (curso1.getCantidadHoras()*curso1.getPrecioPorHora()*curso1.getAlumnos().length)*curso1.getVecesSemana());
    }


}
