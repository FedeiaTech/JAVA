/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2ext;

import Entidades.NIF;
import Services.NIFService;

/**
 *
 * @author iacon
 */
public class Ejercicio2Ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService ns = new NIFService();
        
        NIF p = ns.crearNif();
        ns.mostrar(p);
        
    }
    
}
