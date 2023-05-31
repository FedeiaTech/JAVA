/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 *
 * @author iacon
 */
public class Ej01y02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perros = new ArrayList<>();

        String cond;
        do {
            System.out.println("Ingrese la raza del perro");
            perros.add(ingrese.next());
            System.out.println("desea agregar otro perro?(s/n)");
            cond = ingrese.next();

        } while (cond.equalsIgnoreCase("s"));

        //Forma 1 de recorrer, for i
        //for (int i = 0; i < razaPerro.size(); i++) {
        //System.out.println(razaPerro.get(i));
        //}
        
        //Forma 2 de recorrer, for each
        /* for (String elemento : razaPerro) {
            elemento = elemento +"A";
            System.out.println(elemento);
        }*/
        
        //Forma 3 de recorrer(toString)
        System.out.println(perros.toString());      //muestra el array list
        
        //Forma 4, for each como metodo
        perros.forEach((aux) -> {
            System.out.println("Raza: " + aux);
        });
        
        /*Ejercicio 2*/
        //Forma 3 de recorrer. uso del Iterator
        Iterator<String> it = perros.iterator();

        System.out.println("Ingrese la raza a buscar");
        String raza = ingrese.next();
        boolean esta = false;

        while (it.hasNext()) {
            //Forma A del iterator con variable asignada
            //String aux = it.next(); 
            // if (aux.equalsIgnoreCase(razaBus)) {
            // esta = true;
            //   it.remove();
            //}
            
            // En lugar del anterior, hacemos el siguiente para no definir aux
            if (it.next().equalsIgnoreCase(raza)) { //de esta forma se acceden a varia funciones del iterator
                esta = true;
                it.remove();
            }
        }

        if (esta) {
            System.out.println("El perro se elimino");

        } else {
            System.out.println("El perro no existe");
        }
        System.out.println(raza.toString());
    }

}
