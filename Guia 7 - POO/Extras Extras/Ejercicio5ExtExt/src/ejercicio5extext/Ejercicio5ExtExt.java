/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extext;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio5ExtExt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        Cuenta usuario = new Cuenta(1253, 14154585, 1000);

        int opcion;
        do {
            System.out.println("Ingrese la opcion");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Extraccion");
            System.out.println("3. Extraccion rapida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            System.out.println("");
            opcion = ingrese.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el valor a depositar");
                    usuario.ingresar(ingrese.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar");
                    usuario.retirar(ingrese.nextDouble());
                    break;
                case 3:
                    System.out.println("Extraccion rapida");
                    System.out.println("Cuanto desea extraer?");
                    usuario.extraccionRapida(ingrese.nextDouble());
                    break;
                case 4:
                    System.out.println("Saldo actual: " + usuario.getSaldoactual());
                    break;
                case 5:
                    System.out.println(usuario.toString());
                    break;
                case 6:
                    System.out.println("Gracias por usar los servicios del banco");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 6);

    }

}
