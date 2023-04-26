/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4date;

import Services.FechaService;
import java.util.Date;

/**
 *
 * @author iacon
 */
public class Ejercicio4Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        
        Date dm = new Date();
        
        dm = fs.fechaNacimiento();
        Date fa = fs.fechaActual();
        
        System.out.println("La edad es: " + fs.diferencia(fa, dm));
    }
    
}
