/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pardenumeros;

import Entidades.ParDeNumeros;
import Services.ParDeNumerosService;

/**
 *
 * @author iacon
 */
public class Ejercicio2ParDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ParDeNumerosService spdn = new ParDeNumerosService();
       
       ParDeNumeros numero = spdn.crearNumeros();
       spdn.mostrarValores(numero);
       System.out.println(spdn.devolverMayor(numero));
       spdn.calcularPotencia(numero);
       spdn.calculaRaiz(numero);
    }
    
}
