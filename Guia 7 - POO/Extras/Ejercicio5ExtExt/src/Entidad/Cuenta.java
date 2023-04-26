/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * 
 * @author iacon
 */
public class Cuenta {
    private int cuenta;
    private long dni;
    private double saldoactual;

    public Cuenta() {
    }

    public Cuenta(int cuenta, long dni, double saldoactual) {
        this.cuenta = cuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }
    
    public void ingresar(double ingreso) {
        saldoactual = saldoactual + ingreso;
    }
    
    public void retirar(double retiro) {
        Scanner ingrese = new Scanner(System.in);
        if (retiro > saldoactual) {
            System.out.println("Saldo insuficiente");
            System.out.println("Ingrese el valor a retirar");
            retirar(ingrese.nextDouble());
        } else {
            saldoactual = saldoactual - retiro;
            System.out.println("Saldo actual: " + saldoactual);
        }
    }
    
    public void extraccionRapida (double retiroR) {
        Scanner ingrese = new Scanner(System.in);
        if (retiroR > saldoactual*0.2) {
            System.out.println("El valor supera el 20%");
            System.out.println("Ingrese el valor a retirar");
            retirar(ingrese.nextDouble());
        } else {
            saldoactual = saldoactual - retiroR;
            System.out.println("Saldo actual: " + saldoactual);
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cuenta=" + cuenta + ", dni=" + dni + ", saldoactual=" + saldoactual + '}';
    }
    
    
}
