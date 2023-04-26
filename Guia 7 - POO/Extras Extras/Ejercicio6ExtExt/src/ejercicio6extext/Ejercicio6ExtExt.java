/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6extext;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio6ExtExt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        Scanner leer = new Scanner(System.in);
        int opcion;
       
        do{
            System.out.println("Ingrese la opcion");
            System.out.println("1. Ingrese datos de la cafetera");
            System.out.println("2. Llenar Cafetera");
            System.out.println("3. Servir taza");
            System.out.println("4. Vaciar Cafetera");
            System.out.println("5. Agregar Café");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.println(c1.getCapActual() + "/" + c1.getCapMax());
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese capacidad Máxima(ml)");
                    c1.setCapMax(leer.nextInt());
                    System.out.println("Ingrese contenido Actual(ml)");
                    c1.setCapActual(leer.nextInt());
                    break;
                case 2:
                    c1.llenarCafetera();
                    break;
                case 3:
                    System.out.println("Ingrese tamaño de la taza(ml)");
                    c1.servirTaza(leer.nextInt());
                    break;
                case 4:
                    c1.vaciarCafetera();
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de Cafe(ml)");
                    c1.agregarCafe(leer.nextInt());
                    break;
                case 6:
                    break;
                 default:
                    System.out.println("Error: Ingrese una opcion valida (1-6)");
            }
        }while(opcion !=6);
    }
}