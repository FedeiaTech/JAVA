/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class RaicesServicios {

    public Raices crear() {
        Scanner ingrese = new Scanner(System.in);

        System.out.println("Ingrese el valor de 'a'");
        double a = ingrese.nextDouble();
        System.out.println("Ingrese el valor de 'b'");
        double b = ingrese.nextDouble();
        System.out.println("Ingrese el valor de 'c'");
        double c = ingrese.nextDouble();

        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices d) {
        double dis = (Math.pow(d.getB(), 2) - 4 * d.getA() * d.getC());
        return dis;
    }

    public boolean tieneRaices(Raices d) {
        boolean tieneR;
        if (getDiscriminante(d) >= 0) {
            tieneR = true;
        } else {
            tieneR = false;
        }
        return tieneR;
    }

    public boolean tieneRaiz(Raices d) {
        boolean tieneR;
        if (getDiscriminante(d) == 0) {
            tieneR = true;
        } else {
            tieneR = false;
        }
        return tieneR;
    }

    public void obtenerRaices(Raices d) {
        System.out.println("Las posibles soluciones son:");
        System.out.println("x1: " + ((-d.getB() + Math.sqrt(getDiscriminante(d))) / (2 * d.getA())));
        System.out.println("x2: " + ((-d.getB() - Math.sqrt(getDiscriminante(d))) / (2 * d.getA())));
    }

    public void obtenerRaiz(Raices d) {
        System.out.println("La unica solucion es: " + (-d.getB()) / (2 * d.getA()));
    }

    public void calcular(Raices d) {
        System.out.println("El discriminante es: " + this.getDiscriminante(d));
        if (!this.tieneRaices(d) && tieneRaiz(d) == false) {
            System.out.println("no tiene ninguna raiz");
        } else if (tieneRaices(d)) {
            this.obtenerRaices(d);
        } else if (tieneRaiz(d)) {
            this.obtenerRaiz(d);
        }
    }
}
