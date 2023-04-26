/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador1;

import Entidad.Estudiante;
import Services.EstudianteService;

/**
 *
 * @author iacon
 */
public class Integrador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteService es = new EstudianteService();
        
        Estudiante[] listaEst = es.crearEst();
        es.mostrarlista(listaEst);
        es.notasMayores(listaEst);
    }
    
}
