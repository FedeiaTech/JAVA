/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class FechaService {
    Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento() {
        
        System.out.println("Ingrese dia de nacimiento");
        int dia = ingrese.nextInt();
        System.out.println("Ingrese mes");
        int mes = ingrese.nextInt();
        System.out.println("Ingrese año");
        int anio = ingrese.nextInt();
        
        return new Date(anio, mes, dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date actual, Date nacimiento) {
        int dif;
        return dif = (1900 + actual.getYear() - nacimiento.getYear());
    }
}
