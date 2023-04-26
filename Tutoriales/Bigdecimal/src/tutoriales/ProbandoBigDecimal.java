/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *  En esta clase cargamos la libreria de BigDecimal y RoundingMode
 * probamos el promedio de dos variables, una asignada en el algoritmo y otra
 * cargada desde la consola.
 * 
 * CONCEPTO
 * La clase BigDecimal en Java se utiliza para representar números decimales 
 * con una precisión arbitraria. A diferencia de los tipos primitivos float y 
 * double en Java, que tienen una precisión limitada y pueden dar lugar a errores 
 * de redondeo, BigDecimal permite una precisión arbitraria, lo que lo hace ideal 
 * para cálculos financieros, científicos y matemáticos precisos.
 * 
 * La clase BigDecimal proporciona métodos para realizar operaciones matemáticas
 * como suma, resta, multiplicación y división, así como para calcular el valor 
 * absoluto, la raíz cuadrada, el logaritmo y otras funciones matemáticas comunes.
 * 
 * Además, la clase BigDecimal también admite la especificación de un modo de 
 * redondeo para controlar cómo se deben redondear los resultados de las operaciones
 * matemáticas. Esto es importante para garantizar que los cálculos sean precisos
 * y estén de acuerdo con las convenciones establecidas para el tipo de cálculo 
 * que se está realizando.
 * 
 * En resumen, la clase BigDecimal se utiliza para realizar cálculos precisos 
 * que requieren una precisión decimal arbitraria y un control preciso sobre el 
 * modo de redondeo de los resultados de los cálculos.
 * 
 * DECLARACION
 * la declaracion de una variable BigDecimal es <BigDecimal variable> 
 * 
 * EJEMPLO DE OPERACION CON BIGDECIMAL Y ROUNDINGMODE
 * <BigDecimal promedio = medida1.add(medida3).divide(new BigDecimal("2"), 5, RoundingMode.HALF_UP);>
 * 
 * <BigDecimal promedio>: esto crea un objeto BigDecimal llamado promedio que
 * almacenará el resultado del promedio.
 * <medida1.add(medida2)>: esto suma los dos objetos BigDecimal medida1 y medida2
 * para obtener la suma total de las medidas.
 * <.divide(new BigDecimal("2"), 5, RoundingMode.HALF_UP)>: esto divide la suma total
* de las medidas entre 2 para obtener el promedio, con una precisión de 5 decimales
* y utilizando el modo de redondeo RoundingMode.HALF_UP.
* 
 * @author iacon
 */
public class ProbandoBigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingrese = new Scanner(System.in);
        
        BigDecimal medida3 = ingrese.nextBigDecimal();
        BigDecimal medida1 = new BigDecimal("100.67890");
        BigDecimal medida2 = new BigDecimal("200.43210");

        BigDecimal promedio = medida1.add(medida2).divide(new BigDecimal("2"), 5, RoundingMode.HALF_UP);
        //suma las dos primeras medidas, las divide por 2 y redonde para arriba con una precision de 5 decimales
        
        BigDecimal promedio2 = promedio.add(medida3).divide(new BigDecimal("2"), 5, RoundingMode.HALF_UP);
        // suma el promedio anterior con la 3er medida y la divide 2, establece una precisión de 5 decimales y redondea hacia arriba

        BigDecimal promedioRedondeado = promedio2.setScale(2, RoundingMode.HALF_UP);
        // redondea el resultado a 2 decimales y redondea hacia arriba

        System.out.println("El promedio de las medidas es: " + promedioRedondeado);
    }
}
// Ejecutar algoritmo y cargar el numero 100 en la tercer variable para ver un 
// promedio de 125 con dos digitos de precision