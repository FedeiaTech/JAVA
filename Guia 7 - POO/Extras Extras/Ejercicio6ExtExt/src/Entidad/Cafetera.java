/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author iacon
 */
public class Cafetera {

    private int capMax, capActual;

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }

    public Cafetera() {
    }

    public Cafetera(int capMax, int capActual) {
        this.capMax = capMax;
        this.capActual = capActual;
    }

    public void llenarCafetera() {
        capActual = capMax;
        System.out.println("La cafetera se lleno en su capacidad maxima");
    }

    public void servirTaza(int taza) {
        if (taza > capActual) {
            taza = capActual;
            System.out.println("La taza no se llenó, quedo en " + taza + " ml");
            capActual = 0;
        } else {
            capActual -= taza;
            System.out.println("La taza se llenó");
        }

    }

    public void vaciarCafetera() {
        capActual = 0;
        System.out.println("Se vació la cafetera");
    }

    public void agregarCafe(int cantidad) {
        capActual += cantidad;
        if (capActual > capMax) {
            System.out.println("La cantidad de cafe excedio la capacidad Maxima");
            capActual = capMax;
        } else {
            System.out.println("Se llenó con exito");
        }
    }

}
