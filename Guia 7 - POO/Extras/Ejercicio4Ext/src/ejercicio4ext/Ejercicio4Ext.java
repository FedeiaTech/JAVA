/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4ext;

import Entidad.Cuenta;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
 * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
 * negativo después de realizar una transacción de retiro.
 * @author iacon
 */
public class Ejercicio4Ext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta dinero = new Cuenta();
        
        dinero.setSaldo(1000);
        dinero.setTitular("Carlos Villanueva");
        
        System.out.println(dinero.getTitular());
        System.out.println("su saldo: " + dinero.getSaldo());
        
        dinero.retirar_dinero();
    }
    
}
