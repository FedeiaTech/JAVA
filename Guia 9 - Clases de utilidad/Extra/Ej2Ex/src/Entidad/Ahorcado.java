/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author iacon
 */
public class Ahorcado {
    private String[] palabra;
    private int letrasEnc;
    private int cantMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEnc, int cantMax) {
        this.palabra = palabra;
        this.letrasEnc = letrasEnc;
        this.cantMax = cantMax;
    }

        public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEnc() {
        return letrasEnc;
    }

    public void setLetrasEnc(int letrasEnc) {
        this.letrasEnc = letrasEnc;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }
}
