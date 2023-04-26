/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class CuentaBancariaServicio {

    Scanner ingrese = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        Random random = new Random();

        int cuenta = random.nextInt(100000);
        System.out.println("Ingrese DNI");
        long dni = ingrese.nextLong();
        System.out.println("Todos los clientes nuevos tendran una bonificacion de $100");
        double saldo = 100;
        return new CuentaBancaria(cuenta, dni, saldo);
    }

    public void ingresarDinero(CuentaBancaria cb, double ingreso) {
        cb.setSaldoActual(cb.getSaldoActual() + ingreso);
        System.out.println("Deposito realizado");
    }

    public void retirarDinero(CuentaBancaria cb, double retiro) {
        cb.setSaldoActual(cb.getSaldoActual() - retiro);
        System.out.println("Extraccion correcta");
    }
    
    public void extraccionRapida(CuentaBancaria cb) {
        System.out.println("Extraccion rapida");
        System.out.println("-ingrese un monto no mayor al 20%");
        double extraer;
        extraer = ingrese.nextDouble();
        if (extraer > cb.getSaldoActual()*0.2) {
            System.out.println("El monto supera el 20%, ingrese otro valor");
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - extraer);
            System.out.println("Extraccion correcta");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo actual es de " + cb.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("Cuenta numero: " + cb.getNumeroCuenta()
        + "DNI numero: " + cb.getDniCliente());
    }
}
