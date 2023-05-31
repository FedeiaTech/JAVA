/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class AlumnoService {

    Scanner ingrese;
    List<Alumno> listaAlum;

    public AlumnoService() {
        ingrese = new Scanner(System.in).useDelimiter("\n");
        listaAlum = new ArrayList<>();
    }
    
    public Alumno crearAlumno() {

        List<Integer> not = new ArrayList<>();

        System.out.println("Ingrese el nombre");
        String nombre = ingrese.next();

        System.out.println("Ingrese las tres notas");
        not.add(ingrese.nextInt());
        not.add(ingrese.nextInt());
        not.add(ingrese.nextInt());

        return new Alumno(nombre, not);
    }
    
    public void crearLista() {
        listaAlum.add(crearAlumno());
    }
    
    public double notaFinal(String buscar) {
        for (Alumno aux : listaAlum) {

            if (aux.getNombre().equalsIgnoreCase(buscar)) {
                List<Integer> notas = aux.getNotas();
                
                double promedio = ((notas.get(0) + notas.get(1) + notas.get(2)) / 3);
                
                System.out.println("el promedio es " + promedio);
                return promedio;
            }
        }
        System.out.println("el alumno no se encuentra en la lista");
        return 0;
    }
}
