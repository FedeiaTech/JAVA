/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.ParDeNumeros;

/**
 *
 * @author iacon
 */
public class ParDeNumerosService {
    public ParDeNumeros crearNumeros() {
        return new ParDeNumeros();
    }
    
    public void mostrarValores(ParDeNumeros num) {
        
        System.out.println("Numero 1: " + num.getNum1());
        System.out.println("Numero 2: " + num.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros num){
        double mayor;
        return mayor = Math.max(num.getNum1(), num.getNum2());
        
    }
    
    public void calcularPotencia(ParDeNumeros p) {
       double menor, mayor, potencia;
        
       mayor = Math.round(devolverMayor(p));
       menor = Math.round(Math.min(p.getNum1(), p.getNum2()));
       potencia = Math.pow((mayor), (menor));
       System.out.println(mayor + "^" + menor + ": " + potencia);
    }
    
    public void calculaRaiz(ParDeNumeros p) {
        double menor, mayor, raiz;
        
       mayor = (Math.round(devolverMayor(p)));
       menor = Math.abs(Math.min(p.getNum1(), p.getNum2()));
       raiz = Math.sqrt(menor);
       System.out.println("La raiz del menor(" + menor + ") es: " + raiz);
    }
}
