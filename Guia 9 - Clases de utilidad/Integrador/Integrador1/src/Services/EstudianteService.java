/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidad.Estudiante;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class EstudianteService {

    Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] crearEst() {
        System.out.println("Ingrese la cantidad de estudiantes");
        int dimension = ingrese.nextInt();

        Estudiante[] lista = new Estudiante[dimension];
        ingrese.nextLine();

        String nombre;
        int nota;

        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese nombre del estudiante");
            nombre = ingrese.nextLine();
            nota = (int) (Math.random() * 9 + 1);

            Estudiante est = new Estudiante(nombre, nota);
            lista[i] = est;
        }

        return lista;
    }

    public void mostrarlista(Estudiante[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Nombre: " + lista[i].getNombre());
            System.out.println("Nota: " + lista[i].getNotas());
        }
    }

    public double promedio(Estudiante[] lista) {
        double prom = 0;

        for (int i = 0; i < lista.length; i++) {
            prom += lista[i].getNotas();
        }
        prom = prom / lista.length;

        System.out.println("El promedio de notas entre " + lista.length + " es de: " + prom);

        return prom;
    }

    public void notasMayores(Estudiante[] lista) {
        double prom = promedio(lista);
        int cont = 0;

        for (int i = 0; i < lista.length; i++) {    //arma la dimension de mayores con el contador

            if (lista[i].getNotas() >= prom) {
                cont++;
            }
        }

        String[] mayores = new String[cont];        //crea vector de promedios mayores
        int caminador = 0;                          //caminador del segundo vector
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getNotas() >= prom) {
                        mayores[caminador] = lista[i].getNombre();
                        caminador++;
            }
        }
        
        System.out.println("Promedios altos:");     //Mostar lista de alumnos con promedios altos
        for (int i = 0; i < cont; i++) {
            System.out.println("[" + mayores[i] + "] ");
        }
    }
}
