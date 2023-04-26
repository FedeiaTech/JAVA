/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author iacon
 */
public class Persona {
    // atributos
    public String nombre;
    public String apellido;
    public int edad;
    public boolean mayor;
    
    // constructores
    public Persona(String nombre, String apellido, int edad, boolean mayor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mayor = mayor;
    }
    
    public Persona() {
    }

    // métodos propios
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMayor() {
        return mayor;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }
    
    

}
