/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author iacon
 */
public class AhorcadoService {
    
    public Ahorcado crearJuego() {
        
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la palabra a buscar");
        String p = ingrese.next();
        
        String[] palabra = new String[p.length()];
        
        for (int i = 0; i < p.length(); i++) {
            palabra[i] = p.substring(i, i+1);
        }
        
        System.out.println("Cantidad de jugadas maximas:");
        int cantMax = ingrese.nextInt();
        
        int letrasEnc = 0;
        
        return new Ahorcado(palabra, letrasEnc, cantMax);
    }
    
    public void longitud(Ahorcado palabra) {
        int longitud = palabra.getPalabra().length;
        System.out.println("Es una palabra de " + longitud + " letras");
    }
    
    public void buscar(Ahorcado j1, String letra) {
        boolean esta = false;
        for (int i = 0; i < j1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(j1.getPalabra()[i])) {
                esta = true;
            }
        }
        if (esta) {
            System.out.println("Esa letra esta en la palabra");
            } else {
                System.out.println("Esa letra no esta");
        }
    }
    
    public boolean encontradas(Ahorcado j1, String letra) {
        boolean encontrar = false;
        for (int i = 0; i < j1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(j1.getPalabra()[i])) {
                j1.setLetrasEnc(j1.getLetrasEnc()+1);
                encontrar = true;
            }
        }
        System.out.println("Hay " + j1.getLetrasEnc() + " letras encontradas");
        System.out.println("Falta encontrar " + (j1.getPalabra().length - j1.getLetrasEnc()) + " letra(s)");
        return encontrar;
    }
    
    public void intentos(Ahorcado j1, String letra) {
        if (!this.encontradas(j1, letra)) {
                j1.setCantMax(j1.getCantMax()-1);
            }
        System.out.println("Le queda " + j1.getCantMax() + " intentos");
    }
    
    public void juego() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");
        
        Ahorcado j1 = this.crearJuego();
        
        this.longitud(j1);
        String letra;
        
        do {
            System.out.println("Ingrese una letra");
            letra = ingrese.next();
            this.buscar(j1, letra);
            
            this.intentos(j1, letra);
        } while (j1.getLetrasEnc() < j1.getPalabra().length && j1.getCantMax() > 0);
        
        if(j1.getLetrasEnc() == j1.getPalabra().length) {
            System.out.println("GANASTE!");
        } else if (j1.getCantMax() == 0) {
            System.out.println("Perdiste, te ahorcaron");
        }
        
    }
}
