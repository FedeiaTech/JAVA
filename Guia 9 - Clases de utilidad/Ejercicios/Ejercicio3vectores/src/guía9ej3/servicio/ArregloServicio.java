package guía9ej3.servicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArregloServicio {

    /*Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
        Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.*/

    public void inicializarA(double vectorA[]) {
        Random random = new Random();
        
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = random.nextInt(100);
        }

//    Arrays.fill(vectorA, Math.random()*100);
    }

    public void mostrar(double vectorA[]) {
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println();
//      
    }

    public void ordenar(double vectorA[]) {
        Arrays.sort(vectorA);
        double[] vectorX = new double[50];

//        for (int i = vectorA.length-1; i >= 0; i--) {
//            vectorX[i] = vectorA[i];
//            System.out.print("[" + vectorA[i] + "]");
//        }
        for (int i = 0; i < vectorA.length / 2; i++) {
            double aux = vectorA[i];
            vectorA[i] = vectorA[vectorA.length - 1 - i];
            vectorA[vectorA.length - 1 - i] = aux;
        }
    }

    public void inicializarB(double vectorB[], double vectorA[]) {
        System.arraycopy(vectorA, 0, vectorB, 0, 9);
        Arrays.fill(vectorB, 10, vectorB.length, 0.5);
    }

}
