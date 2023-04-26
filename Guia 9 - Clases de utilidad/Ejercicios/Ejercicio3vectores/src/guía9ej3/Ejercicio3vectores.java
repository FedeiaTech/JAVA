
package guía9ej3;

import guía9ej3.servicio.ArregloServicio;


public class Ejercicio3vectores {

    public static void main(String[] args) {
       /*Clase Arrays
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
        Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
        Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
*/
   double[] vectorA = new double[50];
   double[] vectorB = new double[20];
   
   ArregloServicio v = new ArregloServicio();
   
   v.inicializarA(vectorA);
        System.out.println("Vector A:");
   v.mostrar(vectorA);
   v.ordenar(vectorA);
   v.inicializarB(vectorB, vectorA);
        System.out.println("Vector A ordenado:");
   v.mostrar(vectorA);
        System.out.println("Vector B de 20 primeros elem de A sobre");
   v.mostrar(vectorB);
   }
    
}
