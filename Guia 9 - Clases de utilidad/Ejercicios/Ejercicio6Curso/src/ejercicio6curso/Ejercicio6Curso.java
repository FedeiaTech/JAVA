/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6curso;

import Entidad.Curso;
import Service.CursoService;
import java.util.Arrays;

/**
 *
 * @author iacon
 */
public class Ejercicio6Curso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        
        Curso c1 = cs.crearCurso();
        
        System.out.println(Arrays.toString(c1.getAlumnos()));
        
        cs.calcularGananciaSemanal(c1);
        
               
    }
    
}
