/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 */
package Serivcios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);
    
    public void setearCafetera(Cafetera c1, int set){
        c1.setCapacidadMaxima(set);
    }

    public void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La cafetera se lleno");
    }

    public void servirTaza(Cafetera c1, int taza) {
        if (c1.getCantidadActual() == 0) {
            System.out.println("La cafetera esta vacia");
        } else if (taza > c1.getCantidadActual()) {
            System.out.println("La cafetera ahora esta vacia. La taza tiene" + c1.getCantidadActual());
            c1.setCantidadActual(0);
        } else {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("La taza se lleno");
        }
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
        System.out.println("La cafetera se vacio");
    }
    
    public void agregarCafe(Cafetera c1, int cantidad){
        if ((c1.getCantidadActual()+cantidad)<=c1.getCapacidadMaxima()){
            c1.setCantidadActual(c1.getCantidadActual() + cantidad);  
        }else {
            System.out.println("La cantidad que quiere agregar supera la cantidad maxima");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }
    }
    
    public void verCantidad(Cafetera c1){
        System.out.println("    " + c1.getCantidadActual() + "/" + c1.getCapacidadMaxima());
    }
}
