/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Libreria.Libro;
import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
 * Título, Autor, Número de páginas, y un constructor con todos los atributos 
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un 
 * libro pidiendo los datos al usuario y luego informar mediante otro método el 
 * número de ISBN, el título, el autor del libro y el número de páginas.
 * 
 * Se usa libro1 con getter y setter y libro2 con llamado de metodos.
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        
        System.out.println("Ingrese ISBN");
        libro1.setISBN(ingrese.next());
        System.out.println("Ingrese titulo");
        libro1.setTitulo(ingrese.next());
        System.out.println("Ingrese autor");
        libro1.setAutor(ingrese.next());
        System.out.println("Ingrese numero de paginas");
        libro1.setPaginas(ingrese.nextInt());
        
        System.out.println(libro1.getISBN());
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getPaginas());

        libro2.cargar();
        System.out.println(libro2.toString());
    }
    
}
