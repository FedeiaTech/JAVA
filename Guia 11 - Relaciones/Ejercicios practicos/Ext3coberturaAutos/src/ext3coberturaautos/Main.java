package ext3coberturaautos;

import Servicio.ServicioPoliza;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        ServicioPoliza sp = new ServicioPoliza();
        
        
        int opcion;
        do {
            
            System.out.println("LA TERCERA SEGUROS");
            System.out.println("");
            System.out.println("1. Crear poliza nueva");
            System.out.println("2. Ver polizas");
            System.out.println("*. Salir");
            
            opcion = ingrese.nextInt();
            
            switch (opcion) {
                case 1:
                    sp.crearPolizaNueva();
                    break;
                case 2:
                    sp.verPolizas();
                    break;
                default:
                    break;
            }
        } while (opcion > 0 || opcion < 2);
    }
    
}
