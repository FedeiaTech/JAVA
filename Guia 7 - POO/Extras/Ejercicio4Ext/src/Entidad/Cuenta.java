/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 *
 * @author iacon
 */
public class Cuenta {

    public int saldo;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        Scanner ingrese = new Scanner(System.in);

        int retirar;
        boolean aprobar = true;

        do {
            System.out.println("cuanto dinero desea retirar?");
            retirar = ingrese.nextInt();

            if (retirar > saldo) {
                System.out.println("usted no posee esa cantidad");
                System.out.println("Saldo: " + saldo);
                System.out.println("");
            } else {
                saldo = saldo - retirar;
                System.out.println("Saldo: " + saldo);
                System.out.println("");
            }
        } while (aprobar);
    }
}
