/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        //inicializa de CuentaBancariaServicios un nuevo objeto scb para poder
        //invocar los metodos
        CuentaBancariaServicio scb = new CuentaBancariaServicio();
        //inicializa de CuentaBancaria un nuevo objeto cb
        CuentaBancaria cb = new CuentaBancaria();
        int opcion;

        do {
            System.out.println("-----------------------");
            System.out.println("MENU");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Extraccion rapida");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar datos");
            System.out.println("7. Salir");
            System.out.println("-----------------------");
            System.out.print("_");
            System.out.println(cb.toString());
            opcion = ingrese.nextInt();

            switch (opcion) {
                case 1:
                    cb = scb.crearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese monto a depositar");
                    double monto = ingrese.nextDouble();
                    scb.ingresarDinero(cb, monto);
                    break;
                case 3:
                    System.out.println("Ingrese monto a retirar");
                    double retiro = ingrese.nextDouble();
                    scb.retirarDinero(cb, retiro);
                    break;
                case 4:
                    scb.extraccionRapida(cb);
                    break;
                case 5:
                    scb.consultarSaldo(cb);
                    break;
                case 6:
                    scb.consultarDatos(cb);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
            }
        } while (opcion != 7);
    }
}
