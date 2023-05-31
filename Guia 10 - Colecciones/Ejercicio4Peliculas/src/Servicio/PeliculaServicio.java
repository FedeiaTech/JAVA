/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import static Utilidades.Utilidades.ordenarDirector;
import static Utilidades.Utilidades.ordenarDuracionMayor;
import static Utilidades.Utilidades.ordenarDuracionMenor;
import static Utilidades.Utilidades.ordenarTitulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class PeliculaServicio {

    Scanner sc;

    private List<Pelicula> listaPelis;

    public PeliculaServicio() {
        listaPelis = new ArrayList<>();
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Pelicula crearPelicula() {

        System.out.println("Ingrese el titulo");
        String titulo = sc.next();
        System.out.println("Ingrese el director");
        String director = sc.next();
        System.out.println("Ingrese la duracion");
        Double duracion = sc.nextDouble();

        return new Pelicula(titulo, director, duracion);

    }

    public void agregarPeli() {

        listaPelis.add(crearPelicula());

    }

    public void mostrarLista() {

        for (Pelicula aux : listaPelis) {
            System.out.println(aux.toString());
        }

    }

    public void mostrarDuracion1Hr() {

        for (Pelicula aux : listaPelis) {
            if (aux.getDuracion() > 1.0) {
                System.out.println(aux);
            }

        }
    }

    //metodo Esteban
    public void ordenarPeliculasPorDuracionDescendente() {
        Collections.sort(listaPelis, (Pelicula pelicula1, Pelicula pelicula2)
                -> Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion()));

        System.out.println("Lista de películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : listaPelis) {
            System.out.println(pelicula);
        }
    }
    
    

    public void ordenarDurMayor() {

//        Collections.sort(listaPelis, ordenarDuracionMayor);
        listaPelis.sort(ordenarDuracionMayor);

    }

    public void ordenarDurMenor() {
        
        listaPelis.sort(ordenarDuracionMenor);
    }

    public void ordenTitulo() {

        listaPelis.sort(ordenarTitulo);
    }

    public void ordenDirector() {
        listaPelis.sort(ordenarDirector);
    }

    public void mostrarOrden() {
        //ordenarPeliculasPorDuracionDescendente();
        System.out.println("Lista de peliculas ordenadas de mayor a menor (duracion)");
        ordenarDurMayor();
        mostrarLista();
        System.out.println("Lista de peliculas ordenadas de menor a mayor (duracion)");
        ordenarDurMenor();
        mostrarLista();
        System.out.println("Lista de peliculas ordenadas por titulo");
        ordenTitulo();
        mostrarLista();
        System.out.println("Lista de peliculas ordenadas por director");
        ordenDirector();
        mostrarLista();
    }

}
