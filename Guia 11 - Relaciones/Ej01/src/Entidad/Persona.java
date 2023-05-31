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
    private String nombre;
    private String apellido;
    private DNI dni;

    public Persona() {
    }
    
    public DNI getDNI(){
        return dni;
    }
    
    public void setDNI(DNI dni) {
        this.dni = dni;
    }
}
