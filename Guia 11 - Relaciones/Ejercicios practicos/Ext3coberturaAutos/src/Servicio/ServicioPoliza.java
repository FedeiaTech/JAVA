package Servicio;

import Entidad.Auto;
import Entidad.Cliente;
import Entidad.Poliza;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iacon
 */
public class ServicioPoliza {
    List<Poliza> listaPolizas = new ArrayList<>();
    
    public void crearPolizaNueva() {
        Poliza poliza = new Poliza();
        listaPolizas.add(poliza.crearPoliza()) ;
        
    }
    
    public void verPolizas() {
        for (Poliza aux : listaPolizas) {
//            System.out.println(aux.);
        }
    }
    
    
}
