/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.util.Scanner;

/** 
 *
 * @author iacon
 */
public class Libro {
     // atributos
    public String ISBN;
    public String titulo;
    public String autor;
    public int paginas;
    
    // constructores
    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }
    
    //metodos

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void cargar(){
        Scanner ingrese = new Scanner(System.in);
        System.out.println("Ingrese ISBN");
        ISBN = ingrese.next();
        System.out.println("Ingrese titulo");
        titulo = ingrese.next();
        System.out.println("Ingrese autor");
        autor = ingrese.next();
        System.out.println("Ingrese numero de paginas");
        paginas = ingrese.nextInt();
    }

    //toString para mostrar datos
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    
    
}
