/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author iacon
 */
public class Utilidades {

    public static Comparator<Pelicula> ordenarDuracionMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            if (t.getDuracion() < t1.getDuracion()) {
                return 1;
            } else if (t.getDuracion() > t1.getDuracion()) {
                return -1;
            }
            return 0;

        }
    };

    public static Comparator<Pelicula> ordenarDuracionMenor = new Comparator<Pelicula>() {
        
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            if (t.getDuracion() > t1.getDuracion()) {
                return 1;
            } else if (t.getDuracion() < t1.getDuracion()) {
                return -1;
            }
            return 0;

        }
    };

    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getDirector());

        }
    };

    

}
