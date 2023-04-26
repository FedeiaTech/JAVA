/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class CadenaServicio {
    public Cadena crearFrase() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase");
        String frase = ingrese.next();
        
        return new Cadena(frase);
    }
    
    public void mostrar(Cadena p) {
        System.out.println("Frase: " + p.getFrase());
    }
    
    public void contarVocales(Cadena p) {
        String vocal;
        int cont = 0;
        
        for (int i = 0; i < p.getLongitud(); i++) {
            vocal = p.getFrase().substring(i, i+1);
            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {
            cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales");
    }
    
    public void invertirFrase(Cadena p) {
        String letra;
        String fraseI = "";
        
        for (int i = p.getLongitud()-1; i > (-1); i--) {
            letra = p.getFrase().substring(i, i+1);
            fraseI = fraseI + letra;
            
        }
        System.out.println("Frase invertida: " + fraseI);
    }
}
