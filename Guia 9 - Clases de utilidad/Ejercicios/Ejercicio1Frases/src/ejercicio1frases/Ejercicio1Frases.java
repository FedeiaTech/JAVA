/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1frases;

import Entidades.Cadena;
import Service.CadenaServicio;

/**
 *
 * @author iacon
 */
public class Ejercicio1Frases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        
        Cadena f1 = cs.crearFrase();
        cs.mostrar(f1);
        cs.contarVocales(f1);
        cs.invertirFrase(f1);
    }
    
}
