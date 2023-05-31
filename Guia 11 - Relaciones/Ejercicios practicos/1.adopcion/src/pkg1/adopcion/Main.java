package pkg1.adopcion;

import Servicio.ServicioMascota;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class Main {

    public static void main(String[] args) {
        ServicioMascota sm = new ServicioMascota();
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        boolean opcion = false;

        sm.menuPerros();
        do {
            sm.crearPersona();
            sm.mostrarListaAdoptantes();

            System.out.println("Los nuevos perros disponibles son:");
            sm.mostrarPerrosDisponibles();

            System.out.println("Desea generar otra adopcion? s/n");
            String rta = ingrese.nextLine();
            if (rta.equalsIgnoreCase("n")) {
                opcion = true;
            }
        } while (!opcion);
        
        sm.mostrarPerrosDisponibles();
    }

}
