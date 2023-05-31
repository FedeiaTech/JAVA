/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iacon
 */
public class Equipo {
    private List<Jugador> jugadores;

    public Equipo() {
//        jugadores = new ArrayList<>();
    }

    public Equipo(List<Jugador> equipo) {
        this.jugadores = equipo;
    }

    public List<Jugador> getEquipo() {
        return jugadores;
    }

    public void setEquipo(List<Jugador> equipo) {
        this.jugadores = equipo;
    }
}
